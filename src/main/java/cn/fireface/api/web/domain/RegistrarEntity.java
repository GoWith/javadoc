package cn.fireface.api.web.domain;


import org.springframework.data.annotation.Id;

/**
 * Create by 灰色十三月 on 2018/11/26
 * don't worry be happy!
 *
 * @author 灰色十三月
 * @version $Id: $Id
 */
public class RegistrarEntity {

    /**
     * 主键
     * packageName + className + methodName + appId
     */
    @Id
    private String id;

    /**
     * J-One的英文应用名
     */
    private String appName;
    /**
     * J-One的应用ID
     */
    private String appId;


    /**
     * 最大并发数
     */
    private Integer currentMax;
    /**
     * 每分钟最大调用量
     */
    private Integer callMaxPerMin;


    /**
     * 应用负责人ERP
     */
    private String appLeaderErp;

    /**
     * 应用负责人邮箱
     */
    private String appLeaderEmail;

    /**
     * 申请人ERP
     */
    private String applicantErp;

    /**
     * 申请人邮箱
     */
    private String applicantEmail;

    /**
     * 包名
     */
    private String packageName;
    /**
     * 类名
     */
    private String className;
    /**
     * 方法名
     */
    private String methodName;


    /**
     * <p>Getter for the field <code>appName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppName() {
        return appName;
    }

    /**
     * <p>Setter for the field <code>appName</code>.</p>
     *
     * @param appName a {@link java.lang.String} object.
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * <p>Getter for the field <code>appId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppId() {
        return appId;
    }

    /**
     * <p>Setter for the field <code>appId</code>.</p>
     *
     * @param appId a {@link java.lang.String} object.
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>Getter for the field <code>currentMax</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getCurrentMax() {
        return currentMax;
    }

    /**
     * <p>Setter for the field <code>currentMax</code>.</p>
     *
     * @param currentMax a {@link java.lang.Integer} object.
     */
    public void setCurrentMax(Integer currentMax) {
        this.currentMax = currentMax;
    }

    /**
     * <p>Getter for the field <code>callMaxPerMin</code>.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getCallMaxPerMin() {
        return callMaxPerMin;
    }

    /**
     * <p>Setter for the field <code>callMaxPerMin</code>.</p>
     *
     * @param callMaxPerMin a {@link java.lang.Integer} object.
     */
    public void setCallMaxPerMin(Integer callMaxPerMin) {
        this.callMaxPerMin = callMaxPerMin;
    }

    /**
     * <p>Getter for the field <code>packageName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * <p>Setter for the field <code>packageName</code>.</p>
     *
     * @param packageName a {@link java.lang.String} object.
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>Getter for the field <code>className</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getClassName() {
        return className;
    }

    /**
     * <p>Setter for the field <code>className</code>.</p>
     *
     * @param className a {@link java.lang.String} object.
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * <p>Getter for the field <code>methodName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * <p>Setter for the field <code>methodName</code>.</p>
     *
     * @param methodName a {@link java.lang.String} object.
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * <p>Getter for the field <code>appLeaderErp</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppLeaderErp() {
        return appLeaderErp;
    }

    /**
     * <p>Setter for the field <code>appLeaderErp</code>.</p>
     *
     * @param appLeaderErp a {@link java.lang.String} object.
     */
    public void setAppLeaderErp(String appLeaderErp) {
        this.appLeaderErp = appLeaderErp;
    }

    /**
     * <p>Getter for the field <code>appLeaderEmail</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAppLeaderEmail() {
        return appLeaderEmail;
    }

    /**
     * <p>Setter for the field <code>appLeaderEmail</code>.</p>
     *
     * @param appLeaderEmail a {@link java.lang.String} object.
     */
    public void setAppLeaderEmail(String appLeaderEmail) {
        this.appLeaderEmail = appLeaderEmail;
    }

    /**
     * <p>Getter for the field <code>applicantErp</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getApplicantErp() {
        return applicantErp;
    }

    /**
     * <p>Setter for the field <code>applicantErp</code>.</p>
     *
     * @param applicantErp a {@link java.lang.String} object.
     */
    public void setApplicantErp(String applicantErp) {
        this.applicantErp = applicantErp;
    }

    /**
     * <p>Getter for the field <code>applicantEmail</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getApplicantEmail() {
        return applicantEmail;
    }

    /**
     * <p>Setter for the field <code>applicantEmail</code>.</p>
     *
     * @param applicantEmail a {@link java.lang.String} object.
     */
    public void setApplicantEmail(String applicantEmail) {
        this.applicantEmail = applicantEmail;
    }
}
