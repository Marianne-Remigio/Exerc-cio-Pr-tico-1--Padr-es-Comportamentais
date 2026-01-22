package org.example.observer;

public class Usuario implements EstoqueObserver{

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String produto) {
        System.out.println("Notificação para " + nome + ": Novo produto disponível - " + produto);
    }
}
