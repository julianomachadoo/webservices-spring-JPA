package com.github.julianomachadoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.julianomachadoo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
