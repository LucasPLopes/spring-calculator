package br.com.github.lucasplopes.simulador.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import br.com.github.lucasplopes.simulador.model.entities.JurosCompostos;

@Component
public class SimuladorService {

    public JurosCompostos calcular(JurosCompostos modelo){
        BigDecimal jurosPorPeriodo = modelo.getTaxa().add(BigDecimal.ONE).pow(
            modelo.getPeriodo().intValue()
        ).setScale(2);
        BigDecimal montante =modelo.getCapital().multiply(jurosPorPeriodo);

        modelo.setMontante(montante.setScale(2));
        modelo.setJurosPorPeriodo(jurosPorPeriodo.add(BigDecimal.ONE.negate()));
        return modelo;
    }
    
}
