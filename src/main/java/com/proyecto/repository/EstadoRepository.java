package com.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.Estado;

@Repository
public interface EstadoRepository extends CrudRepository<Estado, Integer>{

}
