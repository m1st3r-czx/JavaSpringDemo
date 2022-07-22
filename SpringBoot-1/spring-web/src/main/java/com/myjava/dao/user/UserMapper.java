package com.myjava.dao.user;

import com.myjava.po.user.UserPO;
import com.myjava.request.user.UserRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface UserMapper {
    ArrayList<UserPO> selectAll();

    ArrayList<UserPO> selectAllV2(UserRequest userRequest);

    UserPO selectOne(Long id);

    Long insert(UserPO userPO);

    Boolean update(UserPO userPO);

    Boolean delete(Long id);
}
