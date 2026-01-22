package org.example.strategy;

public class Pix implements FormaPagamento{

    @Override
    public void formaPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Pix.");

    }
}
