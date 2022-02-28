package com.apirest.webflux.service;

import com.apirest.webflux.document.Atividade;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AtividadeService {

	Flux<Atividade> findAll();
	Mono<Atividade> findById(String id);
	Mono<Atividade> save(Atividade atividade);
}
