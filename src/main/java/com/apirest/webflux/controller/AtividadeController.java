package com.apirest.webflux.controller;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.apirest.webflux.document.Atividade;
import com.apirest.webflux.service.AtividadeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;
import java.util.concurrent.TimeUnit;

//Controller reabilitado
@CrossOrigin(origins = "*")
@RestController
public class AtividadeController {

	@Autowired
	AtividadeService service;
	
	@GetMapping(value = "/atividade")
	public Flux<Atividade> getAtividades(){
		return service.findAll();
	}
	
	@GetMapping(value = "/atividade/{id}")
	public Mono<Atividade> getAtividadeId(@PathVariable String id){
		return service.findById(id);
	}
	
	@PostMapping(value = "/atividade")
	public Mono<Atividade> save(@RequestBody Atividade atividade){
		return service.save(atividade);
	}
	

	@GetMapping(value="/atividade/webflux", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Tuple2<Long, Atividade>> getPlaylistByWebflux(){

		System.out.println("---Start get Atividades by WEBFLUX--- " + LocalDateTime.now());
		Flux<Long> interval = Flux.interval(Duration.ofSeconds(5));
        Flux<Atividade> atividadeFlux = service.findAll();

        return Flux.zip(interval, atividadeFlux);
        
	}

	@GetMapping(value="/atividade/mvc")
	public List<String> getPlaylistByMvc() throws InterruptedException {

		System.out.println("---Start get Atividades by MVC--- " + LocalDateTime.now());


		List<String> atividadeList = new ArrayList<>();
		atividadeList.add("Java 8");
		atividadeList.add("Spring Security");
		atividadeList.add("Github");
		atividadeList.add("Deploy de uma aplicação java no IBM Cloud");
		atividadeList.add("Bean no Spring Framework");
		TimeUnit.SECONDS.sleep(15);

		return atividadeList;

	}
}
