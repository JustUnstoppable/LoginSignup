package com.example.androidappbackendwithnodejs;


import com.google.gson.annotations.SerializedName;

public class LoginResult {

    private String name;

    //Below is used when json object name and variable names are different
    //@SerializedName("mail")
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
