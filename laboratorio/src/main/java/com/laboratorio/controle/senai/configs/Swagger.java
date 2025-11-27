package com.laboratorio.controle.senai.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Controle de laboratório",
        version = "1.0",
        description = "Giovanna Felisardo, Fabrício Alves, Letícia Teixeira e GAbriel Corrêa"
    )
)
public class Swagger {
    
}