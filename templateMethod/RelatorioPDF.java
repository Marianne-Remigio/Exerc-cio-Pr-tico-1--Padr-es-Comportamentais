package org.example.templateMethod;

public class RelatorioPDF extends RelatorioService{
    @Override
    public void gerandoLayout() {
        System.out.println("Gerando layout em PDF...");
    }
}
