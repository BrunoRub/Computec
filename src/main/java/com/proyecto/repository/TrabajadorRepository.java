package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.Trabajador;
@Repository
public interface TrabajadorRepository extends JpaRepository<Trabajador, Integer>{

	/*
	@Query("select t from Trabajador t where t.usuario = ?1 and t.clave = ?2")
	public Trabajador iniciarSesion(String usuario, String clave);
	*/
	public Trabajador findByUsername(String username);
}
