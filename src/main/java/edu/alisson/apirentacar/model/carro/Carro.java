package edu.alisson.apirentacar.model.carro;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "carro")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idCarro;
    private String marca;
    private String modelo;
    private String cor;
    private Integer ano;
    private Integer passageiros;
    private Integer portas;
    private boolean arCondicionado;
    private Double motor;
    private Transmissao transmissao;
    private Double valorDiaria;
    private boolean disponivel;
}
