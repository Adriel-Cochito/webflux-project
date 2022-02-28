package com.apirest.webflux;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.apirest.webflux.document.Atividades;
import com.apirest.webflux.repository.AtividadesRepository;

import reactor.core.publisher.Flux;

@Component
public class DummyData implements CommandLineRunner {

	private final AtividadesRepository atividadesRepository;

	DummyData(AtividadesRepository playlistRepository) {
		this.atividadesRepository = playlistRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		atividadesRepository.deleteAll().thenMany(Flux
				.just("API REST Spring Boot", "Mongo DB", "Java 8", "Github",
						"Spring Security", "Web Service RESTFULL", "Microservices")
				.map(nome -> new Atividades(UUID.randomUUID().toString(), nome)).flatMap(atividadesRepository::save))
				.subscribe(System.out::println);
	}

}
