package com.kodilla.testing.user;
//Moduł 6.2: SimpleUser
public class SimpleUser {
    private String username;
    private String realName;
    public SimpleUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }
    public String getUsername() {
        return username;
    }
    public String getRealName(){
        return realName;
    }
}