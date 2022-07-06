package com.ids.examenjava.examen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ids.examenjava.examen.entity.Lenguas;

@Repository
public interface LenguasRepository  extends CrudRepository<Lenguas,Integer> {

}