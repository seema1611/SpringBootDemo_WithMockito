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

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}