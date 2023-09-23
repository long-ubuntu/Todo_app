package com.codevui.todoapp_product.service;

import java.util.List;

import com.codevui.todoapp_product.entity.Todo;

public interface TodoService {
    public void appTodo(String title);

    public List<Todo> getAllTodo();

    public void delete_Todo(int id);

    public void toggle_Todo(int id);
    
}