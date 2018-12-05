package com.jd.crm.api.web.controller;

import com.jd.crm.api.web.context.ModuleService;
import com.jd.crm.api.web.context.VersionService;
import com.jd.crm.api.web.domain.ApiModuleEntity;
import com.jd.crm.api.web.domain.ApiVersionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by maoyi on 2018/12/4
 * don't worry be happy!
 *
 * @author maoyi
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private final ModuleService moduleService;
    private final VersionService versionService;

    @Autowired
    public IndexController(ModuleService moduleService, VersionService versionService) {
        this.moduleService = moduleService;
        this.versionService = versionService;
    }

    @RequestMapping("/")
    public String init() {
        return "index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/search")
    public @ResponseBody List<ApiModuleEntity> search(ApiModuleEntity apiModuleEntity) {
        return moduleService.findByGroupId(apiModuleEntity.getGroupId());
    }

    @RequestMapping("/searchQuickly")
    public @ResponseBody List<ApiModuleEntity> searchQuickly(String query) {
        return moduleService.findQuickly(query);
    }

    @RequestMapping("/artifact")
    public @ResponseBody
    ModelAndView searchQuickly(ApiVersionEntity apiVersionEntity) {
        ModelAndView result = new ModelAndView("artifact");
        List<ApiVersionEntity> apiVersionEntities = versionService.findByGroupIdAndArtifactId(apiVersionEntity.getGroupId(), apiVersionEntity.getArtifactId());
        result.addObject("apiVersionEntities",apiVersionEntities);
        result.addObject("api",apiVersionEntity);
        result.addObject("test","hh");
        return result;
    }
}
