package edu.alisson.apirentacar.model.carro;

public enum Transmissao {
    MANUAL("Manual"),
    AUTOMATICA("Automatica");

    private String descricao;

    Transmissao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
