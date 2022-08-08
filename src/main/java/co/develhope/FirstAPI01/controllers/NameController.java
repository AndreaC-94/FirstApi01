package co.develhope.FirstAPI01.controllers;

import co.develhope.FirstAPI01.entities.User;
import co.develhope.FirstAPI01.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @Autowired
    NameService service;

    @GetMapping ("/get")
    public String getName(){
        return service.getUser();
    }

    @PostMapping ("/post")
    public User postName(User user1){
        return service.postUser(user1);
    }
}
