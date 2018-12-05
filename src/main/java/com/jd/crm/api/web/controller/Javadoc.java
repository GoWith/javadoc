package com.jd.crm.api.web.controller;

import com.jd.crm.api.web.context.RegisterService;
import com.jd.crm.api.web.domain.ApiVersionEntity;
import com.jd.crm.api.web.domain.RegistrarEntity;
import com.jd.crm.api.web.respository.RegisterMongoRepository;
import com.jd.crm.api.web.worker.PullJavaDocCallable;
import com.jd.crm.api.web.worker.PullJavaDocRunnable;
import com.jd.crm.api.web.worker.SingletonThreadPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Enumeration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * Create by maoyi on 2018/11/27
 * don't worry be happy!
 *
 * @author maoyi
 * @version $Id: $Id
 */
@RestController
@RequestMapping("/javadoc")
public class Javadoc {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private RegisterService registerService;

    /**
     * <p>exportXls.</p>
     *
     * @param artifactId a {@link java.lang.String} object.
     * @param version a {@link java.lang.String} object.
     * @return a {@link org.springframework.http.ResponseEntity} object.
     */
    @RequestMapping(value = "/{groupId}/{artifactId}/{version}/**", method = RequestMethod.GET)
    public ResponseEntity<InputStreamResource> exportXls(@PathVariable String artifactId, @PathVariable String version, @PathVariable String groupId) {
        String requestURI = request.getRequestURI();
        String url = requestURI.substring("javadoc".length()+1).substring(groupId.length()+1).substring(artifactId.length()+1).substring(version.length()+1).substring(1);
        try {
            File file = new File("javadoc" + "/" + groupId + "/" + artifactId + "/"+artifactId+"-"+version.substring(0,version.indexOf("-"))+"-javadoc.jar");
            if (!file.exists()) {
                Future<Boolean> submit = SingletonThreadPool.getThreadPoolInstance().submit(new PullJavaDocCallable(new ApiVersionEntity(groupId, artifactId, version)));
                Boolean pullSuccess = submit.get();
                if(!pullSuccess){
                    return null;
                }
            }
            JarFile jarFile = new JarFile(file);
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry jarEntry = entries.nextElement();
                String name = jarEntry.getName();
                if (name.equals(url)) {
                    InputStream inputStream = jarFile.getInputStream(jarEntry);
                    MediaType mediaType = MediaType.parseMediaType("text/html");
                    if (url.contains(".css")) {
                        mediaType = MediaType.parseMediaType("text/css");
                    }else if (url.contains(".js")){
                        mediaType = MediaType.parseMediaType("application/javascript");
                    }
                    return ResponseEntity
                            .ok()
                            .contentType(mediaType)
                            .body(new InputStreamResource(inputStream));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;

    }
}
