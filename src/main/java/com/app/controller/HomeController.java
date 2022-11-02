package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Tarea;

@RestController
@RequestMapping("/v1")
public class HomeController { 
	
	@GetMapping("/home") 
	
	public ResponseEntity<String> getHelloWorld(){
		return new ResponseEntity<>("Hello World Salvador Estrada",HttpStatus.OK);
	} 
	
	@GetMapping("/tarea")
	public ResponseEntity<Tarea> getTarea(){
		Tarea t=new Tarea("01","Comprar tortillas","Proridad alta"); 
		return new ResponseEntity<>(t,HttpStatus.OK);
	} 
	
	@GetMapping("/tareas")
	public ResponseEntity<Tarea> getTareas(){ 
		List<Tarea> lTareas = new ArrayList<>(); 
		lTareas.add( new Tarea("01","Comprar gas","Alta"));
		lTareas.add( new Tarea("02","Comprar gasolina","Baja"));
		lTareas.add( new Tarea("03","Comprar Ropa","Baja"));
		lTareas.add( new Tarea("04","Comprar Pan","Alta"));
		lTareas.add( new Tarea("05","Comprar Tortillas","Alta")); 
		
		return new ResponseEntity(lTareas,HttpStatus.OK);
		
	} 
	
	@GetMapping("/tareas/{id}")
	public Tarea getIdTareas(@PathVariable String id){  
		List<Tarea> lTareas = new ArrayList<>();  
		lTareas.add( new Tarea("01","Comprar gas","Alta"));
		lTareas.add( new Tarea("02","Comprar gasolina","Baja"));
		lTareas.add( new Tarea("03","Comprar Ropa","Baja"));
		lTareas.add( new Tarea("04","Comprar Pan","Alta"));
		lTareas.add( new Tarea("05","Comprar Tortillas","Alta"));  
		
		for(Tarea t: lTareas) {
			if(t.getId().equals(id)) {
				return t;
			}
		}
		return null;
		
		//return new ResponseEntity(lTareas,HttpStatus.OK);
		
	}

	

}