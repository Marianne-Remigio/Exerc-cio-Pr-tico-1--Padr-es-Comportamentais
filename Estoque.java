package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<EstoqueObserver> observer = new ArrayList<>();

    public void registreObserver(EstoqueObserver observers){
        observer.add(observers);
    }

    public void adicionarProduto(String produto){
        System.out.println("Produto: " + produto);
        notificarTodos(produto);
    }

    public void notificarTodos(String produto){
        for(EstoqueObserver observers : observer){
            observers.update(produto);
        }
    }
}
