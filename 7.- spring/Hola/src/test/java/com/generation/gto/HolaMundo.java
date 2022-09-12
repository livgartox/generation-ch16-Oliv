package com.generation.gto;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")

public class HolaMundo {
	@GetMapping("/")
	public String hola() {
		return "Hola mundo desde Spring";
	}

}
