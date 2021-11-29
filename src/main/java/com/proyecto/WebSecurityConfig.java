package com.proyecto;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private DataSource dataSource;
	
	@Autowired 
	private BCryptPasswordEncoder passEncoder;
		
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/css/**","/js/**","/img/**","/demo/**","/fonts/**","/validate/**","/vendors/**").permitAll()
		.antMatchers("/**").hasAnyRole("ADMIN")
		/*
		.antMatchers("/categoria/**").hasAnyRole("USER")
		.antMatchers("/ingreso/**").hasAnyRole("USER")
		.antMatchers("/producto/**").hasAnyRole("USER")
		.antMatchers("/categoria/**").hasAnyRole("USER")
		.antMatchers("/cliente/").hasAnyRole("USER")
		.antMatchers("/trabajador/").hasAnyRole("USER")
		.antMatchers("/proveedor/").hasAnyRole("USER")
		.antMatchers("/venta/").hasAnyRole("USER")
		*/
		.antMatchers("/cliente/**").hasAnyRole("ADMIN")
		.antMatchers("/categoria/**").hasAnyRole("ADMIN")
		.antMatchers("/ingreso/**").hasAnyRole("ADMIN")
		.antMatchers("/producto/**").hasAnyRole("ADMIN")
		.antMatchers("/trabajador/**").hasAnyRole("ADMIN")
		.antMatchers("/proveedor/**").hasAnyRole("ADMIN")
		.antMatchers("/venta/**").hasAnyRole("ADMIN")
		.anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/login")
		.permitAll()
		.and()
		.logout().permitAll();
	}

	@Autowired
	public void configurerSecurityGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder.jdbcAuthentication()
		.dataSource(dataSource)		
		.passwordEncoder(passEncoder)
		.usersByUsernameQuery("SELECT username, password, enabled FROM usuario WHERE username=?")
		.authoritiesByUsernameQuery("SELECT u.username, r.rol FROM roles r INNER JOIN usuario u ON r.usuario_id=u.id WHERE u.username=?");
		 
	}
}
