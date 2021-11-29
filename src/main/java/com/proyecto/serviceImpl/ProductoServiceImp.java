package com.proyecto.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Producto;
import com.proyecto.repository.ProductoRepository;
import com.proyecto.service.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Producto registrar(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Producto actualizar(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Integer eliminar(Long idpro) {
		productoRepository.deleteById(idpro);
		Optional<Producto> emp = productoRepository.findById(idpro);
		if (emp.isPresent()) {
			return -1;
		}
		return 1;
	}

	@Override
	public Optional<Producto> obtenerPorId(Long idpro) {
		return productoRepository.findById(idpro);
	}

	@Override
	public List<Producto> obtenerProducto() {
		return (List<Producto>) productoRepository.findAll();
	}

}
