package com.sourabh.user_service.controller;

import com.sourabh.user_service.entities.History;
import com.sourabh.user_service.entities.User;
import com.sourabh.user_service.service.HistoryService;
import com.sourabh.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private HistoryService historyService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{userId}/history")
    public List<History> getUserTravelHistory(@PathVariable Long userId) {
        return historyService.getTravelHistory(userId);
    }
}
