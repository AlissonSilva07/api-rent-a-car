package edu.alisson.apirentacar.controller;

import edu.alisson.apirentacar.model.carro.Carro;
import edu.alisson.apirentacar.model.carro.CarroCombustao;
import edu.alisson.apirentacar.model.carro.CarroEletrico;
import edu.alisson.apirentacar.service.carro.CarroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("carros")
public class CarroController {
    @Autowired
    private CarroServiceImpl carroService;

    @GetMapping
    public ResponseEntity<List<Carro>> getAllCarros() {
        return ResponseEntity.ok(carroService.getAll());
    }

    @PostMapping("/eletrico")
    public ResponseEntity<CarroEletrico> postCarroEletrico(@RequestBody CarroEletrico carroEletrico) {
        carroService.saveCarroEletrico(carroEletrico);
        return ResponseEntity.ok(carroEletrico);
    }

    @PostMapping("/combustao")
    public ResponseEntity<CarroCombustao> postCarroCombustao(@RequestBody CarroCombustao carroCombustao) {
        carroService.saveCarroCombustivel(carroCombustao);
        return ResponseEntity.ok(carroCombustao);
    }
}
