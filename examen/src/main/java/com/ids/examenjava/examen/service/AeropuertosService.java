package com.ids.examenjava.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ids.examenjava.examen.entity.Aeropuertos;
import com.ids.examenjava.examen.repository.AeropuertosRepository;

@Service
public class AeropuertosService {

	@Autowired
	AeropuertosRepository aeropuertosRepository;
	
	//metodo para obtener lista de aeropuertos
		public List<Aeropuertos> obtenerAeropuertos(){
			return (List<Aeropuertos>) aeropuertosRepository.findAll();
		}
		
		//metodo que obtiene un aeropuerto por su id
		public Optional<Aeropuertos> obtenerAeropuertoId(Integer id){
			return aeropuertosRepository.findById(id);
		}	
		
		//metodo que inserta un aeropuerto en la bd
		public Aeropuertos guardarAeropuertos(Aeropuertos aeropuerto) {
			return aeropuertosRepository.save(aeropuerto);
		}
		
		//metodo que elimina una ciudad de la bd 
		public void eliminaAeropuerto(Integer AeropuertoId) {
			aeropuertosRepository.deleteById(AeropuertoId);
		}
		
}
