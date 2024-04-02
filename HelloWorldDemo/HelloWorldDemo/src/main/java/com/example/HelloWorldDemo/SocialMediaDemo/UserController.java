package com.example.HelloWorldDemo.SocialMediaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    UserService userService;

        @GetMapping("/jeeva@")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }


    @GetMapping("Jeeva@/{id}")
    public User provideOneUSer(@PathVariable("id") int id)//fetch user one by one
    {
        return userService.findUserById(id);

    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.save(user);

    }

}
