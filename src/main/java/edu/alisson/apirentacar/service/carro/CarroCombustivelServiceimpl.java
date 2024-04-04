package edu.alisson.apirentacar.service.carro;

import edu.alisson.apirentacar.model.carro.CarroCombustao;
import edu.alisson.apirentacar.repository.CarroCombustaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroCombustivelServiceimpl implements CarroCombustivelService {
    private CarroCombustaoRepository carroCombustaoRepository;

    @Override
    public List<CarroCombustao> getAllCarros() {
        return carroCombustaoRepository.findAll();
    }

    @Override
    public Optional<CarroCombustao> getCarroById(String idCarro) {
        return carroCombustaoRepository.findById(idCarro);
    }

    @Override
    public CarroCombustao postarCarro(CarroCombustao carro) {
        return carroCombustaoRepository.save(carro);
    }

    @Override
    public void deletarCarro(String idCarro) {
        carroCombustaoRepository.deleteById(idCarro);
    }

    @Override
    public CarroCombustao alterarCarro(CarroCombustao carro) {
        String id = carro.getIdCarro();

        if (carroCombustaoRepository.findById(id).isPresent()) {
            carroCombustaoRepository.save(carro);
        }

        return null;
    }
}
