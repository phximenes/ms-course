package com.matrix.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrix.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
