package com.apirest.webflux;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.apirest.webflux.document.Atividade;
import com.apirest.webflux.repository.AtividadeRepository;

import reactor.core.publisher.Flux;
//
//@Component
//public class DummyData implements CommandLineRunner {
//
//	private final AtividadeRepository atividadesRepository;
//
//	DummyData(AtividadeRepository playlistRepository) {
//		this.atividadesRepository = playlistRepository;
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		atividadesRepository.deleteAll().thenMany(Flux
//				.just("API REST Spring Boot", "Mongo DB", "Java 8", "Github",
//						"Spring Security", "Web Service RESTFULL", "Microservices")
//				.map(nome -> new Atividade(UUID.randomUUID().toString(), nome)).flatMap(atividadesRepository::save))
//				.subscribe(System.out::println);
//	}
//
//}
