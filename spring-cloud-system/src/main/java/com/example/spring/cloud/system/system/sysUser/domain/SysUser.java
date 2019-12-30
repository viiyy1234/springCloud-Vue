package com.example.spring.cloud.system.system.sysUser.domain;

import com.example.spring.cloud.system.system.sysDepartment.domain.SysDepartment;
import com.example.springcloudcommon.base.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;

public class SysUser extends BaseEntity<SysUser> {

    private static final long serialVersionUID = -911106151917614196L;
    @Id
    @Column(name="id")
    protected String id;
    @Column(name="user_name")
    private String userName;
    @Column(name="password")
    private String password;
    @Column(name="name")
    private String name;
    @Column(name="department_id")
    private String departmentId;
    @Column(name="state")
    private String state;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
    @Column(name="head_icon")
    private String headIcon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadIcon() {
        return headIcon;
    }

    public void setHeadIcon(String headIcon) {
        this.headIcon = headIcon;
    }
}
