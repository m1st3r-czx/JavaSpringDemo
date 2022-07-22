package com.myjava.demo.service.user;

import com.myjava.demo.filter.user.UserFilter;
import com.myjava.demo.response.user.UserResponse;

import java.util.ArrayList;

public interface UserService {

    String test();

    ArrayList<UserResponse> getList(UserFilter userFilter);

    UserResponse getInfo(Long id);
}
