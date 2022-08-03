package com.github.julianomachadoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.julianomachadoo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
