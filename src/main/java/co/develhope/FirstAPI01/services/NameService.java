package co.develhope.FirstAPI01.services;

import co.develhope.FirstAPI01.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;

@Service
public class NameService {

    @Autowired
    User user;

    public String getUser() {
        return user.getName();
    }

    public User postUser(User user1){
        StringBuilder rev = new StringBuilder(user1.getName());
        rev = rev.reverse();
        user1.setName(rev.toString());
        return user1;
    }

    /*public String postUser(@PathVariable String name){
        StringBuilder rev = new StringBuilder(name);
        name = rev.reverse().toString();
        return name;
    }*/
}
