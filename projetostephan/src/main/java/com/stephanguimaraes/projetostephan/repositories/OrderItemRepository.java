package com.stephanguimaraes.projetostephan.repositories;

import com.stephanguimaraes.projetostephan.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
