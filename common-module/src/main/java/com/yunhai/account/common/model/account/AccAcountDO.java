package com.yunhai.account.common.model.account;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * The table OS_ACC_ACOUNT
 * 注意:此结构有系统生成,禁止手工修改,以免被覆盖,请通过dalgen生成
 */
public class AccAcountDO {

    /**
     * id ID.
     */
    private Long id;
    /**
     * phone 手机号.
     */
    private String phone;
    /**
     * email 邮箱.
     */
    private String email;
    /**
     * password 密码.
     */
    private String password;
    /**
     * nickName 昵称.
     */
    private String nickName;
    /**
     * createTime 创建时间.
     */
    private Date createTime;
    /**
     * updateTime 更新时间.
     */
    private Date updateTime;
    /**
     * remark REMARK.
     */
    private String remark;
    /**
     * version VERSION.
     */
    private Integer version;
    /**
     * state 0：初始化；1：有效；2：禁用.
     */
    private Integer state;

    /**
     * Set id ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set phone 手机号.
     */
    public void setPhone(String phone){
        this.phone = phone;
    }

    /**
     * Get phone 手机号.
     *
     * @return the string
     */
    public String getPhone(){
        return phone;
    }

    /**
     * Set email 邮箱.
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * Get email 邮箱.
     *
     * @return the string
     */
    public String getEmail(){
        return email;
    }

    /**
     * Set password 密码.
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * Get password 密码.
     *
     * @return the string
     */
    public String getPassword(){
        return password;
    }

    /**
     * Set nickName 昵称.
     */
    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    /**
     * Get nickName 昵称.
     *
     * @return the string
     */
    public String getNickName(){
        return nickName;
    }

    /**
     * Set createTime 创建时间.
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
     * Get createTime 创建时间.
     *
     * @return the string
     */
    public Date getCreateTime(){
        return createTime;
    }

    /**
     * Set updateTime 更新时间.
     */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

    /**
     * Get updateTime 更新时间.
     *
     * @return the string
     */
    public Date getUpdateTime(){
        return updateTime;
    }

    /**
     * Set remark REMARK.
     */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * Get remark REMARK.
     *
     * @return the string
     */
    public String getRemark(){
        return remark;
    }

    /**
     * Set version VERSION.
     */
    public void setVersion(Integer version){
        this.version = version;
    }

    /**
     * Get version VERSION.
     *
     * @return the string
     */
    public Integer getVersion(){
        return version;
    }

    /**
     * Set state 0：初始化；1：有效；2：禁用.
     */
    public void setState(Integer state){
        this.state = state;
    }

    /**
     * Get state 0：初始化；1：有效；2：禁用.
     *
     * @return the string
     */
    public Integer getState(){
        return state;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
