package com.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.DetVenta;

@Repository
public interface DetVentaRepository extends CrudRepository <DetVenta, Long>{

}
