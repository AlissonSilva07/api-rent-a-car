package edu.alisson.apirentacar.controller;

import edu.alisson.apirentacar.model.carro.Carro;
import edu.alisson.apirentacar.model.carro.CarroCombustao;
import edu.alisson.apirentacar.model.carro.CarroEletrico;
import edu.alisson.apirentacar.service.carro.CarroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("carros")
public class CarroController {
    @Autowired
    private CarroServiceImpl carroService;

    @GetMapping
    public ResponseEntity<List<Carro>> getAllCarros() {
        return ResponseEntity.ok(carroService.getAll());
    }

    @GetMapping("/{idCarro}")
    public ResponseEntity<Optional<Carro>> getCarroById(@PathVariable String idCarro) {
        return ResponseEntity.ok(carroService.getCarroById(idCarro));
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

    @DeleteMapping("/combustao/{idCarroCombustivel}")
    public ResponseEntity<String> deleteCarroCombustao(@PathVariable String idCarroCombustivel) {
        carroService.deleteCarroCombustivel(idCarroCombustivel);
        return ResponseEntity.ok("O carro de id " + idCarroCombustivel + " foi devidamente deletado da base de dados.");
    }

    @DeleteMapping("/eletrico/{idCarroEletrico}")
    public ResponseEntity<String> deleteCarroEletrico(@PathVariable String idCarroEletrico) {
        carroService.deleteCarroEletrico(idCarroEletrico);
        return ResponseEntity.ok("O carro de id " + idCarroEletrico + " foi devidamente deletado da base de dados.");
    }
}
