package com.example.demo.repositories;

import com.example.demo.entities.Category;
import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
