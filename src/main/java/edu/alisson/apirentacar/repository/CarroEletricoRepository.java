package edu.alisson.apirentacar.repository;

import edu.alisson.apirentacar.model.carro.Carro;
import edu.alisson.apirentacar.model.carro.CarroEletrico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroEletricoRepository extends JpaRepository<CarroEletrico, String> {
}
