package com.jd.crm.api.web.controller;

import com.jd.crm.api.web.context.VersionService;
import com.jd.crm.api.web.domain.ApiVersionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Create by maoyi on 2018/12/4
 * don't worry be happy!
 *
 * @author maoyi
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private final VersionService versionService;

    @Autowired
    public IndexController(VersionService versionService) {
        this.versionService = versionService;
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/search")
    public @ResponseBody List<ApiVersionEntity> search() {
        return versionService.find();
    }
}
