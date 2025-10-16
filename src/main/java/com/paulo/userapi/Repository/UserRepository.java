package com.paulo.userapi.Repository;

import com.paulo.userapi.Model.UserModel;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {

    public List<UserModel> getUserSoucer(){
        System.out.println("Carregando a lista de Users...");

        return Arrays.asList(
                new UserModel("Paulo", 12),
                new UserModel("Sandro", 32),
                new UserModel("marcos", 53)
        );
    }

}
