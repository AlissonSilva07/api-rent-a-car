package edu.alisson.apirentacar.service.carro;

import edu.alisson.apirentacar.model.carro.Carro;
import edu.alisson.apirentacar.model.carro.CarroCombustao;
import edu.alisson.apirentacar.model.carro.CarroEletrico;

import java.util.List;
import java.util.Optional;

public interface CarroService {
    public List<Carro> getAll();
    public Optional<Carro> getCarroById(String idCarro);
    public void saveCarroCombustivel(CarroCombustao carroCombustao);
    public void saveCarroEletrico(CarroEletrico carroEletrico);
}
