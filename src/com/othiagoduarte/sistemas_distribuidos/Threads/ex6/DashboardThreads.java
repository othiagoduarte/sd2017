package com.othiagoduarte.sistemas_distribuidos.Threads.ex6;

import com.othiagoduarte.sistemas_distribuidos.projeto02.MeuThread;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DashboardThreads extends Thread{
    private RedeThread rede;

    public DashboardThreads() {
        rede = new RedeThread();
    }
       
    @Override
    public void run(){
        rede.start();
        while (true) {            
            esperar(2);
            imprimir(); 
        }
    }
    
    public void esperar(int segundos){
        try {
            Thread.sleep(1000 * segundos);
        } catch (InterruptedException ex) {
            Logger.getLogger(MeuThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized void imprimir(){
        System.out.println("THREAD DASH");        
        while(rede.getLeituras().size() > 0){
            System.out.println(rede.getLeituras().pop());
        }
    }
        
}
