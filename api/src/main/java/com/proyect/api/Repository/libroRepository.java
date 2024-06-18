package com.proyect.api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.api.libro;

@Repository
public interface libroRepository extends JpaRepository<libro, Long> {
    List<libro> findByTituloContaining(String titulo);
    List<libro> findByAutorContaining(String autor);
    List<libro> findByGeneroContaining(String genero);
}
