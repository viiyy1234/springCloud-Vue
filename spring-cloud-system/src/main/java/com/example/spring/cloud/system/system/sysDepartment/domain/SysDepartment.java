package com.example.spring.cloud.system.system.sysDepartment.domain;

import com.example.springcloudcommon.base.base.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 部门表
 * @author tianli
 * @version 1.0
 * @since 1.0
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
//@Entity
//@Table(name="sys_department")
public class SysDepartment extends BaseEntity<SysDepartment> {

    private static final long serialVersionUID = 2362397549103836413L;

    @Id
    @Column(name="id")
    private String id;
    @Column(name="parent_id")
    private String parentId;
    @Range(min = 1, max = 100)
    @Column(name="sequence")
    private Long sequence;
    @Column(name="name")
    private String name;
    @Length(min = 6, max = 8)
    @Column(name="code")
    private String code;

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

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
