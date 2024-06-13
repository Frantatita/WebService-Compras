package com.example.repositorios;

import org.springframework.data.jpa.repository.JpaRepository; // Import the correct package
import org.springframework.stereotype.Repository;

import com.example.entidades.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Integer> {
    
    // Método para buscar un carrito por su id
    

}
