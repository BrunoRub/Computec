package com.proyecto.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Venta;
import com.proyecto.repository.VentaRepository;
import com.proyecto.service.VentaService;

@Service
public class VentaServiceImp implements VentaService{
	
	@Autowired
	VentaRepository repository;

	@Override
	public List<Venta> listaVentas() {		
		return (List<Venta>) repository.findAll();
	}

	@Override
	public Venta registraVenta(Venta v) {
		
		return repository.save(v);
	}

	@Override
	public Integer eliminaVenta(Long idcategoria) {
		
		 repository.deleteById(idcategoria);
		 Optional<Venta> venta=repository.findById(idcategoria);
		 if(venta.isEmpty()) {
			 return -1;
		 }
		return 1;
	}

	@Override
	public Venta actualizaVenta(Venta v) {
		
		return repository.save(v);
	}

}
