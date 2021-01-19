package com.dhyegopedroso.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhyegopedroso.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
