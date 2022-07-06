package com.ids.examenjava.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ids.examenjava.examen.entity.Ciudades;
import com.ids.examenjava.examen.repository.CiudadesRepository;

@Service
public class CiudadesService {
	
	@Autowired
	private CiudadesRepository ciudadesRepository;
	
	//metodo para obtener lista de ciudades
	public List<Ciudades> obtenerCiudades(){
		return (List<Ciudades>) ciudadesRepository.findAll();
	}
	
	//metodo que obtiene una ciudad por su id
	public Optional<Ciudades> obtenerCiudadId(Integer id){
		return ciudadesRepository.findById(id);
	}
	
	//metodo que inserta una ciudad en la bd
	public Ciudades guardarCiudades(Ciudades ciudad) {
		return ciudadesRepository.save(ciudad);
	}
	
	//metodo que elimina una ciudad de la bd 
	public void eliminaCiudad(Integer CiudadId) {
		ciudadesRepository.deleteById(CiudadId);
	}
}
