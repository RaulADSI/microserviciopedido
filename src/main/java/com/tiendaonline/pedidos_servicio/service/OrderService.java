package com.tiendaonline.pedidos_servicio.service;

import com.tiendaonline.pedidos_servicio.entity.Order;
import com.tiendaonline.pedidos_servicio.entity.OrderDetail;
import com.tiendaonline.pedidos_servicio.repository.OrderDetailRepository;
import com.tiendaonline.pedidos_servicio.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderDetailRepository orderDetailRepository;

    public OrderService(OrderRepository orderRepository, OrderDetailRepository orderDetailRepository) {
        this.orderRepository = orderRepository;
        this.orderDetailRepository = orderDetailRepository;
    }

    public Order createOrder(Order order, List<OrderDetail> details){
        Order newOrder = orderRepository.save(order);
        for (OrderDetail detail : details){
            detail.setPedido(newOrder);
            orderDetailRepository.save(detail);
        }
        return newOrder;
    }
}
