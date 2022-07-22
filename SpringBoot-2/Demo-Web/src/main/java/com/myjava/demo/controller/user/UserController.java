package com.myjava.demo.controller.user;

import com.myjava.demo.filter.user.UserFilter;
import com.myjava.demo.request.user.UserRequest;
import com.myjava.demo.response.user.UserResponse;
import com.myjava.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() {
        return userService.test();
    }

    @PostMapping("/getlist")
    public ArrayList<UserResponse> getList(@RequestBody UserFilter userFilter) {
        return userService.getList(userFilter);
    }

    @GetMapping("/getinfo/{id}")
    public UserResponse getInfo(@PathVariable(value = "id") @NotNull(message = "id不能为空") Long id) {
        return userService.getInfo(id);
    }

    @PostMapping("/insert")
    public Long insert(@Valid @RequestBody UserRequest userRequest) {
//        return userService.insert(userRequest);
        return Long.valueOf(0);
    }

    @PutMapping("/update/{id}")
    public Boolean update(@PathVariable(name = "id") @NotNull(message = "id不能为空") @Min(value = 1, message = "id必须大于0") Long id,@Valid @RequestBody UserRequest userRequest) {
//        return userService.update(id, userRequest);
        return  true;
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable(name = "id") @NotNull(message = "id不能为空") @Min(value = 1, message = "id必须大于0") Long id) {
//        return userService.delete(id);
        return  true;
    }
}

