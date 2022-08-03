package com.github.julianomachadoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.julianomachadoo.course.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
