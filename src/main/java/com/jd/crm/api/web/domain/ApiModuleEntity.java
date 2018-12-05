package com.jd.crm.api.web.domain;

import org.springframework.data.annotation.Id;

/**
 * Create by maoyi on 2018/12/5
 * don't worry be happy!
 *
 * @author maoyi
 */
public class ApiModuleEntity {
    /**
     * 主键
     */
    @Id
    private String id;
    /**
     * groupId
     */
    private String groupId;
    /**
     * artifactId
     */
    private String artifactId;

    /**
     * module 描述
     */
    private String moduleDescribe;

    /**
     * 修改人ERP
     */
    private String modifiedErp;
    /**
     * 修改人邮箱
     */
    private String modifiedEmail;


    public ApiModuleEntity() {
    }

    public ApiModuleEntity(String groupId, String artifactId, String moduleDescribe, String modifiedErp, String modifiedEmail) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.moduleDescribe = moduleDescribe;
        this.modifiedErp = modifiedErp;
        this.modifiedEmail = modifiedEmail;
    }

    public String getId() {
        return id;
    }

    public ApiModuleEntity setId(String id) {
        this.id = id;
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public ApiModuleEntity setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public ApiModuleEntity setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    public String getModuleDescribe() {
        return moduleDescribe;
    }

    public ApiModuleEntity setModuleDescribe(String moduleDescribe) {
        this.moduleDescribe = moduleDescribe;
        return this;
    }

    public String getModifiedErp() {
        return modifiedErp;
    }

    public ApiModuleEntity setModifiedErp(String modifiedErp) {
        this.modifiedErp = modifiedErp;
        return this;
    }

    public String getModifiedEmail() {
        return modifiedEmail;
    }

    public ApiModuleEntity setModifiedEmail(String modifiedEmail) {
        this.modifiedEmail = modifiedEmail;
        return this;
    }

    @Override
    public String toString() {
        return "ApiModuleEntity{" +
                "id='" + id + '\'' +
                ", groupId='" + groupId + '\'' +
                ", artifactId='" + artifactId + '\'' +
                ", moduleDescribe='" + moduleDescribe + '\'' +
                ", modifiedErp='" + modifiedErp + '\'' +
                ", modifiedEmail='" + modifiedEmail + '\'' +
                '}';
    }
}
