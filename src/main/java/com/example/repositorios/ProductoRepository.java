package com.example.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entidades.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    // Método para buscar un producto por su nombre
    List<Producto> findByNombre(String nombre); 

    // Método para buscar productos por su precio menor que el valor dado
    List<Producto> findByPrecioLessThan(double precio);

    // Método para buscar productos por su precio mayor que el valor dado
    List<Producto> findByPrecioGreaterThan(double precio);

    // Método para buscar productos por su precio entre dos valores dados
    List<Producto> findByPrecioBetween(double precioMin, double precioMax);

    // Otros métodos de consulta según sea necesario
}
