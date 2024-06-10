package com.example.jdbcclient.demo;

import com.example.jdbcclient.demo.entity.Client;
import com.example.jdbcclient.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJdbcClientApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoJdbcClientApplication.class, args);
	}


	@Autowired
	private ClientRepository repository;

	@Override
	public void run(String... args) throws Exception {

		var clientEdmar = new Client(1l, "Edmar", "Rua A", 123456L);
		var clientElias = new Client(2l, "Elias", "Rua N", 555666L);

		repository.save(clientEdmar);
		repository.save(clientElias);

		System.out.println(repository.findById(clientElias.id()));

		System.out.println("FIND ALL");

		System.out.println(repository.findAll());

		var elias = repository.findById(clientElias.id());
		var eliasUpdated = elias.withNewAddress("Rua E");
		repository.update(eliasUpdated);

		System.out.println(repository.findById(clientElias.id()));

		System.out.println("DELETE");

		repository.deleteById(clientEdmar.id());

		System.out.println("FIND ALL");

		System.out.println(repository.findAll());




	}
}
