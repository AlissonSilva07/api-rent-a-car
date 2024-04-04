package edu.alisson.apirentacar.service.carro;

import edu.alisson.apirentacar.model.carro.Carro;
import edu.alisson.apirentacar.model.carro.CarroCombustao;

import java.util.List;
import java.util.Optional;

public interface CarroCombustivelService {
    List<CarroCombustao> getAllCarros();

    Optional<CarroCombustao> getCarroById(String idCarro);

    CarroCombustao postarCarro(CarroCombustao carro);

    void deletarCarro(String idCarro);

    CarroCombustao alterarCarro(CarroCombustao carro);
}
