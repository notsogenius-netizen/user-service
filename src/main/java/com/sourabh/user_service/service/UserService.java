package com.sourabh.user_service.service;

import com.sourabh.user_service.entities.User;
import com.sourabh.user_service.exception.ApplicationException;
import com.sourabh.user_service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ApplicationException("User not found", HttpStatus.NOT_FOUND));
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
