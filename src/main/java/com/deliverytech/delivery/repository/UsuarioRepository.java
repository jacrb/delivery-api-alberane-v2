package com.deliverytech.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverytech.delivery.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
