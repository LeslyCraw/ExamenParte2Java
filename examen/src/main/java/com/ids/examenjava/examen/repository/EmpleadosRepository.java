package com.ids.examenjava.examen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ids.examenjava.examen.entity.Empleados;

@Repository
public interface EmpleadosRepository extends CrudRepository<Empleados,Integer> {

}
