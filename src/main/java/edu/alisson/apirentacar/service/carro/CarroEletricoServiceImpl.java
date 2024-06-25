package edu.alisson.apirentacar.service.carro;

import edu.alisson.apirentacar.model.carro.CarroEletrico;
import edu.alisson.apirentacar.repository.CarroEletricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroEletricoServiceImpl implements CarroEletricoService {
    @Autowired
    private CarroEletricoRepository carroEletricoRepository;

    @Override
    public List<CarroEletrico> getAllCarros() {
        return carroEletricoRepository.findAll();
    }

    @Override
    public Optional<CarroEletrico> getCarroById(String idCarro) {
        return carroEletricoRepository.findById(idCarro);
    }

    @Override
    public CarroEletrico postarCarro(CarroEletrico carro) {
        return carroEletricoRepository.save(carro);
    }

    @Override
    public void deletarCarro(String idCarro) {

    }

    @Override
    public CarroEletrico alterarCarro(CarroEletrico carro) {
        String id = carro.getIdCarro();

        if (carroEletricoRepository.findById(id).isPresent()) {
            carroEletricoRepository.save(carro);
        }

        return null;
    }
}
