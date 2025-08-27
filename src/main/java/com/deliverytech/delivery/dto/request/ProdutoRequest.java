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
@Schema(
    description = "Requisição para criar ou atualizar um produto do restaurante",
    example = "{"
            + "\"nome\":\"Pizza Calabresa\","
            + "\"categoria\":\"Pizza\","
            + "\"descricao\":\"Pizza Calabresa com muçarela e cebola\","
            + "\"preco\":49.90,"
            + "\"restauranteId\":5"
            + "}"
)
public class ProdutoRequest {

    @Schema(
        description = "Nome do produto",
        example = "Pizza Calabresa",
        required = true
    )
    @NotBlank
    @Schema(description = "Nome do produto", example = "pizza 4 queijos")
    private String nome;

    @Schema(
        description = "Categoria ou tipo de culinária do produto",
        example = "Pizza",
        required = true
    )
    @NotBlank
    @Schema(description = "Categoria do produto", example = "pizza")
    private String categoria;

    @Schema(
        description = "Descrição detalhada do produto",
        example = "Pizza Calabresa com muçarela e cebola",
        required = true
    )
    @NotBlank
    @Schema(description = "Descrição detalhada do produto", example = "Pizza 4 queijos - Muçarela, Parmesão, Catupiry, Provolone")
    private String descricao;

    @Schema(
        description = "Preço do produto em Reais (R$), entre 0.01 e 5000.00",
        example = "49.90",
        required = true
    )
    @DecimalMin("0.01")
    @DecimalMax("5000.0")
    @Schema(description = "Preço em Reais (R$) do produto", example = "49.90")
    private BigDecimal preco;

    @Schema(
        description = "Identificador do restaurante ao qual o produto pertence",
        example = "5"
    )
    private Long restauranteId;
}