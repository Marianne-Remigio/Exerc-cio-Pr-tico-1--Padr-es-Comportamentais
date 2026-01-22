package org.example.observer;

public class NotificadorEmail implements EstoqueObserver{

    private String email;

    public NotificadorEmail(String email) {
        this.email = email;
    }

    @Override
    public void update(String produto) {
        System.out.println("E-mail enviado para " + email + ": Novo produto disponível - " + produto);
    }
}
