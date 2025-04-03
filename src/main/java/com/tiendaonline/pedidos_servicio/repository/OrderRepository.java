package com.tiendaonline.pedidos_servicio.repository;

import com.tiendaonline.pedidos_servicio.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
