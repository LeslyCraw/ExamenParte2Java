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

import com.ids.examenjava.examen.entity.Empleados;
import com.ids.examenjava.examen.entity.Lenguas;
import com.ids.examenjava.examen.service.LenguasService;

@RestController
@RequestMapping("Lenguajes")
public class LenguasController {
	@Autowired
	LenguasService lenguasService;
	
	@GetMapping("/ListaLenguas")
	public List<Lenguas> obtenerLenguas(){
		return lenguasService.obtenerLenguas();
	}
	

	
	@DeleteMapping("/eliminarLengua/{id}")
		public HttpStatus borarLengua(@PathVariable Integer id) {
			this.lenguasService.eliminaLengua(id);
			return HttpStatus.OK;
		}
	@GetMapping("/detalleEmpleado/{id}")
	public Optional<Lenguas> obtenerLengua(@PathVariable Integer id){
		return this.lenguasService.obtenerLenguaId(id);
			}
	
}


