package cn.fireface.api.web.worker;

import cn.fireface.api.web.domain.ApiVersionEntity;
import org.apache.commons.io.FileUtils;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Callable;


/**
 * Create by 灰色十三月 on 2018/11/28
 * don't worry be happy!
 * @author 灰色十三月
 */
public class PullJavaDocCallable implements Callable<Boolean> {
    private ApiVersionEntity apiVersionEntity;

    public PullJavaDocCallable(ApiVersionEntity apiVersionEntity) {
        this.apiVersionEntity = apiVersionEntity;
    }

    @Override
    public Boolean call() throws Exception {
        String groupId = apiVersionEntity.getGroupId();
        String artifactId = apiVersionEntity.getArtifactId();
        String version = apiVersionEntity.getVersion();
        String url = "http://artifactory.fireface.com/libs-snapshots-local";

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
                return Boolean.TRUE;
            }
        } catch (JDOMException | IOException e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }
}
