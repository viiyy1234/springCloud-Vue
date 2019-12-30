package com.example.spring.cloud.system.system.sysMenu.domain;

import com.example.springcloudcommon.base.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * 菜单表
 * @author tianli
 * @version 1.0
 * @since 1.0
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
//@Entity
//@Table(name="sys_menu")
public class SysMenu extends BaseEntity<SysMenu> {

    private static final long serialVersionUID = -4323280103453388273L;
    @Id
    @Column(name="id")
    private String id;
    @Column(name="parent_id")
    private String parentId;
    @Column(name="name")
    private String name;
    @Column(name="url")
    private String url;
    @Column(name="sequence")
    private Long sequence;
    @Column(name="icon")
    private String icon;
    @Column(name="target")
    private String target;
    @Column(name="state")
    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
