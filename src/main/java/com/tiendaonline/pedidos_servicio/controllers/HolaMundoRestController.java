package com.tiendaonline.pedidos_servicio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoRestController {

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola Mundo Spring Boot";
    }
}
