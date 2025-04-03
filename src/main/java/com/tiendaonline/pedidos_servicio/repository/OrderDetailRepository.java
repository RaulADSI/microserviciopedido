package com.tiendaonline.pedidos_servicio.repository;

import com.tiendaonline.pedidos_servicio.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
