package edu.alisson.apirentacar.controller;

import edu.alisson.apirentacar.model.carro.Carro;
import edu.alisson.apirentacar.model.carro.CarroCombustao;
import edu.alisson.apirentacar.model.carro.CarroEletrico;
import edu.alisson.apirentacar.service.carro.CarroCombustivelServiceimpl;
import edu.alisson.apirentacar.service.carro.CarroEletricoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("carros")
public class CarroController {
    @Autowired
    private CarroCombustivelServiceimpl carroCombustivelServiceimpl;
    @Autowired
    private CarroEletricoServiceImpl carroEletricoServiceImpl;

    @GetMapping
    public ResponseEntity<List<Object>> getAllCarros() {
        List<Object> lista = new ArrayList<>();

        carroCombustivelServiceimpl.getAllCarros().forEach(carro -> lista.add(carro));
        carroEletricoServiceImpl.getAllCarros().forEach(carro -> lista.add(carro));

        return ResponseEntity.ok(lista);
    }

    @PostMapping("/eletrico")
    public ResponseEntity<CarroEletrico> postCarroEletrico(@RequestBody CarroEletrico carroEletrico) {
        carroEletricoServiceImpl.postarCarro(carroEletrico);
        return ResponseEntity.ok(carroEletrico);
    }

    @PostMapping("/combustao")
    public ResponseEntity<CarroCombustao> postCarroCombustao(@RequestBody CarroCombustao carroCombustao) {
        carroCombustivelServiceimpl.postarCarro(carroCombustao);
        return ResponseEntity.ok(carroCombustao);
    }
}
