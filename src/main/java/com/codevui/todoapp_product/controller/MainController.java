package com.codevui.todoapp_product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/hello")
    public String sayHello(){
        // business logic
        
        return "hello";
    }

    
}
