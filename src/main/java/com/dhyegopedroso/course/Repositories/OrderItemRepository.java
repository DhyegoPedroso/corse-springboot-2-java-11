package com.dhyegopedroso.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhyegopedroso.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
