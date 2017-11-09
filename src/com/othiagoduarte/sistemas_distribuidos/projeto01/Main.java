package com.othiagoduarte.sistemas_distribuidos.projeto01;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        new MeuThread().start();
        new Thread(new MeuRunnable()).start();
        
        for(int i=0;i<10;i++){
            System.out.println("Main: "+i);
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
