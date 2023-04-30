package com.example.scotterapp;

import java.io.Serializable;

public class User implements Serializable {

    String password;
    String email;

    public User(String password, String email){
        this.password = password;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
