package br.com.github.lucasplopes.simulador.model.entities;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class JurosCompostos {

    private BigDecimal montante;
    
    @NotBlank(message = "capital em branco")
    @NotNull(message = "capital nulo")
    private BigDecimal capital;

    @NotBlank(message = "taxa em branco")
    @NotNull(message = "taxa nulo")
    private BigDecimal taxa;

    @NotBlank(message = "periodo em branco")
    @NotNull(message = "periodo nulo")
    private BigDecimal periodo;

    @JsonProperty("juros-por-periodo")
    private BigDecimal jurosPorPeriodo;


}