package com.kris.mybatisdemo;

import com.kris.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MybatisDemoApplication.class, args);
	}


	@Autowired
	private UserService userService;

	@Override
	public void run(String... args){
		System.out.println(userService.findAll());
	}
}
