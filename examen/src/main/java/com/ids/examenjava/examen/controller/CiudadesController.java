package com.ids.examenjava.examen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ids.examenjava.examen.entity.Ciudades;
import com.ids.examenjava.examen.service.CiudadesService;

@RestController
@RequestMapping("Cuidades")
public class CiudadesController {
	
	@Autowired
	CiudadesService ciudadesService;
	
	@GetMapping("/listaCiudades")
	public List<Ciudades> listarCiudades(){
		return ciudadesService.obtenerCiudades();
	}
	
	@DeleteMapping("/eliminarCiudad/{id}")
	public HttpStatus borarCiudad(@PathVariable Integer id) {
		this.ciudadesService.eliminaCiudad(id);
		return HttpStatus.OK;
	}
	
	@GetMapping("/detalleCiudad/{id}")
	public Optional<Ciudades> detalleCiudad(@PathVariable Integer id){
		return this.ciudadesService.obtenerCiudadId(id);
	}
	

}
