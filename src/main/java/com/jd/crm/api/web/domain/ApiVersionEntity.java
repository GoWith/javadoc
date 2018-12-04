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

    /**
     * <p>Getter for the field <code>versionDescribe</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getVersionDescribe() {
        return versionDescribe;
    }

    /**
     * <p>Setter for the field <code>versionDescribe</code>.</p>
     *
     * @param versionDescribe a {@link java.lang.String} object.
     */
    public void setVersionDescribe(String versionDescribe) {
        this.versionDescribe = versionDescribe;
    }

    /**
     * <p>Getter for the field <code>id</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getId() {
        return id;
    }

    /**
     * <p>Setter for the field <code>id</code>.</p>
     *
     * @param id a {@link java.lang.String} object.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>Getter for the field <code>groupId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * <p>Setter for the field <code>groupId</code>.</p>
     *
     * @param groupId a {@link java.lang.String} object.
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>Getter for the field <code>artifactId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getArtifactId() {
        return artifactId;
    }

    /**
     * <p>Setter for the field <code>artifactId</code>.</p>
     *
     * @param artifactId a {@link java.lang.String} object.
     */
    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    /**
     * <p>Getter for the field <code>version</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>Setter for the field <code>version</code>.</p>
     *
     * @param version a {@link java.lang.String} object.
     */
    public void setVersion(String version) {
        this.version = version;
    }
}
