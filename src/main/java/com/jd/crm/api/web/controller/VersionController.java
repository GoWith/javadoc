package com.jd.crm.api.web.controller;

import com.jd.crm.api.web.context.RegisterService;
import com.jd.crm.api.web.context.VersionService;
import com.jd.crm.api.web.domain.ApiVersionEntity;
import com.jd.crm.api.web.respository.VersionMongoRepository;
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
     * @param versionEntity a {@link com.jd.crm.api.web.domain.ApiVersionEntity} object.
     * @return a {@link java.lang.String} object.
     */
    @PostMapping("/save")
    public @ResponseBody
    String save(ApiVersionEntity versionEntity) {
        versionService.save(versionEntity);
        return "SUCCESS";
    }
}
