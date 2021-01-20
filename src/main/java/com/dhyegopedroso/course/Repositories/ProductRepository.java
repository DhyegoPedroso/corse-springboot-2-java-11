package com.dhyegopedroso.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhyegopedroso.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
