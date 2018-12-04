package com.jd.crm.api.web.worker;

import com.jd.crm.api.web.domain.ApiVersionEntity;
import org.apache.commons.io.FileUtils;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;


/**
 * Create by maoyi on 2018/11/28
 * don't worry be happy!
 * @author maoyi
 */
public class PullJavaDocRunnable implements Runnable{
    private ApiVersionEntity apiVersionEntity;

    public PullJavaDocRunnable(ApiVersionEntity apiVersionEntity) {
        this.apiVersionEntity = apiVersionEntity;
    }

    @Override
    public void run() {

        String groupId = apiVersionEntity.getGroupId();
        String artifactId = apiVersionEntity.getArtifactId();
        String version = apiVersionEntity.getVersion();
        String url = "http://artifactory.jd.com/libs-snapshots-local";

        try {
            SAXBuilder builder = new SAXBuilder(false);
            Document document = builder.build(url+"/"+groupId.replace(".","/") +"/"+artifactId+"/"+ version +"/maven-metadata.xml");

            Element employees = document.getRootElement();
            List employeeList = employees.getChildren("versioning");
            Element snapshot = ((Element) employeeList.get(0)).getChild("snapshot");
            Element timestamp = snapshot.getChild("timestamp");
            Element buildNumber = snapshot.getChild("buildNumber");

            File dir = new File("javadoc");
            if (dir.exists() || dir.mkdir()) {
                File file = new File("javadoc" + "/" +groupId + "/" + artifactId + "/"+artifactId+"-"+ version.substring(0, version.indexOf("-"))+"-javadoc.jar");
                FileUtils.copyURLToFile(new URL(url+"/"+groupId.replace(".","/")+"/"+artifactId+"/"+ version +"/"+artifactId+"-"+ version.substring(0, version.indexOf("-"))+"-"+timestamp.getText()+"-"+buildNumber.getValue()+"-javadoc.jar"),file);
            }
        } catch (JDOMException | IOException e) {
            e.printStackTrace();
        }
    }
}
