package com.paulo.dogapi.model;

public class Dog {
    private String dogID;
    private  String racaDog;

    public Dog(String dogID, String racaDog){
        this.dogID = dogID;
        this.racaDog = racaDog;
    }

    public String getDogID(){
        return dogID;
    }

    public String getRacaDog(){
        return racaDog;
    }
}
