package com.apirest.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.webflux.document.Atividade;
import com.apirest.webflux.service.AtividadeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class AtividadeController {

	@Autowired
	AtividadeService atividadeService;
	
	@GetMapping(value = "/atividade")
	public Flux<Atividade> getAtividades(){
		return atividadeService.findAll();
	}
	
	@GetMapping(value = "/atividade/{id}")
	public Mono<Atividade> getAtividadeId(@PathVariable String id){
		return atividadeService.findById(id);
	}
	
	@PostMapping(value = "/atividade")
	public Mono<Atividade> save(@RequestBody Atividade atividade){
		return atividadeService.save(atividade);
	}
}
