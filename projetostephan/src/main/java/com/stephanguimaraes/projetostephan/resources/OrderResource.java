package com.stephanguimaraes.projetostephan.resources;

import com.stephanguimaraes.projetostephan.entities.Order;
import com.stephanguimaraes.projetostephan.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @GetMapping
    ResponseEntity<List<Order>> findAll(){

        List<Order> list = orderService.findAll();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj = orderService.findById(id);
        return ResponseEntity.ok().body(obj);
    }



}
