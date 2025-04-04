package com.tiendaonline.pedidos_servicio.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class StockNotAvailableException extends RuntimeException{

    private Long productId;
    private Integer availableStock;

    public StockNotAvailableException(String message, Long productId, Integer availableStock) {
        super(message);
        this.productId = productId;
        this.availableStock = availableStock;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getAvailableStock() {
        return availableStock;
    }

}
