package edu.alisson.apirentacar.service.carro;

import edu.alisson.apirentacar.model.carro.Carro;
import edu.alisson.apirentacar.model.carro.CarroCombustao;
import edu.alisson.apirentacar.model.carro.CarroEletrico;

import java.util.List;

public interface CarroService {
    public List<Carro> getAll();
    public void saveCarroCombustivel(CarroCombustao carroCombustao);
    public void saveCarroEletrico(CarroEletrico carroEletrico);
}
