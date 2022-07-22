package com.myjava.service.impl.student;

import com.myjava.dao.student.StudentMapper;
import com.myjava.po.student.StudentPO;
import com.myjava.request.student.StudentRequest;
import com.myjava.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 分页查啊
     *
     * @param studentRequest 查询参数
     * @return 集合
     */
    @Override
    public ArrayList<StudentPO> getList(StudentRequest studentRequest) {
        ArrayList<StudentPO> result = studentMapper.selectAll(studentRequest);
        return result;
    }

    /**
     * 获取指定用户信息
     *
     * @param id id
     * @return 指定对象
     */
    @Override
    public StudentPO getInfo(Long id) {
        StudentPO result = studentMapper.selectOne(id);
        return result;
    }

    /**
     * 新增
     *
     * @param studentRequest 模型
     * @return 自增ID
     */
    @Override
    public Long insert(StudentRequest studentRequest) {
        StudentPO studentPO = new StudentPO();
        studentPO.setStuName(studentRequest.getStuName());
        studentPO.setStuNo(studentRequest.getStuNo());
        studentPO.setStuSex(studentRequest.getStuSex());
        studentPO.setStuGrade(studentRequest.getStuGrade());
        studentPO.setStuClass(studentRequest.getStuClass());
        studentPO.setStuTuition(studentRequest.getStuTuition());

        studentPO.setAddTime(new Date());
        studentPO.setUpdateTime(new Date());
        studentPO.setIsDelete(false);

        Long result = studentMapper.insert(studentPO);
        return result;
    }

    /**
     * 修改
     *
     * @param id             id
     * @param studentRequest 模型
     * @return
     */
    @Override
    public Boolean update(Long id, StudentRequest studentRequest) {
        StudentPO studentPO = getInfo(id);
        Boolean result = false;
        try {
            if (studentPO == null || studentPO.getId() <= 0) {
                throw new Exception(String.format("用户不存在,%s", id));
            }
            studentPO.setUpdateTime(new Date());
            studentPO.setStuName(studentRequest.getStuName());
            studentPO.setStuNo(studentRequest.getStuNo());
            studentPO.setStuSex(studentRequest.getStuSex());
            studentPO.setStuGrade(studentRequest.getStuGrade());
            studentPO.setStuClass(studentRequest.getStuClass());
            studentPO.setStuTuition(studentRequest.getStuTuition());
            result = studentMapper.update(studentPO);
        } catch (Exception ex) {
        }
        return result;
    }

    /**
     * 新增
     *
     * @param id 新增模型
     * @return bool
     */
    @Override
    public Boolean delete(Long id) {
        StudentPO studentPO = getInfo(id);
        Boolean result = false;
        try {
            if (studentPO == null || studentPO.getId() <= 0) {
                throw new Exception(String.format("用户不存在，id：%s", id));
            }
            if (studentPO.getIsDelete()) {
                throw new Exception(String.format("用户已经删除，id：%s", id));
            }
            result = studentMapper.delete(id);
        } catch (Exception ex) {

        }
        return result;
    }
}
