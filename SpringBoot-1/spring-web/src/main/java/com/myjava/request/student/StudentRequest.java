package com.myjava.request.student;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

public class StudentRequest{
    @NotBlank(message = "学生姓名不能为空")
    @Size(min = 2, max = 6, message = "账号长度2-6")
    private String stuName;

    @NotNull(message = "性别不能为空")
    private Boolean stuSex;

    @NotBlank(message = "学号不能为空")
    @Size(min = 10, max = 10, message = "学号长度10")
    private String stuNo;

    @NotBlank(message = "学生年级不能为空")
    @Size(min = 2, max = 6, message = "学生年级长度2-6")
    private String stuGrade;

    @NotNull(message = "学生班级不能为空")
    @Min(value = 1,message = "班级必须大于0")
    private Integer stuClass;

    @NotNull(message = "学费不能为空")
    @Min(value = 1,message = "学费必须大于0")
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
