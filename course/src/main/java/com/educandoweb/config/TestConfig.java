package com.educandoweb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u1 = new User(null, "Douglas Maciel", "doug@gmail.com", "99999999", "12345");
		User u2 = new User(null, "Isabelly Morais", "isinha@gmail.com", "97777777", "12345");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}
