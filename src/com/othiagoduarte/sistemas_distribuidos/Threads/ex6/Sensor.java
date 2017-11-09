package com.othiagoduarte.sistemas_distribuidos.Threads.ex6;

public class Sensor {
    
    private String nome;

    public Sensor(String nome) {
        this.nome = nome;
    }
      
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return getNome() + " : ";
    } 
    
    public String getDados(){
        return "0002020200222002";
    }
    
}
