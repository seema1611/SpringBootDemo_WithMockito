package com.mockitodemo.controller;

import com.mockitodemo.Service.implementors.UserService;
import com.mockitodemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/save")
    public User saveUser(@RequestParam(value="id")int id,
                         @RequestParam(value = "name") String name,
                         @RequestParam(value="age") int age,
                         @RequestParam(value="address") String address) throws IOException {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setAddress(address);
        return userService.addUser(user);
    }
}

