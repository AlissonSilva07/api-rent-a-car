package edu.alisson.apirentacar.service.carro;

import edu.alisson.apirentacar.model.carro.Carro;
import edu.alisson.apirentacar.model.carro.CarroCombustao;
import edu.alisson.apirentacar.model.carro.CarroEletrico;
import edu.alisson.apirentacar.repository.CarroCombustaoRepository;
import edu.alisson.apirentacar.repository.CarroEletricoRepository;
import edu.alisson.apirentacar.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroServiceImpl implements CarroService {
    @Autowired
    private CarroRepository carroRepository;
    @Autowired
    private CarroCombustaoRepository carroCombustivelService;
    @Autowired
    private CarroEletricoRepository carroEletricoService;

    @Override
    public List<Carro> getAll() {
        return carroRepository.findAll();
    }

    @Override
    public void saveCarroCombustivel(CarroCombustao carroCombustao) {
        carroCombustivelService.save(carroCombustao);
    }

    @Override
    public void saveCarroEletrico(CarroEletrico carroEletrico) {
        carroEletricoService.save(carroEletrico);
    }
}