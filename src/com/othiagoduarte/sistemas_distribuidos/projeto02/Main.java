package com.othiagoduarte.sistemas_distribuidos.projeto02;

public class Main {
    public static void main(String[] args) {
        for(int i=1; i<11;i++)
            new MeuThread("Multiplos de "+i,i,i*10).start();               
    }
}
