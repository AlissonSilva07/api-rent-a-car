package edu.alisson.apirentacar.repository;

import edu.alisson.apirentacar.model.carro.CarroCombustao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroCombustaoRepository extends JpaRepository<CarroCombustao, String> {
}
