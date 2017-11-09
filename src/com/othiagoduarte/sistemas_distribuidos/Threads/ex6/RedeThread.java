package com.othiagoduarte.sistemas_distribuidos.Threads.ex6;

import com.othiagoduarte.sistemas_distribuidos.projeto02.MeuThread;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RedeThread extends Thread{
    
    private ArrayList<Sensor> sensores;
    private Stack <String> leituras;

    public RedeThread() {
        this.leituras = new Stack<>();
        this.sensores = new ArrayList<>();
        this.sensores.add(new Sensor("Sensor1"));
        this.sensores.add(new Sensor("Sensor2"));
        this.sensores.add(new Sensor("Sensor3"));
        this.sensores.add(new Sensor("Sensor4"));
    }
    
    @Override
    public void run(){
        
        for (int i = 0; i < 1000; i++) {
            lerSensores();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MeuThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }
    
    public synchronized void lerSensores(){
        System.out.println("THREAD SENSORES");        
        for (Sensor sen : this.sensores) {
            leituras.add(sen.toString());
        }
    }

    public synchronized Stack<String> getLeituras() {
        return leituras;
    }   
    
}
