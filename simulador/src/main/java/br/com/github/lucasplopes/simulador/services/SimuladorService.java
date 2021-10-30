package br.com.github.lucasplopes.simulador.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import br.com.github.lucasplopes.simulador.model.entities.JurosCompostos;

@Component
public class SimuladorService {

    public JurosCompostos calcular(JurosCompostos modelo){
        BigDecimal montante =modelo.getCapital().multiply(modelo.getTaxa().add(BigDecimal.ONE).multiply(
            modelo.getPeriodo()
        ));
        modelo.setMontante(montante);
        return modelo;
    }
    
}
