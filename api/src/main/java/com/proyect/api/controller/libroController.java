package com.proyect.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyect.api.libro;
import com.proyect.api.services.LibroService;

@Controller
@RequestMapping("/libros")
public class libroController {
    @Autowired
    private LibroService libroService;

    @GetMapping
    public String listarLibros(Model model) {
        model.addAttribute("libros", libroService.listarLibros());
        return "libros/lista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioDeCrearLibro(Model model) {
        model.addAttribute("libro", new libro());
        return "libros/formulario";
    }

    @PostMapping
    public String guardarLibro(@ModelAttribute("libro") libro libro) {
        libroService.guardarLibro(libro);
        return "redirect:/libros";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEditarLibro(@PathVariable Long id, Model model) {
        model.addAttribute("libro", libroService.buscarPorId(id));
        return "libros/formulario";
    }

    @PostMapping("/{id}")
    public String actualizarLibro(@PathVariable Long id, @ModelAttribute("libro") libro libro) {
        libroService.actualizarLibro(id, libro);
        return "redirect:/libros";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarLibro(@PathVariable Long id) {
        libroService.eliminarLibro(id);
        return "redirect:/libros";
    }

    // Otros métodos para buscar libros
}
