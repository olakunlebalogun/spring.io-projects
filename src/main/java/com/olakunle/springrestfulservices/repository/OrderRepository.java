package com.olakunle.springrestfulservices.repository;

import com.olakunle.springrestfulservices.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}