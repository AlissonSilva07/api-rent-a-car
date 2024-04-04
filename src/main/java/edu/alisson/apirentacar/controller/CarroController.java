package edu.alisson.apirentacar.controller;

import edu.alisson.apirentacar.model.carro.CarroCombustao;
import edu.alisson.apirentacar.model.carro.CarroEletrico;
import edu.alisson.apirentacar.service.carro.CarroCombustivelServiceimpl;
import edu.alisson.apirentacar.service.carro.CarroEletricoServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarroController {
    private CarroCombustivelServiceimpl carroCombustivelServiceimpl;
    private CarroEletricoServiceImpl carroEletricoServiceImpl;

    @GetMapping("/carros")
    public ResponseEntity<List<Object>> getAllCarros() {
        List<Object> lista = new ArrayList<>();

        lista.add(carroCombustivelServiceimpl.getAllCarros());
        lista.add(carroEletricoServiceImpl.getAllCarros());

        return ResponseEntity.ok(lista);
    }

    @GetMapping("/carros/{id}")
    public ResponseEntity<String> getCarroById(@PathVariable(name = "id") String idCarro) {
        return ResponseEntity.ok("continuar");
    }
}
