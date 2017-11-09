package com.othiagoduarte.sistemas_distribuidos.projeto01;

import java.util.logging.Level;
import java.util.logging.Logger;

class MeuRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("MeuRunnable: "+i);
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MeuRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
