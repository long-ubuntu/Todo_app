package com.codevui.todoapp_product.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codevui.todoapp_product.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
