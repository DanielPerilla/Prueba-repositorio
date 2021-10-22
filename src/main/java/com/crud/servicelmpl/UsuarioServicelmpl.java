package com.crud.servicelmpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Usuario;

import com.crud.repository.UsuarioRepository;
import com.crud.service.UsuarioService;

@Service 
public class UsuarioServicelmpl implements UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	//metodos implementados 
	

	@Override
	public List  <Usuario> findAllUsuario(){
			return usuarioRepository.findAll(); 
		
	}	
	
	
	@Override 
	public Optional <Usuario> findUsuarioById(Long Id){
		Optional<Usuario> usuario = usuarioRepository.findById(Id);
		return usuario;
	}

	@Override
	public Usuario saveUsuario(Usuario UsuarioNew) {
		Usuario usuario = new Usuario();
		if (UsuarioNew != null) {
			usuario.setName(usuario.getName());
			usuario.setLastname(usuario.getLastname());
			return usuarioRepository.save(usuario);
			}
		return UsuarioNew;
	}

	@Override
	public String deleteUsuario(Long id) {
		if (usuarioRepository.findById(id).isPresent()) {
			usuarioRepository.deleteById(id);
			return "Usuario eliminado correctamente.";
		}
		return "Error! El Usuario no existe";
	}

	@Override
	public String updateUsuario(Usuario usuarioUpdated) {
		Long num = usuarioUpdated.getId();
		if (usuarioRepository.findById(num).isPresent()) {
			Usuario usuarioToUpdate = new  Usuario (); 
			usuarioToUpdate.setId(usuarioUpdated.getId());
			usuarioToUpdate.setName(usuarioUpdated.getName());
			usuarioToUpdate.setLastname(usuarioUpdated.getLastname());
			
			return "Usuario modificado";
			
			
		}
		return "Error! No se puede modificar el Usuario";
	}

	
	}
	
	


