package com.proyect.api.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.api.libro;
import com.proyect.api.Repository.libroRepository;

@Service
public class LibroService {
    @Autowired
    private libroRepository libroRepository;

    public List<libro> listarLibros() {
        return libroRepository.findAll();
    }

    public libro guardarLibro(libro libro) {
        return libroRepository.save(libro);
    }

    public void eliminarLibro(Long id) {
        libroRepository.deleteById(id);
    }

    public List<libro> buscarPorTitulo(String titulo) {
        return libroRepository.findByTituloContaining(titulo);
    }

    // Otros métodos para buscar por autor y género

    public libro buscarPorId(Long id) {
        return libroRepository.findById(id).orElse(null);
    }

    public libro actualizarLibro(Long id, libro libro) {
        libro libroExistente = buscarPorId(id);
        if (libroExistente != null) {
            libroExistente.setTitulo(libro.getTitulo());
            libroExistente.setAutor(libro.getAutor());
            libroExistente.setGenero(libro.getGenero());
            libroExistente.setIsbn(libro.getIsbn());
            return libroRepository.save(libroExistente);
        }
        return null;
    }
}

