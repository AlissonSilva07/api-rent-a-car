package edu.alisson.apirentacar.service.carro;

import edu.alisson.apirentacar.model.carro.CarroCombustao;
import edu.alisson.apirentacar.model.carro.CarroEletrico;

import java.util.List;
import java.util.Optional;

public interface CarroEletricoService {
    List<CarroEletrico> getAllCarros();

    Optional<CarroEletrico> getCarroById(String idCarro);

    CarroEletrico postarCarro(CarroEletrico carro);

    void deletarCarro(String idCarro);

    CarroEletrico alterarCarro(CarroEletrico carro);
}
