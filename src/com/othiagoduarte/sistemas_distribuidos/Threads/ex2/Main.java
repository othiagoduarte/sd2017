package com.othiagoduarte.sistemas_distribuidos.Threads.ex2;

import java.util.Random;


public class Main {
     public static void main(String[] args) {
        int alvo = new Random().nextInt(199);
        System.out.println("ALVO -> " + alvo);
        new Buscador(5,1,alvo).start();
        new Buscador(5,2,alvo).start();
        new Buscador(5,3,alvo).start();
        new Buscador(5,4,alvo).start();
        new Buscador(5,5,alvo).start();
    }
}
