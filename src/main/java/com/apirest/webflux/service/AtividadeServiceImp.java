package com.apirest.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.webflux.document.Atividade;
import com.apirest.webflux.repository.AtividadeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AtividadeServiceImp implements AtividadeService{

	@Autowired
	AtividadeRepository atividadeRepository;
	
	@Override
	public Flux<Atividade> findAll() {		
		return atividadeRepository.findAll();
	}

	@Override
	public Mono<Atividade> findById(String id) {
		return atividadeRepository.findById(id);
	}

	@Override
	public Mono<Atividade> save(Atividade atividade) {
		return atividadeRepository.save(atividade);
	}

}
