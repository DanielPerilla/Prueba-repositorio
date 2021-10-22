package com.crud.service;

import java.util.List;
import java.util.Optional;

import com.crud.entity.Usuario;



public interface UsuarioService {
	
	// metodos 
	public List <Usuario> findAllUsuario();//metodo para enlistar
	public Optional <Usuario> findUsuarioById(Long id);//edición
	public Usuario saveUsuario(Usuario UsuarioNew);//guardado
	public String deleteUsuario(Long id);//borrado
	public String updateUsuario(Usuario UsuarioNew);//actualizar

}
