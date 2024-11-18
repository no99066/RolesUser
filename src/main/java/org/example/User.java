package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String surname;
    private String login;
    private String password;
    private int dateJoined;
    private boolean status;
    private List<Role> roles;


    public User(String name, String surname, String login, String password, int dateJointed){
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.dateJoined = dateJointed;
        this.status = false;
        this.roles = new ArrayList<>();
    }

    public void addRoles(Role role){
        this.roles.add(role);
    }

    public List<Role> getRoles(){
        return roles;
    }

    public Boolean getStatus(){
        return status;
    }

    public void updateVip(){
        status = true;
    }

    public int getDateJoined(){
        return dateJoined;
    }

    public String getName(){
        return name;
    }


}
