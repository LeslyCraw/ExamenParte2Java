package com.ids.examenjava.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ids.examenjava.examen.entity.Aeropuertos;
import com.ids.examenjava.examen.entity.Ciudades;
import com.ids.examenjava.examen.entity.Empleados;
import com.ids.examenjava.examen.entity.Lenguas;
import com.ids.examenjava.examen.service.AeropuertosService;
import com.ids.examenjava.examen.service.CiudadesService;
import com.ids.examenjava.examen.service.EmpleadosService;
import com.ids.examenjava.examen.service.LenguasService;

@RestController
@RequestMapping("/python")
public class PytonController {
	String nomCiudad;
	
	@Autowired
	EmpleadosService empleadosServiceImp;
	@Autowired
	CiudadesService ciudadesService;
	@Autowired
	LenguasService lenguasService;
	@Autowired
	AeropuertosService aeropuertosService;
	
	@GetMapping("/apiv1/clientes/add/{nombre}/{apellido}/{ciudad}/{lengua}/{aeropuerto}") ///{aeropuerto}
	public Empleados guardarDatos(@PathVariable String nombre, @PathVariable String apellido, @PathVariable String ciudad,
			@PathVariable String lengua, @PathVariable String aeropuerto, Empleados empleado) {
		System.out.println(ciudad);
		empleado.setNombre(nombre);
		empleado.setApellido(apellido);
		
		guardarCiudadArchivo(ciudad);
		guardarLenguaArchivo(lengua);
		guardaAeropuertoArchivo(aeropuerto);
		
		return this.empleadosServiceImp.guardarEmpleado(empleado);
	}
	public Ciudades guardarCiudadArchivo(String ciudad) {
		Ciudades ciudadArch = new Ciudades();
		ciudadArch.setNombre(ciudad);
		return this.ciudadesService.guardarCiudades(ciudadArch);
	}
	public Lenguas guardarLenguaArchivo(String lengua) {
		Lenguas lenguaArch = new Lenguas();
		lenguaArch.setNombre(lengua);
		return this.lenguasService.guardarLengua(lenguaArch);
	}
	
	public Aeropuertos guardaAeropuertoArchivo(String aeropuerto) {
		Aeropuertos aeropuertoArch = new Aeropuertos();
		aeropuertoArch.setNombre(aeropuerto);
		return this.aeropuertosService.guardarAeropuertos(aeropuertoArch);
	}
	
}
