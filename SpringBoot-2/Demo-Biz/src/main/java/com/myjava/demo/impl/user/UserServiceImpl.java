package com.myjava.demo.impl.user;

import com.myjava.demo.dao.mapper.user.UserMapper;
import com.myjava.demo.filter.user.UserFilter;
import com.myjava.demo.response.user.UserResponse;
import com.myjava.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String test() {
        return "Hellow World";
    }

    @Override
    public ArrayList<UserResponse> getList(UserFilter userFilter) {
        ArrayList<UserResponse> responses = new ArrayList<UserResponse>();
        responses =userMapper.selectAll(userFilter);
        return responses;
    }

    @Override
    public UserResponse getInfo(Long id) {
        UserResponse responses = new UserResponse();
        responses =userMapper.selectOne(id);
        return responses;
    }
}
