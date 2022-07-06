package com.ids.examenjava.examen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ids.examenjava.examen.entity.Aeropuertos;

@Repository
public interface AeropuertosRepository extends CrudRepository<Aeropuertos, Integer>{

}
