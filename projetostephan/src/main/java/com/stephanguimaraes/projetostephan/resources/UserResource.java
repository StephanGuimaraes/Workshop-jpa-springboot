package com.stephanguimaraes.projetostephan.resources;

import com.stephanguimaraes.projetostephan.entities.User;
import com.stephanguimaraes.projetostephan.services.UserService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

@Autowired
    private UserService userService;

@GetMapping
    ResponseEntity<List<User>> findAll(){

    List<User> list = userService.findAll();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
    User obj = userService.findById(id);
    return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User obj){
    obj = userService.insert(obj);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{i}").buildAndExpand(obj.getId()).toUri();
    return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
    userService.delete(id);
    return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj){
    obj = userService.update(id, obj);
    return ResponseEntity.ok().body(obj);
    }



}
