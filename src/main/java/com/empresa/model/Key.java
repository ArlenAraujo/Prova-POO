package com.empresa.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Key {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_key;
	@ManyToOne
	@JoinColumn(name = "id_sala")
	private Sala sala;
	@ManyToOne
	@JoinColumn(name = "id_responsavel")
	private Responsavel responsavel;

	private Date keyDate;
	
	private String status;

	public Key() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Key(Long id_key, Sala sala, Responsavel responsavel, Date keyDate, String status) {
		super();
		this.id_key = id_key;
		this.sala = sala;
		this.responsavel = responsavel;
		this.keyDate = keyDate;
		this.status = status;
	}

	public Long getId_key() {
		return id_key;
	}

	public void setId_key(Long id_key) {
		this.id_key = id_key;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public Date getKeyDate() {
		return keyDate;
	}

	public void setKeyDate(Date keyDate) {
		this.keyDate = keyDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
