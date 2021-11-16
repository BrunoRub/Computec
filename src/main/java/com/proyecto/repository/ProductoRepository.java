package com.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
