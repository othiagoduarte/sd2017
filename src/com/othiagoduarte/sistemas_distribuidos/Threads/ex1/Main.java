package com.othiagoduarte.sistemas_distribuidos.Threads.ex1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        console();
    }
    
    public static void console(){
        try {
            run();
        } catch (Exception e) {
            rodarRodapeErro();
            console();
        }
    }

    public  static void run(){
        rodarCabecalho();
        new Impressor(lerInt()).rodarImpressao();
    }

    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static void rodarCabecalho(){
        System.out.println("***************************************");
        System.out.println("**     Informe um número qualquer   ***");
        System.out.println("***************************************");
    }
    public static void rodarRodapeErro(){
        System.out.println("***    Número inválido              ***");
    }
}
