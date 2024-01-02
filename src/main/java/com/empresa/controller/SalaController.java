package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.model.Sala;
import com.empresa.service.SalaService;

@RestController
@RequestMapping("/sala")
public class SalaController {
	
	@Autowired
	private SalaService salaService;
	
	@GetMapping
	public List<Sala> getAllSala(){
		return salaService.getAllSala();
	}
	@PostMapping
	public Sala createSala(@RequestBody Sala sala) {
		return salaService.createSala(sala);
		
	}

}
