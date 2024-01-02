package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.model.Key;
import com.empresa.service.KeyService;



@RestController
@RequestMapping("/key")
public class KeyController {
	
	@Autowired
	private KeyService keyService;
	
	@GetMapping
	public List<Key> getAllKey(){
		return keyService.getAllKey();
	}
	@PostMapping
	public Key createKey(@RequestBody Key key) {
		return keyService.createKey(key);
		
	}

}
