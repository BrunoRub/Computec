package com.proyecto.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Producto;
import com.proyecto.repository.ProductoRepository;
import com.proyecto.service.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Producto registrar(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepository.save(producto);
	}

	@Override
	public Producto actualizar(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepository.save(producto);
	}

	@Override
	public Integer eliminar(Long idproducto) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(idproducto);
		Optional<Producto> emp = productoRepository.findById(idproducto);
		if(emp.isPresent()) {
			return -1;
		}
		return  1;
	}

	@Override
	public Optional<Producto> obtenerPorId(Long idproducto) {
		// TODO Auto-generated method stub
		return productoRepository.findById(idproducto);
	}
	
	@Override
	public List<Producto> obtenerProducto() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoRepository.findAll();
	}
 
}
