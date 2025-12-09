package com.paulo.userapi.Service;

import com.paulo.userapi.Model.UserModel;
import com.paulo.userapi.Repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private RepositoryUser repositoryUser;

    // aqui está criando  login e password do users. Assim salvando esses dois valores
    public UserModel createUser(String login,String password){
        UserModel user = new UserModel();
        user.setLogin(login);
        user.setPassword(password);
        return repositoryUser.save(user);
    }

    // aqui ele vai buscar meus Ids de users, se nao encontrar ele vai me trazer nulo.
    public UserModel getUser(long id){
        return repositoryUser.findById(id).orElse(null);
    }
}
