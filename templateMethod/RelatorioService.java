package org.example.templateMethod;

public abstract class RelatorioService {

    public void abrirConexao(){
        System.out.println("Abrindo conexão com banco...");
    }

    public void buscandoDados(){
        System.out.println("Buscando dados...");
    }

    public abstract void gerandoLayout();

    public void fechandoConexao(){
        System.out.println("Fechando conexão...");
    }

    public final void gerarRelatorio() {
        abrirConexao();
        buscandoDados();
        gerandoLayout();
        fechandoConexao();
    }

}
