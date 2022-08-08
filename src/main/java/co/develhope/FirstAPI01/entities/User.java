package co.develhope.FirstAPI01.entities;

import org.springframework.stereotype.Component;

@Component
public class User {

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Andrea";


}
