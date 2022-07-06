package com.ids.examenjava.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ids.examenjava.examen.entity.Empleados;
import com.ids.examenjava.examen.repository.EmpleadosRepository;

@Service
public class EmpleadosService {

	@Autowired
	private EmpleadosRepository empleadosrepository;
	

	public List<Empleados> obtenerEmpleados() {
		return(List<Empleados>) empleadosrepository.findAll();
	}
	
	public Empleados guardarEmpleado(Empleados empleado) {
		return empleadosrepository.save(empleado);
	}
	
	public Optional<Empleados> obtenerEmpleadoId(Integer id) {
		return empleadosrepository.findById(id);
		
	}
	
	public void eliminarEmpleado(Integer empleadoId) {
	 empleadosrepository.deleteById(empleadoId);
	}
	
	
}
