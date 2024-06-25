package edu.alisson.apirentacar.repository;

import edu.alisson.apirentacar.model.carro.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, String> {
}
