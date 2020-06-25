package com.mockitodemo.Service;

import com.mockitodemo.model.User;

import java.util.List;

public interface IUserService {
    User addUser(User user);
    List<User> getUsers();
}
