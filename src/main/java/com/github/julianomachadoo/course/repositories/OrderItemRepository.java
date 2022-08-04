package com.github.julianomachadoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.julianomachadoo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
