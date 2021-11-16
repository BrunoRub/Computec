package com.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

}
