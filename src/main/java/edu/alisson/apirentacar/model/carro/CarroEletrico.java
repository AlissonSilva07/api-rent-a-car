package edu.alisson.apirentacar.model.carro;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "carro-eletrico")
@NoArgsConstructor
@Getter
@Setter
public class CarroEletrico extends Carro {
    private String autonomia;

    public CarroEletrico(String idCarro, String marca, String modelo, String cor, Integer ano, Integer passageiros, Integer portas, boolean arCondicionado, Double motor, Transmissao transmissao, Double valorDiaria, boolean disponivel, String autonomia) {
        super(idCarro, marca, modelo, cor, ano, passageiros, portas, arCondicionado, motor, transmissao, valorDiaria, disponivel);
        this.autonomia = autonomia;
    }
}
