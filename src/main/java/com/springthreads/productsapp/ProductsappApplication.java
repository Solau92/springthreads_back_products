package com.springthreads.productsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsappApplication {

	public static void main(String[] args) {

		System.setProperty("spring.profiles.active","dev");
		SpringApplication.run(ProductsappApplication.class, args);
	}

}
