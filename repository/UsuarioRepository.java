package com.projetojpa03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpa03.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}