package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.model.Sala;
import com.empresa.repository.SalaRepository;

@Service
public class SalaService {

	@Autowired
	private SalaRepository salaRepository;
	
	public Sala createSala(Sala sala) {
		return salaRepository.save(sala);
	}
	
	public List<Sala> getAllSala(){
		return salaRepository.findAll();
	}
}
