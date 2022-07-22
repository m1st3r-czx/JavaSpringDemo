package com.myjava.demo.request.user;

import com.myjava.demo.request.base.BaseRequest;

import javax.validation.constraints.*;
import java.util.Date;

public class UserRequest  extends BaseRequest {
    @NotBlank(message = "账号不能为空")
    @Size(min = 4, max = 20, message = "账号长度4-20")
    private String account;

    @NotBlank(message = "用户名不能为空")
    @Size(min = 4, max = 10, message = "用户名长度4-20")
    private String userName;

    @Pattern(regexp = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$", message = "手机号格式错误")
    private String mobile;


    @Email(message = "邮箱格式不正确")
    private String email;

    @NotNull(message = "性别不能为空")
    private Boolean sex;
    private Boolean isDelete;
    private Date addTime;
    private Date updateTime;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
