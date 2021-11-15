package com.proyecto.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Trabajador;
import com.proyecto.repository.TrabajadorRepository;
@Service
public class DetalleTrabajadorServiceImp {
/*
	@Autowired
	private TrabajadorRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Trabajador trabajador = repository.findByUsername(username);
		UserBuilder builder = null;
		
		if (trabajador != null) {
			builder = User.withUsername(username);
			builder.disabled(false);
			builder.password(trabajador.getClave());
			builder.authorities(new SimpleGrantedAuthority("ROLE_USER"));
		}else {
			throw new UsernameNotFoundException("Usuario no encontrado");
		}
		
		return builder.build();
	}
*/
}
