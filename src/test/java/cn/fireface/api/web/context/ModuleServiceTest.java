package cn.fireface.api.web.context;

import cn.fireface.api.web.domain.ApiModuleEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Create by maoyi on 2018/12/5
 * don't worry be happy!
 *
 * @author maoyi
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ModuleServiceTest {
    @Autowired
    ModuleService moduleService;
    @Test
    public void save() {
    }

    @Test
    public void exist() {
    }

    @Test
    public void findQuickly() {
        List<ApiModuleEntity> crm = moduleService.findQuickly("crm");
        crm.forEach((ApiModuleEntity entity)-> System.out.println(entity.toString()));
    }
}