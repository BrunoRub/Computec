package com.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.Trabajador;

@Repository
public interface TrabajadorRepository extends CrudRepository <Trabajador, Long>{

}
