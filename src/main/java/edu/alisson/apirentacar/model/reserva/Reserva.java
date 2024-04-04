package edu.alisson.apirentacar.model.reserva;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "reserva")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idReserva;
    private Object carro;
    private Date dataReserva;
    private Date dataInicio;
    private Date dataFim;
}
