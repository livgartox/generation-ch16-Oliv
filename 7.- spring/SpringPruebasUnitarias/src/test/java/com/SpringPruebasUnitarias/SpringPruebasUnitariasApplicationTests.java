package com.SpringPruebasUnitarias;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.SpringPruebasUnitarias.Model.UsuarioModel;
import com.SpringPruebasUnitarias.Repository.UsuarioRepository;

@SpringBootTest
class SpringPruebasUnitariasApplicationTests {
	@Autowired UsuarioRepository usuariorepository;;
	@Test
	void contextLoads() {
		UsuarioModel usuariomodelo=new UsuarioModel();
		
		//usuariomodelo.setId(1L);
		usuariomodelo.setNombre("Adriana");
		usuariomodelo.setClave("1234");
		
		UsuarioModel r=usuariorepository.save(usuariomodelo);
		assertTrue(r.getClave().equalsIgnoreCase(usuariomodelo.getClave()));
	}

}
