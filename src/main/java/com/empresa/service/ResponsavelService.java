package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.model.Responsavel;

import com.empresa.repository.ResponsavelRepository;


@Service
public class ResponsavelService {
	@Autowired
	private ResponsavelRepository responsavelRepository;
	
	public Responsavel createResponsavel(Responsavel responsavel) {
		return responsavelRepository.save(responsavel);
	}
	
	public List<Responsavel> getAllResponsavel(){
		return responsavelRepository.findAll();
	}

}
