package com.myjava.service.student;

import com.myjava.po.student.StudentPO;
import com.myjava.request.student.StudentRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface StudentService {

    /**
     * 分页查啊
     *
     * @param studentRequest 查询参数
     * @return 集合
     */
    ArrayList<StudentPO> getList(StudentRequest studentRequest);

    /**
     * 获取指定用户信息
     *
     * @param id id
     * @return 指定对象
     */
    StudentPO getInfo(Long id);

    /**
     * 新增
     *
     * @param studentRequest 模型
     * @return 自增ID
     */
    Long insert(StudentRequest studentRequest);

    /**
     * 修改
     *
     * @param id             id
     * @param studentRequest 模型
     * @return
     */
    Boolean update(Long id, StudentRequest studentRequest);

    /**
     * 新增
     *
     * @param id 新增模型
     * @return bool
     */
    Boolean delete(Long id);
}
