package com.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.Ingreso;

@Repository
public interface IngresoRepository extends CrudRepository <Ingreso, Long>{

}
