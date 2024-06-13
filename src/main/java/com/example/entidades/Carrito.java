package com.example.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarrito;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private double precio;

    // Getters y setters
// Getters
public Integer getIdCarrito() {
    return idCarrito;
}

public Producto getProducto() {
    return producto;
}

public int getCantidad() {
    return cantidad;
}

public String getNombre() {
    return nombre;
}

public double getPrecio() {
    return precio;
}

// Setters
public void setIdCarrito(Integer idCarrito) {
    this.idCarrito = idCarrito;
}

public void setProducto(Producto producto) {
    this.producto = producto;
}

public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

}