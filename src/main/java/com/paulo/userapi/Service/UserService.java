package com.paulo.userapi.Service;

import com.paulo.userapi.Model.UserModel;
import com.paulo.userapi.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;

    }

    public List<UserModel> getUserDetals(){
        return userRepository.getUserSoucer();
    }
}
