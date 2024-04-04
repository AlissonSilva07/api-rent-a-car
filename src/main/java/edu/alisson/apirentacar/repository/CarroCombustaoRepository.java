package edu.alisson.apirentacar.repository;

import edu.alisson.apirentacar.model.carro.CarroCombustao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroCombustaoRepository extends JpaRepository<CarroCombustao, String> {
}
