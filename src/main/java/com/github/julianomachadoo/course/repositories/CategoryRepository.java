package com.github.julianomachadoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.julianomachadoo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
