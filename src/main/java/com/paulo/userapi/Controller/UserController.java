package com.paulo.userapi.Controller;

import com.paulo.userapi.Model.UserModel;
import com.paulo.userapi.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/api/v2/users")
    public List<UserModel> getUserController(){
        return userService.getUserDetals();
    }
}
