package com.apirest.webflux;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

// Comentado para desabilitar o Router
//@Configuration
public class AtividadeRouter {

	//@Bean
	public RouterFunction<ServerResponse> route(AtividadeHandler handler){
		return RouterFunctions
				.route(GET("/atividade").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
				.andRoute(GET("/atividade/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::findById)
				.andRoute(POST("/atividade").and(accept(MediaType.APPLICATION_JSON)), handler::save);
			
	}
}
