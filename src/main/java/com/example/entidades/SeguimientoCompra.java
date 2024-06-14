package com.example.entidades;

import java.sql.Date;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Access(AccessType.FIELD) // Utiliza acceso de campo en lugar de acceso de registro

public class SeguimientoCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSeguimientoCompra;

    @ManyToOne
    @JoinColumn(name = "idOrdenCompra")
    private OrdenCompra ordenCompra;

    @Column(name = "estado")
    private String estado;
    
    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "nombre")
    private String nombre;

    //Getters and Setters
    public Integer getIdSeguimientoCompra() {
        return idSeguimientoCompra;
    }

    public void setIdSeguimientoCompra(Integer idSeguimientoCompra) {
        this.idSeguimientoCompra = idSeguimientoCompra;
    }

    public OrdenCompra getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
