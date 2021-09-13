package com.thinklinux.user.controller;

import com.thinklinux.user.entity.Department;
import com.thinklinux.user.entity.User;
import com.thinklinux.user.entity.UserDetail;
import com.thinklinux.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("saveUser :"+user.toString());
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }

    @GetMapping("/detail/{id}")
    public UserDetail getUserDetailById(@PathVariable("id") Long id){

        return userService.getUserDetailById(id);


    }
}
