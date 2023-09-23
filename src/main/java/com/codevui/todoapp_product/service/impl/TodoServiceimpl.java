package com.codevui.todoapp_product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codevui.todoapp_product.entity.Todo;
import com.codevui.todoapp_product.repository.TodoRepository;
import com.codevui.todoapp_product.service.TodoService;

@Service
public class TodoServiceimpl implements TodoService {

    public static int increase = 0;

    @Autowired
    TodoRepository todoRepository;

    public void appTodo(String title) {
        Todo todo = new Todo();
        todo.setCompleted(false);
        todo.setTitle(title);
        todoRepository.save(todo);
    }

    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }

    public void delete_Todo(int id) {
        todoRepository.deleteById(id);
    }

    public void toggle_Todo(int id) {
        Todo oldTodo = todoRepository.findById(id).get();
        oldTodo.setCompleted(!oldTodo.isCompleted());
        todoRepository.save(oldTodo);
    }
    
}
