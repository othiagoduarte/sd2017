/*
06) Crie uma aplicação concorrente para simular um dashboard de sensores. 
Esse dashboard possui duas threads. A primeira simula a entrada de dados na rede: 
    recebe informações de qual sensor e o novo dado a partir do console (ou JOptionPane). 
A segunda atualiza o dashboard

*/
package com.othiagoduarte.sistemas_distribuidos.Threads.ex6;

public class Main {
    public static void main(String[] args){
        System.out.println("Leituras de sensores");
        DashboardThreads das = new DashboardThreads();
        das.start();
    }
}
