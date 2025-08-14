package com.curso.aulaSpring.repositories;

import com.curso.aulaSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
