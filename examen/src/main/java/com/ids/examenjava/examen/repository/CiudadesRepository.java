package com.ids.examenjava.examen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ids.examenjava.examen.entity.Ciudades;

@Repository
public interface CiudadesRepository extends CrudRepository<Ciudades, Integer> {

}
