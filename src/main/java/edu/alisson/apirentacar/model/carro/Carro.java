package edu.alisson.apirentacar.model.carro;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "carro")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_carro", discriminatorType = DiscriminatorType.STRING)
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
    @Enumerated(EnumType.STRING)
    private Transmissao transmissao;
    private Double valorDiaria;
    private boolean disponivel;

    public String getTransmissao() {
        return transmissao.getDescricao();
    }
}
