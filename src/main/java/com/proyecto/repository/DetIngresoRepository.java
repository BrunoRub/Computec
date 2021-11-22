package com.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.DetIngrego;

@Repository
public interface DetIngresoRepository extends CrudRepository<DetIngrego, Long>{

}
