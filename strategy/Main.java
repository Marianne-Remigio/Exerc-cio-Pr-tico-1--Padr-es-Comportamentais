package org.example.strategy;

// TODO 2: Sistema de pagamento de uma loja.
//  Os métodos de pagamento estão implementados diretamente dentro da classe PagamentoService, com estruturas condicionais
//  para decidir qual tipo de pagamento será executado. Essa implementação torna o código pouco flexível, dificulta a manutenção
//  e viola os princípios SOLID.
//  Refatore o código aplicando o padrão Strategy.

public class Main {

    public static void main(String[] args) {

        PagamentoService pagamentoService = new PagamentoService();

        pagamentoService.realizarPagamento(new Credito(), 100);
        pagamentoService.realizarPagamento(new Pix(), 200);
    }
}
