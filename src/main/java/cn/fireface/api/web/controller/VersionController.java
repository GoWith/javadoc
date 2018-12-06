package cn.fireface.api.web.controller;

import cn.fireface.api.web.context.VersionService;
import cn.fireface.api.web.domain.ApiVersionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Create by maoyi on 2018/11/28
 * don't worry be happy!
 *
 * @author maoyi
 * @version $Id: $Id
 */
@Controller
@RequestMapping("/version")
public class VersionController {

    @Autowired
    private VersionService versionService;

    /**
     * <p>init.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    @GetMapping("/init")
    public String init() {
        return "version";
    }

    /**
     * <p>save.</p>
     *
     * @param versionEntity a {@link ApiVersionEntity} object.
     * @return a {@link java.lang.String} object.
     */
    @PostMapping("/save")
    public @ResponseBody
    String save(ApiVersionEntity versionEntity) {
        versionService.save(versionEntity);
        return "SUCCESS";
    }
}
