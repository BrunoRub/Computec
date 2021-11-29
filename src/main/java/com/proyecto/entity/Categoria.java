package com.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categoria")
@Getter
@Setter
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcat;

	@Column(name = "descripcion", length = 100, nullable = false)
	private String descripcion;

	//@Column(columnDefinition = "TINTINT")
	@Column(name = "estado", length = 100, nullable = false)
	private int estado;

	//@OneToMany(mappedBy = "categoria")
	//private List<Producto> producto = new ArrayList<Producto>();


}
