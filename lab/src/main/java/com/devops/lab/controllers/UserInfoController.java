package com.devops.lab.controllers;

import com.devops.lab.dto.UserInfo;
import com.devops.lab.services.UserCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserInfoController {

    @Autowired
    private UserCreateService userCreateService;

    @GetMapping(value = "/userinfo/{id}")
    public UserInfo getUserInfo(@PathVariable long id) {
        return userCreateService.getUserInfo(id).map(data ->
                UserInfo.builder()
                        .userName(data.getUserName())
                        .email(data.getEmail())
                        .jobTitle(data.getJobTitle()).build()).orElse(null);
    }

    @PostMapping(value = "/createUser")
    public boolean creteUser(@RequestBody UserInfo info) {
        return userCreateService.creteUser(info);
    }
}
