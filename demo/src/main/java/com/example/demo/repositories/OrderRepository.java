package com.example.demo.repositories;

import com.example.demo.entities.Order;
import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
