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
    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public boolean isError() {
        return error;
    }
    public void setMobile(String mobile){
        this.mobile=mobile;
    }
    public String getMobile(){return mobile;}
    public void setMessage(String message){
        this.message=message;
    }
    public String getMessage() {
        return message;
    }
    public void setPassword(String password){
        this.password=password;
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
