package com.proyect.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyect.api.user;
import com.proyect.api.services.UserService;



@Controller
@RequestMapping("/user")
public class userController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String listaUsuario(user User) {
        return "user/lista";
    }

    @GetMapping("/registro")
    public String  Registro(user User) {
        return "user/formulario";
    }

    @GetMapping
    public String RegistrarUser(user User) {
        return "redirect:/user";
    }

    @GetMapping("/{id}")
    public String ActualizUser(user User) {
        return "redirect:/user";
    }
    
    
    
    
    
    
    
    
    
}
