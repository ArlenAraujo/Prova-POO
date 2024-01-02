package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.model.Responsavel;
import com.empresa.service.ResponsavelService;

@RestController
@RequestMapping("/responsavel")
public class ResponsavelController {
	
	@Autowired
	private ResponsavelService responsavelService;
	
	@GetMapping
	public List<Responsavel> getAllResponsavel(){
		return responsavelService.getAllResponsavel();
	}
	@PostMapping
	public Responsavel createResponsavel(@RequestBody Responsavel responsavel) {
		return responsavelService.createResponsavel(responsavel);
		
	}
	

}
