package com.klef.jfsd.exam_1.repository;

import com.klef.jfsd.exam_1.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}