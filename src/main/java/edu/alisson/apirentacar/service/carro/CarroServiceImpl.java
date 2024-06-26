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
import java.util.Optional;

@Service
public class CarroServiceImpl implements CarroService {
    @Autowired
    private CarroRepository carroRepository;
    @Autowired
    private CarroCombustaoRepository carroCombustaoRepository;
    @Autowired
    private CarroEletricoRepository carroEletricoRepository;

    @Override
    public List<Carro> getAll() {
        return carroRepository.findAll();
    }

    @Override
    public Optional<Carro> getCarroById(String idCarro) {
        return carroRepository.findById(idCarro);
    }

    @Override
    public void saveCarroCombustivel(CarroCombustao carroCombustao) {
        carroCombustaoRepository.save(carroCombustao);
    }

    @Override
    public void saveCarroEletrico(CarroEletrico carroEletrico) {
        carroEletricoRepository.save(carroEletrico);
    }

    @Override
    public void deleteCarroCombustivel(String idCarroCombustivel) {
        carroCombustaoRepository.deleteById(idCarroCombustivel);
    }

    @Override
    public void deleteCarroEletrico(String idCarroEletrico) {
        carroEletricoRepository.deleteById(idCarroEletrico);
    }
}
