package com.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.Proveedor;

@Repository
public interface ProveedorRepository extends CrudRepository <Proveedor, Long>{

}
