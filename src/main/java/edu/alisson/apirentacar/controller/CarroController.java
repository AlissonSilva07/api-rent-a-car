package edu.alisson.apirentacar.controller;

import edu.alisson.apirentacar.model.carro.Carro;
import edu.alisson.apirentacar.model.carro.CarroCombustao;
import edu.alisson.apirentacar.model.carro.CarroEletrico;
import edu.alisson.apirentacar.response.Response;
import edu.alisson.apirentacar.service.carro.CarroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
    public ResponseEntity<Response> getCarroById(@PathVariable String idCarro) {
        Optional<Carro> result = carroService.getCarroById(idCarro);
        try {
            if (result.isEmpty()) {
                return ResponseEntity.status(404).body(new Response(false,null, "Nenhum carro com o id informado foi encontrado."));
            }
            return ResponseEntity.status(200).body(new Response(true,result, "Registro retornado com sucesso."));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(new Response(false,null, "Erro no servidor."));
        }
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
