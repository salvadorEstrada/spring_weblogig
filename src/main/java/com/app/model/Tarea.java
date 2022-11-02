package com.app.model;

import java.util.List; 

public class Tarea { 
	private String id;
	private String nombre; 
	private String prioridad; 
	
	public Tarea(String id, String nombre, String prioridad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.prioridad = prioridad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public List<String> getId(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
