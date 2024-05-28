package com.darckode.spring.app.Repository;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TutorialR {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Nombre")
    private String Nombre;
    @Column(name = "URL")
    private String URL;
    @Column(name = "Fecha")
    private String Fecha;
    @Column(name = "Autor")
    private int Autor;
    @Column(name = "Descripcion")
    private String Descripcion;
}
