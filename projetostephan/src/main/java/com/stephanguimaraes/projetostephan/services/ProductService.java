package com.stephanguimaraes.projetostephan.services;
import com.stephanguimaraes.projetostephan.entities.Product;
import com.stephanguimaraes.projetostephan.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    @Autowired
    private ProductRepository ProductRepository;


    public List<Product> findAll(){
        return ProductRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj= ProductRepository.findById(id);
        return obj.get();

    }



}
