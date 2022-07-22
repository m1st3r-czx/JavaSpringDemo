package com.myjava.controller.user;

import com.myjava.po.user.UserPO;
import com.myjava.request.user.UserRequest;
import com.myjava.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@Validated
@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/hellow")
    public String getHellow() {
        return "hellow world";
    }

    @GetMapping("/getuserlist")
    public ArrayList<UserPO> getUserList() {
        return userService.getUserList();
    }

    @PostMapping("/getlist")
    public ArrayList<UserPO> getList(@RequestBody UserRequest userRequest) {
        return userService.getList(userRequest);
    }

    @GetMapping("/getinfo/{id}")
    public UserPO getInfo(@PathVariable(name = "id") @Min(value = 1, message = "id必须大于0") Long id) {
        return userService.getInfo(id);
    }

    @PostMapping("/insert")
    public Long insert(@Valid @RequestBody UserRequest userRequest) {
        return userService.insert(userRequest);
    }

    @PutMapping("/update/{id}")
    public Boolean update(@PathVariable(name = "id") @NotNull(message = "id不能为空") @Min(value = 1, message = "id必须大于0") Long id,@Valid @RequestBody UserRequest userRequest) {
        return userService.update(id, userRequest);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable(name = "id") @NotNull(message = "id不能为空") @Min(value = 1, message = "id必须大于0") Long id) {
        return userService.delete(id);
    }
}
