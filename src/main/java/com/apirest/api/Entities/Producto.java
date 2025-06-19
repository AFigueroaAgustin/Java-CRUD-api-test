
package com.apirest.api.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//AQUI ESTOY CREANDO LA CLASE QUE ME VA DAR LOS OBJETOS PARA LA TABLA 
// DE LA BASE DE DATOS
@Entity
public class Producto {
    // CREO EL APARTADO ID
    @Id
    // AQUI DIGO QUE SE AUTOGENERE Y SE INCREMENTE
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double precio;
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
