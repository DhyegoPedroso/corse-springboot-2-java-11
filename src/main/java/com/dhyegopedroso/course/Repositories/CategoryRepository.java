package com.dhyegopedroso.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhyegopedroso.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
