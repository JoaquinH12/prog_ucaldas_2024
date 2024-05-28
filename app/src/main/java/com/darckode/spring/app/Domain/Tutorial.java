package com.darckode.spring.app.Domain;
import lombok.Data;
@Data
public class Tutorial {


    private String URL;
    private String Descripcion;
    private String Nombre;
    private String Estado;
    private String Fecha;
    private String Autor;

    

    public Tutorial(String URL, String descripcion, String nombre, String estado, String fecha, String autor) {
        this.URL = URL;
        this.Descripcion = descripcion;
        this.Nombre = nombre;
        this.Estado = estado;
        this.Fecha = fecha;
        this.Autor = autor;
    }



    public Tutorial() {
    }

}


