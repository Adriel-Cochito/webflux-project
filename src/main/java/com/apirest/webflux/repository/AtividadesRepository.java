package com.apirest.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.webflux.document.Atividades;

public interface AtividadesRepository extends ReactiveMongoRepository<Atividades, String>{

}
