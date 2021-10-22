package com.crud.controller;

import java.util.List;
import java.util.Optional;

import com.crud.entity.Usuario;

public interface UsuarioController {
	public List <Usuario>  getUsuarios();
	public Optional <Usuario> getUsuarioById (Long Id); 
	public Usuario addUsuario (Usuario usuario );
	public String deleteUsuario (Long Id);
	public String updateusuario (Usuario usuarionew );
	public String test (); 
}
