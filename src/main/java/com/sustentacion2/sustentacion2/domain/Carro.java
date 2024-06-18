package com.sustentacion2.sustentacion2.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_cARROS")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Marca")
    private String marca;

    @Column(name = "Modelo")
    private String modelo;

    @Column(name = "Año")
    private int anio;

    @Column(name = "Color")
    private String color;

    @Column(name = "Precio")
    private double precio;

    @Column(name = "Tipo de vehiculo")
    private String tipo_vehiculo;

    @Column(name = "Concesionaria")
    private String concesionaria;

    @Column(name = "imagen")
    private String imagen;


    public Carro() {
    }


    public Carro(String marca, String modelo, int anio, String color, double precio, String tipo_vehiculo,
            String concesionaria, String imagen) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.precio = precio;
        this.tipo_vehiculo = tipo_vehiculo;
        this.concesionaria = concesionaria;
        this.imagen = imagen;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getAnio() {
        return anio;
    }


    public void setAnio(int anio) {
        this.anio = anio;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }


    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }


    public String getConcesionaria() {
        return concesionaria;
    }


    public void setConcesionaria(String concesionaria) {
        this.concesionaria = concesionaria;
    }


    public String getImagen() {
        return imagen;
    }


    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


    @Override
    public String toString() {
        return "Carro [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", color=" + color
                + ", precio=" + precio + ", tipo_vehiculo=" + tipo_vehiculo + ", concesionaria=" + concesionaria
                + ", imagen=" + imagen + "]";
    }

    
}
