package cn.fireface.api.web.util;

import org.apache.commons.io.FileUtils;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;

/**
 * Create by 灰色十三月 on 2018/11/27
 * don't worry be happy!
 *
 * @author 灰色十三月
 * @version $Id: $Id
 */
public class Meta {
    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects.
     * @throws java.io.IOException if any.
     * @throws org.jdom2.JDOMException if any.
     */
    public static void main1(String[] args) throws IOException, JDOMException {
        String groupId = "cn.fireface.call";
        String artifactId = "core";
        String version = "1.0-SNAPSHOT";


        File file = new File("javadoc" + "/" + artifactId + "/"+artifactId+"-"+version.substring(0,version.indexOf("-"))+"-javadoc.jar");

        JarFile jarFile = new JarFile(file);

        Enumeration<JarEntry> entries = jarFile.entries();

        while (entries.hasMoreElements()) {
            JarEntry jarEntry = entries.nextElement();
            System.out.println(jarEntry.getName());
        }

    }

    /**
     * <p>parserXml.</p>
     *
     * @param fileName a {@link java.lang.String} object.
     */
    public static void parserXml(String fileName) {
        SAXBuilder builder = new SAXBuilder(false);
        try {
            Document document = builder.build(fileName);
            Element employees = document.getRootElement();
            List employeeList = employees.getChildren("versioning");
            Element snapshot = ((Element) employeeList.get(0)).getChild("snapshot");
            Element timestamp = snapshot.getChild("timestamp");
            Element buildNumber = snapshot.getChild("buildNumber");

            String s = "http://artifactory.fireface.cn/libs-snapshots-local/cn/fireface/call/core/1.0-SNAPSHOT" +
                    "core-1.0-20181127.020929-19-javadoc.jar";
        } catch (JDOMException | IOException e) {
            e.printStackTrace();
        }
    }

}
