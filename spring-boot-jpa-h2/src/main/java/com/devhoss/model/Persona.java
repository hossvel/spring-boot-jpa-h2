package com.devhoss.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Persona {

	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	private int edad;
	
	public Persona() {
		super();
	}
	public Persona(Long id,String nombre,int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}







