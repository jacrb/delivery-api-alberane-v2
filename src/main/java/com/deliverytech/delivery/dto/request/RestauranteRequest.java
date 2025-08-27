package com.deliverytech.delivery.dto.request;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(
    description = "Requisição para criar ou atualizar um restaurante",
    example = "{"
            + "\"nome\":\"Pizzaria Napoli\","
            + "\"categoria\":\"Italiana\","
            + "\"telefone\":\"(11) 98765-4321\","
            + "\"taxaEntrega\":7.50,"
            + "\"tempoEntregaMinutos\":40"
            + "}"
)
public class RestauranteRequest {

    @Schema(
        description = "Nome do restaurante",
        example = "Pizzaria Napoli",
        required = true
    )
    @NotBlank
    @Schema(description = "Nome do restaurante", example = "restaurante do zé e cia")
    private String nome;

    @Schema(
        description = "Categoria ou tipo de culinária do restaurante",
        example = "Italiana",
        required = true
    )
    @NotBlank
    @Schema(description = "Categoria do restaurante", example = "pizzaria")
    private String categoria;

    @Schema(
        description = "Número de telefone do restaurante",
        example = "(11) 98765-4321",
        required = true
    )
    @NotBlank
    @Schema(description = "Telefone do restaurante", example = "9966666666")
    private String telefone;

    @Schema(
        description = "Valor da taxa de entrega em Reais (R$), deve ser positivo",
        example = "7.50",
        required = true
    )
    @Positive
    @Schema(description = "Taxa de entrega em Reais (R$)", example = "5.00")
    private BigDecimal taxaEntrega;

    @Schema(
        description = "Tempo estimado de entrega em minutos (mínimo 5, máximo 90)",
        example = "40",
        required = true
    )
    @Min(5)
    @Max(90)
    @Schema(description = "Tempo estimado de entrega em minutos", example = "30")
    private Integer tempoEntregaMinutos;
}
