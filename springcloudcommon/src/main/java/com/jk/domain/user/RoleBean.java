package com.jk.domain.user;

import java.io.Serializable;

public class RoleBean implements Serializable {
    /**
     * 角色主键ID
     */
    private String roleId;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     *  创建时间
     */
    private String createTime;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
