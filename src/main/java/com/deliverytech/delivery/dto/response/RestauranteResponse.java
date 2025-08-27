package com.deliverytech.delivery.dto.response;

import lombok.*;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Representa um restaurante registrado no sistema", 
example = "{\"id\":1,\"nome\":\"Restaurante do mar\",\"categoria\":\"frutos do mar\",\"telefone\":\"4411223344\",\"taxa de entrega\":12.00,\"tempo de entrega\":45,\"disponivel\":true}")
public class RestauranteResponse {
    @Schema(description = "Identificador unico do restaurante", example = "1")
    private Long id;

    @Schema(description = "Nome do restaurante", example = "Restaurante do zé e cia")
    private String nome;

    @Schema(description = "Categoria do restaurante", example = "brasileira")
    private String categoria;

    @Schema(description = "Telefone do restaurante", example = "9966666666")
    private String telefone;

    @Schema(description = "Taxa de entrega em Reais (R$)", example = "5.50")
    private BigDecimal taxaEntrega;

    @Schema(description = "Tempo estimado de entrega em minutos", example = "30")
    private Integer tempoEntregaMinutos;

    @Schema(description = "Disponibilidade do restaurante", example = "true")
    private Boolean ativo;
}
