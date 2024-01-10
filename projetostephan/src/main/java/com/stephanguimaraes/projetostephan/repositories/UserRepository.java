package com.stephanguimaraes.projetostephan.repositories;

import com.stephanguimaraes.projetostephan.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
