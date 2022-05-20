package com.example.food_app.model;

public class User {

    private int id;
    private String name;
    private String email;
    private String mobile;
    private String password;
    private boolean isAdmin;

    public User(String name, String email,String mobile, String password) {
        this.name = name;
        this.email = email;
        this.mobile=mobile;
        this.password = password;
    }
    public User(int id,String name, String email,String mobile, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile=mobile;
        this.password = password;
    }
    public User(int id,String name, String email,String mobile, String password, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.isAdmin = isAdmin;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
public void setName(String name){
        this.name = name;
}

    public String getName() {
        return name;
    }
public void setEmail(String email){
        this.email=email;
}
    public String getEmail() {
        return email;
    }
public void setMobile(String mobile){
        this.mobile=mobile;
}
public String getMobile(){
        return mobile;
}
public void setPassword(String password){
        this.password=password;
}
    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

}
