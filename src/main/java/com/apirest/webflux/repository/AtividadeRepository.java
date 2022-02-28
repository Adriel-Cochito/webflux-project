package com.apirest.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.webflux.document.Atividade;

public interface AtividadeRepository extends ReactiveMongoRepository<Atividade, String>{

}
