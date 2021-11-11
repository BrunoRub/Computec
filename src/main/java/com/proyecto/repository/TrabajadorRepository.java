package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.entity.Trabajador;

public interface TrabajadorRepository extends JpaRepository<Trabajador, Integer>{

	@Query("select t from Trabajador t where t.usuario = ?1 and t.clave = ?2")
	public Trabajador iniciarSesion(String usuario, String clave);
	
}
