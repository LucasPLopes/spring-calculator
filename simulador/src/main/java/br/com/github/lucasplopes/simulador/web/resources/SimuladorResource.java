package br.com.github.lucasplopes.simulador.web.resources;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.github.lucasplopes.simulador.model.entities.JurosCompostos;
import br.com.github.lucasplopes.simulador.services.SimuladorService;

@RestController
@RequestMapping("/simulador")
public class SimuladorResource {

    private SimuladorService service;
    
    
    public SimuladorResource(SimuladorService service) {
        this.service = service;
    }


    @PostMapping()
    public  JurosCompostos calcular(@RequestBody JurosCompostos modelo) {
        return this.service.calcular(modelo);
    }
    
}
