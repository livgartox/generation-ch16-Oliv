package com.SpringPruebasUnitarias.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringPruebasUnitarias.Model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel,Integer>{

}
