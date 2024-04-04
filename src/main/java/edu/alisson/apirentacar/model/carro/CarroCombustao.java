package edu.alisson.apirentacar.model.carro;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "carro-combustao")
@NoArgsConstructor
@Getter
@Setter
public class CarroCombustao extends Carro{
    public String consumo;

    public CarroCombustao(String idCarro, String marca, String modelo, String cor, Integer ano, Integer passageiros, Integer portas, boolean arCondicionado, Double motor, Transmissao transmissao, Double valorDiaria, boolean disponivel, String consumo) {
        super(idCarro, marca, modelo, cor, ano, passageiros, portas, arCondicionado, motor, transmissao, valorDiaria, disponivel);
        this.consumo = consumo;
    }
}
