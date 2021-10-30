package br.com.github.lucasplopes.simulador.model.entities;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class JurosCompostos {

    private BigDecimal montante;
    private BigDecimal capital;
    private BigDecimal taxa;
    private BigDecimal periodo;


}