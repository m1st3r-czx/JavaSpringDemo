package com.myjava.service.user;

import com.myjava.po.user.UserPO;
import com.myjava.request.user.UserRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {

    /**
     * 查询所有，无查询条件
     *
     * @return
     */
    ArrayList<UserPO> getUserList();

    /**
     * 分页查啊
     *
     * @param userRequest 查询参数
     * @return 集合
     */
    ArrayList<UserPO> getList(UserRequest userRequest);

    /**
     * 获取指定用户信息
     *
     * @param id id
     * @return 指定对象
     */
    UserPO getInfo(Long id);

    /**
     * 新增
     *
     * @param userRequest 模型
     * @return 自增ID
     */
    Long insert(UserRequest userRequest);

    /**
     * 修改
     *
     * @param id id
     * @param userRequest 模型
     * @return
     */
    Boolean update(Long id,UserRequest userRequest);

    /**
     * 新增
     *
     * @param id 新增模型
     * @return bool
     */
    Boolean delete(Long id);

}
