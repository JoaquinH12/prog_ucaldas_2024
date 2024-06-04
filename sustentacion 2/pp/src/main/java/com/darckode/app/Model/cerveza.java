package com.darckode.app.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cervezas")
public class cerveza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Stock")
    private int stock;
    @Column(name = "dpto")
    private String dpto;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "nomenclatura")
    private String nomenclatura;
    @Column(name = "marca")
    private String marca;

    
public cerveza (){

}
public cerveza (int stock, String dpto, String municipio,String nomenclatura, String marca){
    this.stock = stock;
    this.dpto = dpto;
    this.municipio = municipio;
    this.nomenclatura = nomenclatura;
    this.marca = marca;
}
public int getStock() {
    return stock;
}
public void setStock(int stock) {
    this.stock = stock;
}
public String getDpto() {
    return dpto;
}
public void setDpto(String dpto) {
    this.dpto = dpto;
}
public String getMunicipio() {
    return municipio;
}
public void setMunicipio(String municipio) {
    this.municipio = municipio;
}
public String getNomenclatura() {
    return nomenclatura;
}
public void setNomenclatura(String nomenclatura) {
    this.nomenclatura = nomenclatura;
}
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}

}

