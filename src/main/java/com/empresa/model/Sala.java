package com.empresa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sala {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_sala;
	
	private String describe;

	public Sala(Long id_sala, String describe) {
		super();
		this.id_sala = id_sala;
		this.describe = describe;
	}

	public Sala() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId_sala() {
		return id_sala;
	}

	public void setId_sala(Long id_sala) {
		this.id_sala = id_sala;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	
}
