package com.jk.domain.user;

import java.io.Serializable;

public class UserBean implements Serializable {
    /**
     * 主键 ID
     */
    private String userId;
    /**
     * 用户名称
     */
    private String userName;
    /*
        登录账号
     */
    private String loginNumber;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 角色ID 1供应商2采购商3游客
     */
    private Integer roleId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginNumber() {
        return loginNumber;
    }

    public void setLoginNumber(String loginNumber) {
        this.loginNumber = loginNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
