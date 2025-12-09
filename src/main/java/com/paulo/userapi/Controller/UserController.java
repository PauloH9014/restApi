package com.paulo.userapi.Controller;

import com.paulo.userapi.Model.UserModel;
import com.paulo.userapi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    // vai criar o user
    @PostMapping("/create")
    public String create(@RequestParam String login, @RequestParam String password) {
        UserModel user = service.createUser(login, password);
        return "User created with login: " + user.getLogin() + " and password: " + user.getPassword();
    }

    @GetMapping("/{id}")
    public String get(@PathVariable long id){
        UserModel user = service.getUser(id);
            if(user== null){
                return "User not found";
            }
            return "User login"+ user.getLogin();
        }

    }
