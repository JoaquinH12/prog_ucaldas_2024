package com.darckode.app.Domain;
import lombok.Data;

@Data

public class Cerveceria {
    private int stock;
    private String cerveceria;
    private String dpto;
    private String municipio;
    private String marca;
    private String nomenclatura;
    
    public Cerveceria(int stock, String cerveceria, String dpto, String municipio, String marca, String nomenclatura) {
        this.stock = stock;
        this.cerveceria = cerveceria;
        this.dpto = dpto;
        this.municipio = municipio;
        this.marca = marca;
        this.nomenclatura = nomenclatura;
    }

    

}
