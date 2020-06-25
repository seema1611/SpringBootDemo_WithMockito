package com.mockitodemo.Service.implementors;

import com.mockitodemo.Service.IUserService;
import com.mockitodemo.model.User;
import com.mockitodemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;


    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        System.out.println("Getting data from DB : " + users);
        return users;
    }
}