package com.myjava.demo.impl.user;

import com.myjava.demo.filter.user.UserFilter;
import com.myjava.demo.response.user.UserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class UserServiceImplTest {

    @Test
    void test1() {
        String result = new UserServiceImpl().test();
    }

    @Test
    void getList() {
        UserFilter userFilter =  new UserFilter();
        ArrayList<UserResponse>  responses = new UserServiceImpl().getList(userFilter);
    }

    @Test
    void getInfo() {
        Long id = Long.valueOf(1);
        UserResponse  responses = new UserServiceImpl().getInfo(id);
    }
}