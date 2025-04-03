package com.tiendaonline.pedidos_servicio.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import java.util.List;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long usuarioId;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private LocalDateTime fechaCreacion;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<OrderDetail> detalles;

    public Order() {
    }

    public Order(Long id, Long usuarioId, String estado, LocalDateTime fechaCreacion, List<OrderDetail> detalles) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.detalles = detalles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<OrderDetail> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<OrderDetail> detalles) {
        this.detalles = detalles;
    }
}
