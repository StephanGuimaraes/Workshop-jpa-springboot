package com.stephanguimaraes.projetostephan.resources;

import com.stephanguimaraes.projetostephan.entities.Category;
import com.stephanguimaraes.projetostephan.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService userService;

    @GetMapping
    ResponseEntity<List<Category>> findAll(){

        List<Category> list = userService.findAll();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = userService.findById(id);
        return ResponseEntity.ok().body(obj);
    }



}
