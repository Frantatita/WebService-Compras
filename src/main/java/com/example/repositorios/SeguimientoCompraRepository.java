package com.example.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entidades.SeguimientoCompra;

@Repository
public interface SeguimientoCompraRepository extends JpaRepository<SeguimientoCompra, Integer> {
    
}
