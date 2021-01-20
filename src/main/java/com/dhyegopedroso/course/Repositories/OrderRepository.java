package com.dhyegopedroso.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhyegopedroso.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
