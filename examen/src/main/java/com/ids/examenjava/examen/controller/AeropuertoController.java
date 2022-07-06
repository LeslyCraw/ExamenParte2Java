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

import com.ids.examenjava.examen.entity.Aeropuertos;
import com.ids.examenjava.examen.entity.Ciudades;
import com.ids.examenjava.examen.service.AeropuertosService;

@RestController
@RequestMapping("Aeropuertos")
public class AeropuertoController {
	@Autowired
	AeropuertosService aeropuertosService;
	
	@GetMapping("/listaAeropuertos")
	public List<Aeropuertos> listarAeropuertos(){
		return aeropuertosService.obtenerAeropuertos();
	}
	@DeleteMapping("/eliminarAeropuerto/{id}")
	public HttpStatus borarAeropuerto(@PathVariable Integer id) {
		this.aeropuertosService.eliminaAeropuerto(id);
		return HttpStatus.OK;
	}
	
	@GetMapping("/detalleAeropuerto/{id}")
	public Optional<Aeropuertos> detalleAeropuerto(@PathVariable Integer id){
		return this.aeropuertosService.obtenerAeropuertoId(id);
	}
	

}
