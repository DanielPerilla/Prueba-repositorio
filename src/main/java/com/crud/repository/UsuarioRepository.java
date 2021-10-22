package com.crud.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.entity.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

	Void save(Optional<Usuario> usuarioToUpdate);
}