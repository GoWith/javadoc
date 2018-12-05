package com.jd.crm.api.web.domain;

import org.springframework.data.annotation.Id;

/**
 * Create by maoyi on 2018/11/28
 * don't worry be happy!
 *
 * @author maoyi
 * @version $Id: $Id
 */
public class ApiVersionEntity {
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
     * 版本
     */
    private String version;
    /**
     * 版本描述
     */
    private String versionDescribe;
    /**
     * 修改人ERP
     */
    private String modifiedErp;
    /**
     * 修改人邮箱
     */
    private String modifiedEmail;

    /**
     * <p>Constructor for ApiVersionEntity.</p>
     */
    public ApiVersionEntity() {
    }

    /**
     * <p>Constructor for ApiVersionEntity.</p>
     *
     * @param groupId    a {@link java.lang.String} object.
     * @param artifactId a {@link java.lang.String} object.
     * @param version    a {@link java.lang.String} object.
     */
    public ApiVersionEntity(String groupId, String artifactId, String version) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
    }

    /**
     * <p>Constructor for ApiVersionEntity.</p>
     *
     * @param groupId         a {@link java.lang.String} object.
     * @param artifactId      a {@link java.lang.String} object.
     * @param version         a {@link java.lang.String} object.
     * @param versionDescribe a {@link java.lang.String} object.
     */
    public ApiVersionEntity(String groupId, String artifactId, String version, String versionDescribe) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.versionDescribe = versionDescribe;
    }

    public String getId() {
        return id;
    }

    public ApiVersionEntity setId(String id) {
        this.id = id;
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public ApiVersionEntity setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public ApiVersionEntity setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public ApiVersionEntity setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersionDescribe() {
        return versionDescribe;
    }

    public ApiVersionEntity setVersionDescribe(String versionDescribe) {
        this.versionDescribe = versionDescribe;
        return this;
    }

    public String getModifiedErp() {
        return modifiedErp;
    }

    public ApiVersionEntity setModifiedErp(String modifiedErp) {
        this.modifiedErp = modifiedErp;
        return this;
    }

    public String getModifiedEmail() {
        return modifiedEmail;
    }

    public ApiVersionEntity setModifiedEmail(String modifiedEmail) {
        this.modifiedEmail = modifiedEmail;
        return this;
    }
}
