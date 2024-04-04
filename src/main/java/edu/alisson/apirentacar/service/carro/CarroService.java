package edu.alisson.apirentacar.service.carro;

import edu.alisson.apirentacar.repository.CarroCombustaoRepository;
import edu.alisson.apirentacar.repository.CarroEletricoRepository;

import java.util.List;

public interface CarroService {
    List<Object> getAllCarros();

    Object getCarroById(String idCarro);

    Object postarCarro();

    void deletarCarro(String idCarro);

    Object alterarCarro();
}
