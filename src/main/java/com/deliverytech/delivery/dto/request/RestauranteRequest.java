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
public class RestauranteRequest {

    @NotBlank
    @Schema(description = "Nome do restaurante", example = "restaurante do zé e cia")
    private String nome;

    @NotBlank
    @Schema(description = "Categoria do restaurante", example = "pizzaria")
    private String categoria;

    @NotBlank
    @Schema(description = "Telefone do restaurante", example = "9966666666")
    private String telefone;

    @Positive
    @Schema(description = "Taxa de entrega em Reais (R$)", example = "5.00")
    private BigDecimal taxaEntrega;

    @Min(5)
    @Max(90)
    @Schema(description = "Tempo estimado de entrega em minutos", example = "30")
    private Integer tempoEntregaMinutos;
}
