package com.example.ps017_.user.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository ur;

    @PostMapping("/user")
    public String addUser(@RequestBody User user) {
        ur.save(user);
        return "User Details Saved";
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id) {
        return ur.findById(id).orElse(null);
    }
}