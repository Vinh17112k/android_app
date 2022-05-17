package com.example.food_app.model;


public class LoginApiResponse {

    private int id;
    private String name;
    private String mobile;
    private boolean error;
    private String message;
    private String password;
    private String token;
    private boolean isAdmin;

    public LoginApiResponse(String message) {
        this.message = message;
        this.error = true;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isError() {
        return error;
    }
    public String getMobile(){return mobile;}

    public String getMessage() {
        return message;
    }

    public String getPassword() {
        return password;
    }

    public String getToken() {
        return token;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
