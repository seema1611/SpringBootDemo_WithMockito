package com.mockitodemo;

import com.mockitodemo.Service.implementors.UserService;
import com.mockitodemo.model.User;
import com.mockitodemo.repository.UserRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest
class MockitodemoApplicationTests {

    @Autowired
    UserService userService;

    @MockBean
    UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void saveUserTest() {
        User user = new User(3, "Amol", 30, "Pune");
        when(userRepository.save(user)).thenReturn(user);
        System.out.println(user.getId());
        assertEquals(user, userService.addUser(user));
    }
}
