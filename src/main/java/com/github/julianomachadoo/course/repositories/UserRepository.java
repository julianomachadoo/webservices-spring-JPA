package com.github.julianomachadoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.julianomachadoo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
