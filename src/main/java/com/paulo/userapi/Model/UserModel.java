package com.paulo.userapi.Model;


public class UserModel {
    private String nameUSer;
    private int ageUser;

    public UserModel(String nameUSer, int ageUser){
        this.nameUSer = nameUSer;
        this.ageUser = ageUser;
    }


    public String getNameUSer(){
        return nameUSer;
    }

    public int getAgeUser(){
        return ageUser;
    }

}
