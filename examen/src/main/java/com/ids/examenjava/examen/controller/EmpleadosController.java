package com.ids.examenjava.examen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ids.examenjava.examen.entity.Empleados;
import com.ids.examenjava.examen.service.EmpleadosService;

@RestController
@RequestMapping("/empleado")
public class EmpleadosController {
	
	@Autowired
	EmpleadosService empleadosServiceImp;
	
	@GetMapping("/Lista")
	public List<Empleados> obtenerEmpleados(){
		return empleadosServiceImp.obtenerEmpleados();
	}
	
	@PostMapping("/AltaEmpleado")
	public Empleados guardarEmpleado(@RequestBody Empleados empleado) {
		return this.empleadosServiceImp.guardarEmpleado(empleado);
	}
	
	@DeleteMapping("/eliminaEmpleado/{id}")
	public HttpStatus borarEmpleado(@PathVariable Integer id) {
		this.empleadosServiceImp.eliminarEmpleado(id);
		return HttpStatus.OK;
	}
	
	@GetMapping("/detalleEmpleado/{id}")
	public Optional<Empleados> obtenerEmpleado(@PathVariable Integer id){
		return this.empleadosServiceImp.obtenerEmpleadoId(id);
			}
}
	
