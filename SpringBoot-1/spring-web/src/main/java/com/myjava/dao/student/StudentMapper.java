package com.myjava.dao.student;

import com.myjava.po.student.StudentPO;
import com.myjava.request.student.StudentRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface StudentMapper {

    ArrayList<StudentPO> selectAll(StudentRequest studentRequest);

    StudentPO selectOne(Long id);

    Long insert(StudentPO studentPO);

    Boolean update(StudentPO studentPO);

    Boolean delete(Long id);
}
