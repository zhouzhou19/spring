package com.manoj.springbootneo4jexample1.service;

import com.manoj.springbootneo4jexample1.model.User;
import com.manoj.springbootneo4jexample1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.getAllUsers();
    }
}
