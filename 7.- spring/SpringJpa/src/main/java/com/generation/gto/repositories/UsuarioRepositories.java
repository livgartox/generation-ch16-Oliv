package com.generation.gto.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.generation.gto.models.UsuarioModels;


@Repository
public interface UsuarioRepositories extends CrudRepository<UsuarioModels,Long> {
	public abstract ArrayList<UsuarioModels> findByPrioridad(Integer prioridad);

}
