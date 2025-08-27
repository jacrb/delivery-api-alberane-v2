package com.deliverytech.delivery.dto.request;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {

    @NotBlank
    @Schema(description = "Nome do produto", example = "pizza 4 queijos")
    private String nome;

    @NotBlank
    @Schema(description = "Categoria do produto", example = "pizza")
    private String categoria;

    @NotBlank
    @Schema(description = "Descrição detalhada do produto", example = "Pizza 4 queijos - Muçarela, Parmesão, Catupiry, Provolone")
    private String descricao;

    @DecimalMin("0.01")
    @DecimalMax("5000.0")
    @Schema(description = "Preço em Reais (R$) do produto", example = "49.90")
    private BigDecimal preco;

    @Schema(description = "Identificador unico do restaurante", example = "1")
    private Long restauranteId;
}