package com.generation.gto.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.gto.models.UsuarioModels;
import com.generation.gto.services.UsuarioServices;

@RestController
@RequestMapping("/usuario")


public class UsuarioController {
	@Autowired
	UsuarioServices usuarioServices;
	@GetMapping()
	public ArrayList<UsuarioModels> obtenerUsuarios(){
	        return usuarioServices.obtenerUsuarios();
	}
	@PostMapping()
	public UsuarioModels guardarUsuario(@RequestBody UsuarioModels usuario){
        return this.usuarioServices.guardarUsuario(usuario);
    }



}
