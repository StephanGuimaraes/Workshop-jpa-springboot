package com.stephanguimaraes.projetostephan.resources;

import com.stephanguimaraes.projetostephan.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

@GetMapping
    ResponseEntity<User> findAll(){
        User u = new User(1L,"stephan", "stephan.guimaraess@gmail.com","21965115410","864685840");
        return ResponseEntity.ok().body(u);

    }

}
