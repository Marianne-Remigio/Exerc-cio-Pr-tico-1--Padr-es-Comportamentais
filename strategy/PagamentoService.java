package org.example.strategy;

public class PagamentoService {

    public void realizarPagamento(FormaPagamento formaPagamento, double valor){
        formaPagamento.formaPagamento(valor);
    }
}
