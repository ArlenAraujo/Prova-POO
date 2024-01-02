package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.model.Key;

import com.empresa.repository.KeyRepository;


@Service
public class KeyService {
	@Autowired
	private KeyRepository keyRepository;
	
	public Key createKey(Key key) {
		return keyRepository.save(key);
	}
	
	public List<Key> getAllKey(){
		return keyRepository.findAll();
	}
	
}


