package com.generation.gto.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.generation.gto.models.UsuarioModels;
import com.generation.gto.repositories.UsuarioRepositories;

import org.springframework.beans.factory.annotation.Autowired;

@Service

public class UsuarioServices {
	@Autowired
	UsuarioRepositories usuariorepositories;
	
	public ArrayList<UsuarioModels> obtenerUsuarios(){
		return (ArrayList<UsuarioModels>)usuariorepositories.findAll();
		
	}
	public UsuarioModels guardarUsuario(UsuarioModels usuario){
        return usuariorepositories.save(usuario);
    }
	
	public Optional<UsuarioModels> obtenerPorId(Long id){
        return usuariorepositories.findById(id);
    }
	
	public ArrayList<UsuarioModels>  obtenerPorPrioridad(Integer prioridad) {
        return usuariorepositories.findByPrioridad(prioridad);
    }
	public boolean eliminarUsuario(Long id) {
        try{
            usuariorepositories.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }




}
