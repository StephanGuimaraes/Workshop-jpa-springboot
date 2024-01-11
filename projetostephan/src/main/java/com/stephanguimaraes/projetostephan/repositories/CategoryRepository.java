package com.stephanguimaraes.projetostephan.repositories;

import com.stephanguimaraes.projetostephan.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
