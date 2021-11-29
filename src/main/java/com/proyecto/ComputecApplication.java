package com.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ComputecApplication implements CommandLineRunner{

	@Autowired
	private BCryptPasswordEncoder passEncode;
	
	public static void main(String[] args) {
		SpringApplication.run(ComputecApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String pass1 = "user";
		String pass2 = "bruno";
		String pass3 = "piero";
		String pass4 = "jhonatan";
		
		System.out.println(passEncode.encode(pass1));
		System.out.println(passEncode.encode(pass2));
		System.out.println(passEncode.encode(pass3));
		System.out.println(passEncode.encode(pass4));
	}

}
