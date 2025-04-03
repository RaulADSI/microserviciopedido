package com.tiendaonline.pedidos_servicio.dto;

import com.tiendaonline.pedidos_servicio.entity.Order;
import com.tiendaonline.pedidos_servicio.entity.OrderDetail;
import java.util.List;

//Clase Wrapper
public class OrderRequest {

    private Order order;
    private List<OrderDetail> details;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<OrderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetail> details) {
        this.details = details;
    }

}
