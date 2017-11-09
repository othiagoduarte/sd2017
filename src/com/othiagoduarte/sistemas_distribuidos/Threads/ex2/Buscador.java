package com.othiagoduarte.sistemas_distribuidos.Threads.ex2;

import java.util.ArrayList;

public class Buscador extends Thread{
    
    private String resultado;
    private ArrayList<Integer>  lista;
    private Integer alvo; 
    private Integer numLista;
    private Integer totalLista;

    public Buscador(int totalLista, int numLista, int alvo) {
        this.lista = lista;
        this.alvo = alvo;
        this.lista = gerarLista();
        this.totalLista = totalLista;
        this.numLista = numLista;
    }
    
    public void buscar(){
        int valorInicial = (lista.size() / totalLista * numLista) - lista.size() / totalLista;
        int valorFinal = (lista.size() / totalLista * numLista) ;
        for (int i = valorInicial; i < valorFinal; i++) {
            if(lista.get(i) == this.alvo){
               System.out.println(new String("LISTA:" + numLista + " ITEM:"+ this.alvo + " POSIÇÃO: " + i));
            }
        }        
    }
    
    @Override
    public void run() {
        buscar();
    }
    
    public static ArrayList<Integer> gerarLista(){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 1; i <= 200; i++) {
            lista.add(i);
        }
        return lista;
    }
}