package com.entity.demo.Controller;

public class MemberManager {
    private String username;
    
    public MemberManager(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
