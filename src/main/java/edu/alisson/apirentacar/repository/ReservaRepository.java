package edu.alisson.apirentacar.repository;

import edu.alisson.apirentacar.model.reserva.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, String> {
}
