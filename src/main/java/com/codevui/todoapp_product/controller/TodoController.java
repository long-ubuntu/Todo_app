package com.codevui.todoapp_product.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codevui.todoapp_product.entity.Todo;
import com.codevui.todoapp_product.service.TodoService;

@Controller
public class TodoController {
    
    @Autowired
    TodoService todoService;

    @RequestMapping("/list-todo")
    public String listTodo(Model model){
        List<Todo> list = todoService.getAllTodo();
        model.addAttribute("list", list);
        return "todo/listtodo";
    }

    @PostMapping("/add-todo")
    public String appTodo(HttpServletRequest request){
        String title = request.getParameter("title");
        todoService.appTodo(title);
        return "redirect:/list-todo";
    }

    @GetMapping("/deleteTodo")
    public String deleteTodo(HttpServletRequest request){

        int id = Integer.parseInt(request.getParameter("id"));
        todoService.delete_Todo(id);
        return "redirect:/list-todo";
    }

    @GetMapping("/completeTodo")
    public String toggleTodo(HttpServletRequest request){

        int id = Integer.parseInt(request.getParameter("id"));
        todoService.toggle_Todo(id);
        return "redirect:/list-todo";
    }
}
