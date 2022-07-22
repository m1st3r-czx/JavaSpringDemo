package com.myjava.service.impl.user;

import com.myjava.dao.user.UserMapper;
import com.myjava.po.user.UserPO;
import com.myjava.request.user.UserRequest;
import com.myjava.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有，无查询条件
     *
     * @return
     */
    @Override
    public ArrayList<UserPO> getUserList() {
        ArrayList<UserPO> result = userMapper.selectAll();
        return result;
    }

    /**
     * 分页查啊
     *
     * @param userRequest 查询参数
     * @return 集合
     */
    @Override
    public ArrayList<UserPO> getList(UserRequest userRequest) {
        ArrayList<UserPO> result = userMapper.selectAllV2(userRequest);
        return result;
    }

    /**
     * 获取指定用户信息
     *
     * @param id id
     * @return 指定对象
     */
    @Override
    public UserPO getInfo(Long id) {
        UserPO result = userMapper.selectOne(id);
        return result;
    }

    /**
     * 新增
     *
     * @param userRequest 模型
     * @return 自增ID
     */
    @Override
    public Long insert(UserRequest userRequest) {
        UserPO userPO = new UserPO();
        userPO.setUserName(userRequest.getUserName());
        userPO.setMobile(userRequest.getMobile());
        userPO.setEmail(userRequest.getEmail());
        userPO.setAccount(userRequest.getAccount());
        userPO.setSex(userRequest.getSex());
        userPO.setIsDelete(false);
        userPO.setAddTime(new Date());
        userPO.setUpdateTime(new Date());

        Long id = userMapper.insert(userPO);
        return id;
    }

    /**
     * 修改
     *
     * @param id          id
     * @param userRequest 模型
     * @return
     */
    @Override
    public Boolean update(Long id, UserRequest userRequest) {
        UserPO userPO = getInfo(id);
        Boolean result = false;
        try {
            if (userPO == null || userPO.getId() <= 0) {
                throw new Exception(String.format("用户不存在,%s", id));
            }
            userPO.setUpdateTime(new Date());
            userPO.setSex(userRequest.getSex());
            userPO.setAccount(userRequest.getAccount());
            userPO.setEmail(userRequest.getEmail());
            userPO.setMobile(userRequest.getMobile());
            userPO.setUserName(userRequest.getUserName());
            result = userMapper.update(userPO);
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
        UserPO userPO = getInfo(id);
        Boolean result = false;
        try {
            if (userPO == null || userPO.getId() <= 0) {
                throw new Exception(String.format("用户不存在，id：%s", id));
            }
            if (userPO.getIsDelete()) {
                throw new Exception(String.format("用户已经删除，id：%s", id));
            }
            result = userMapper.delete(id);
        } catch (Exception ex) {

        }
        return result;
    }
}
