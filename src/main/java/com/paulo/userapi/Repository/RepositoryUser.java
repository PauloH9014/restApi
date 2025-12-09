package com.paulo.userapi.Repository;

import com.paulo.userapi.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUser extends JpaRepository<UserModel, Long> {

    UserModel findByLogin(String login);
    UserModel findByPassword(String password);
}
