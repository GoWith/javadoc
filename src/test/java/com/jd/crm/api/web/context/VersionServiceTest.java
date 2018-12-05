package com.jd.crm.api.web.context;

import com.jd.crm.api.web.domain.ApiVersionEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Create by maoyi on 2018/12/5
 * don't worry be happy!
 *
 * @author maoyi
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class VersionServiceTest {

    @Autowired
    VersionService versionService;

    @Test
    public void save() {
        ApiVersionEntity apiVersionEntity = new ApiVersionEntity();
        apiVersionEntity.setGroupId("com.jd.pop.crm");
        apiVersionEntity.setArtifactId("pop-crm-points-client");
        apiVersionEntity.setVersion("3.0.0-SNAPSHOT");
        apiVersionEntity.setVersionDescribe("积分中心javadoc");
        apiVersionEntity.setModifiedErp("test");
        apiVersionEntity.setModifiedEmail("test@jd.com");

        versionService.save(apiVersionEntity);
        ApiVersionEntity entity = new ApiVersionEntity();
        entity.setGroupId("com.jd.pop.crm");
        entity.setArtifactId("pop-crm-points-client");
        entity.setVersion("2.5.6-SNAPSHOT");
        entity.setVersionDescribe("积分中心javadoc");
        entity.setModifiedErp("test");
        entity.setModifiedEmail("test@jd.com");

        versionService.save(entity);
    }

    @Test
    public void findQuickly() {

    }

    @Test
    public void find() {
    }
}