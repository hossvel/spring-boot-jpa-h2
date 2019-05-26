package com.devhoss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devhoss.model.Persona;
import com.devhoss.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonasController {

	@Autowired
	private IPersonaService iPersonaService;

	@GetMapping("/findall")
	public List<Persona> findall() {
		return iPersonaService.FindAll();
	}
	@GetMapping("/{id}")
	public Persona getbyid(@PathVariable long id) {
		return iPersonaService.FindById(id);
	}
	
	@PostMapping
	public ResponseEntity<Persona> create(@RequestBody Persona persona) {
		Persona savedPersona = iPersonaService.Save(persona);
		return new ResponseEntity<>(savedPersona,HttpStatus.CREATED);
	}
	
	
}

/*
 curl -X POST -H "Content-Type: application/json" \ -d '{"id":1002,"nombre":"devhoss","edad":31}' \ http://localhost:8080/personas
 curl -X POST -H "Content-Type: application/json; charset=UTF-8" --data {"id":1002,"nombre":"hossmell","edad":31} http://localhost:8080/personas
 
 

curl --header "Content-Type: application/json" \ --request POST \ --data '{"id":1002,"nombre":"hossmell","edad":31}' \ http://localhost:8080/personas
*/








