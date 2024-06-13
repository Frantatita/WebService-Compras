package com.example.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entidades.OrdenCompra;

public interface OrdenCompraRepository extends JpaRepository<OrdenCompra, Long> {
}
