package com.excel.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CampsUserDetail implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column camps_user_detail.id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column camps_user_detail.detail_id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    private String detailId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column camps_user_detail.session_id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    private String sessionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column camps_user_detail.username
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column camps_user_detail.user_ip
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    private String userIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column camps_user_detail.user_mac
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    private String userMac;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column camps_user_detail.vlan_id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    private String vlanId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column camps_user_detail.user_id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column camps_user_detail.createTime
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    private LocalDateTime createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table camps_user_detail
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column camps_user_detail.id
     *
     * @return the value of camps_user_detail.id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column camps_user_detail.id
     *
     * @param id the value for camps_user_detail.id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column camps_user_detail.detail_id
     *
     * @return the value of camps_user_detail.detail_id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public String getDetailId() {
        return detailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column camps_user_detail.detail_id
     *
     * @param detailId the value for camps_user_detail.detail_id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column camps_user_detail.session_id
     *
     * @return the value of camps_user_detail.session_id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column camps_user_detail.session_id
     *
     * @param sessionId the value for camps_user_detail.session_id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column camps_user_detail.username
     *
     * @return the value of camps_user_detail.username
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column camps_user_detail.username
     *
     * @param username the value for camps_user_detail.username
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column camps_user_detail.user_ip
     *
     * @return the value of camps_user_detail.user_ip
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column camps_user_detail.user_ip
     *
     * @param userIp the value for camps_user_detail.user_ip
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column camps_user_detail.user_mac
     *
     * @return the value of camps_user_detail.user_mac
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public String getUserMac() {
        return userMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column camps_user_detail.user_mac
     *
     * @param userMac the value for camps_user_detail.user_mac
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public void setUserMac(String userMac) {
        this.userMac = userMac == null ? null : userMac.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column camps_user_detail.vlan_id
     *
     * @return the value of camps_user_detail.vlan_id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public String getVlanId() {
        return vlanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column camps_user_detail.vlan_id
     *
     * @param vlanId the value for camps_user_detail.vlan_id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public void setVlanId(String vlanId) {
        this.vlanId = vlanId == null ? null : vlanId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column camps_user_detail.user_id
     *
     * @return the value of camps_user_detail.user_id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column camps_user_detail.user_id
     *
     * @param userId the value for camps_user_detail.user_id
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column camps_user_detail.createTime
     *
     * @return the value of camps_user_detail.createTime
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public LocalDateTime getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column camps_user_detail.createTime
     *
     * @param createtime the value for camps_user_detail.createTime
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table camps_user_detail
     *
     * @mbg.generated Wed Apr 28 10:54:23 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", detailId=").append(detailId);
        sb.append(", sessionId=").append(sessionId);
        sb.append(", username=").append(username);
        sb.append(", userIp=").append(userIp);
        sb.append(", userMac=").append(userMac);
        sb.append(", vlanId=").append(vlanId);
        sb.append(", userId=").append(userId);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}