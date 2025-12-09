package com.paulo.userapi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Setter;

@Entity
public class UserModel {
    @Id         // gera as Primary Keys, filtrando property IDs
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera automaticamente valores de IDs
    private long id;
    @Setter
    private String login;
    @Setter
    private String password;

    public UserModel(){}

    public UserModel(String login, String password) {
        this.login= login;
        this.password= password;
    }

    public long getId() {
        return id;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

}
