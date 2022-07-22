package com.myjava.po.student;

import com.myjava.po.base.BasePO;

import java.math.BigDecimal;
import java.util.Date;

public class StudentPO extends BasePO {
    private String stuName;
    private Boolean stuSex;
    private String stuNo;
    private String stuGrade;
    private Integer stuClass;
    private BigDecimal stuTuition;
    private Boolean isDelete;
    private Date addTime;
    private Date updateTime;
    private String remark;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Boolean getStuSex() {
        return stuSex;
    }

    public void setStuSex(Boolean stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade;
    }

    public Integer getStuClass() {
        return stuClass;
    }

    public void setStuClass(Integer stuClass) {
        this.stuClass = stuClass;
    }

    public BigDecimal getStuTuition() {
        return stuTuition;
    }

    public void setStuTuition(BigDecimal stuTuition) {
        this.stuTuition = stuTuition;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean delete) {
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
