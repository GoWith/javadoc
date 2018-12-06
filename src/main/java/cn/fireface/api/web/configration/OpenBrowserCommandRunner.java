package cn.fireface.api.web.configration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Create by 灰色十三月 on 2018/12/4
 * don't worry be happy!
 *
 * @author 灰色十三月
 */
@Component
public class OpenBrowserCommandRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
//        String cmd = "cmd /c start chrome javadoc.fireface.cn";
//        Runtime run = Runtime.getRuntime();
//        try {
//            run.exec(cmd);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
