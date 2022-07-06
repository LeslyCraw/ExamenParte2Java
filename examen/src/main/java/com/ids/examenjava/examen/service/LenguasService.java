package com.ids.examenjava.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ids.examenjava.examen.entity.Lenguas;
import com.ids.examenjava.examen.repository.LenguasRepository;

@Service
public class LenguasService {
	@Autowired
	private LenguasRepository lenguasRepository;
	
	// metodo que obtine la lista de lenguas
	public List<Lenguas> obtenerLenguas(){
		return (List<Lenguas>) lenguasRepository.findAll();
	}
	
	// metodo 	que obtiene una lengua por su id 
	
	public Optional<Lenguas> obtenerLenguaId(Integer id){
		return lenguasRepository.findById(id);
	}
	
	//metodo que inserta una lengua en la bd
	
	public Lenguas guardarLengua(Lenguas lengua) {
		return lenguasRepository.save(lengua);
	}
	
	//metodo que elimina una lengua de la bd
	
	public void eliminaLengua(Integer lenguaId) {
		lenguasRepository.deleteById(lenguaId);
	}
}
