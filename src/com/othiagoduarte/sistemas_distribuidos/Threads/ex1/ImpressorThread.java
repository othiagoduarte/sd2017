package com.othiagoduarte.sistemas_distribuidos.Threads.ex1;

public class ImpressorThread extends Thread {
    
    private int numero;
    private int numThread;
    private int maximo;

    public ImpressorThread(int numThread,  int numero) {
        this.numero = numero;
        this.numThread = numThread;
        this.maximo = 100;
    }
        
    @Override
    public void run() {
        contar(this.numThread, this.numero);
    }
    
    private void imprimir(int numero){
        System.out.println("Thread: " + numThread + " ["+numero+"]");
    }
    
    private void contar(int numThread, int numero){
        for (int i = numThread; i < this.maximo; i+= numero) {
            imprimir(i);
        }        
    }   
}
