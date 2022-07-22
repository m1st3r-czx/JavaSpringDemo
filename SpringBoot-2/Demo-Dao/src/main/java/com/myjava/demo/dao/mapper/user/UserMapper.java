package com.myjava.demo.dao.mapper.user;

import com.myjava.demo.filter.user.UserFilter;
import com.myjava.demo.po.user.UserPO;
import com.myjava.demo.response.user.UserResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface UserMapper {
    ArrayList<UserResponse> selectAll(UserFilter userFilter);

    UserResponse selectOne(Long id);

    Long insert(UserPO userPO);

    Boolean update(UserPO userPO);

    Boolean delete(Long id);
}
