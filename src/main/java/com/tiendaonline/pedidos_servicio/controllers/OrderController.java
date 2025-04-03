package com.tiendaonline.pedidos_servicio.controllers;

import com.tiendaonline.pedidos_servicio.dto.OrderRequest;
import com.tiendaonline.pedidos_servicio.entity.Order;
import com.tiendaonline.pedidos_servicio.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/pedidos")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest orderRequest){
        Order newOrder = orderService.createOrder(orderRequest.getOrder(), orderRequest.getDetails());
        return ResponseEntity.ok(newOrder);
    }
}
