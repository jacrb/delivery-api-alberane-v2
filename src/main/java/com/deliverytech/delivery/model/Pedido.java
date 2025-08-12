package com.deliverytech.delivery.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pedido {
    private Long id;
    private Cliente cliente;
    private Restaurante restaurante;
    private BigDecimal total;
    private StatusPedido status;
    private LocalDateTime dataPedido = LocalDateTime.now();
    private List<ItemPedido> itens;
    private Endereco enderecoEntrega;
}
