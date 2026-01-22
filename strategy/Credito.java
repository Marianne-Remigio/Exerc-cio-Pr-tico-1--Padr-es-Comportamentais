package org.example.strategy;

public class Credito implements FormaPagamento{
    @Override
    public void formaPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via cartão de crédito.");
    }
}
