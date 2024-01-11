package com.stephanguimaraes.projetostephan.repositories;

import com.stephanguimaraes.projetostephan.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
