package com.crud.controllerlmpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


import com.crud.controller.UsuarioController;
import com.crud.entity.Usuario;
import com.crud.service.UsuarioService;
import com.sun.istack.NotNull;

@RestController
public class UsuarioControllerlmpl implements UsuarioController{

	@Autowired
	UsuarioService usuarioService; 
	
	
	@RequestMapping (value="/usuario", method = RequestMethod.GET, produces="application/json")
	@Override
	public List<Usuario> getUsuarios() {
		
		return usuarioService.findAllUsuario();
	}
//
	@Override
	@RequestMapping (value="/usuario/{id}", method= RequestMethod.GET, produces= "application/json")
	public Optional<Usuario> getUsuarioById(@PathVariable Long Id) {
		return usuarioService.findUsuarioById(Id);
	}
//guardar
	@Override
	@RequestMapping (value = "/usuario/add", method = RequestMethod.POST, produces="application/JSON" )
	public Usuario addUsuario( Usuario usuario) {
		return usuarioService.saveUsuario( usuario);}

		//eliminar
	@Override
	@RequestMapping(value = "/usuario/delete/{id}", method= RequestMethod.DELETE, produces="application/json") 
	public String deleteUsuario(@PathVariable Long Id) {
		return usuarioService.deleteUsuario(Id);
	}
//actulaizar
	@Override
	@RequestMapping(value = "/usuario/update", method= RequestMethod.POST, produces= "application/json")
	public String updateusuario(Usuario usuarionew) {
		return usuarioService.updateUsuario(usuarionew);
	}
//
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces="application/json")
	@Override
	public String test() {
		return "Test done";
	}

	
}
