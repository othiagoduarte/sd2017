package com.othiagoduarte.sistemas_distribuidos.imparpar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MeuThread extends Thread{
    private String nome;
    private int maximo;
    private Boolean isPar;
    
    public MeuThread(String nome, Boolean isPar, int maximo) {
        this.nome = nome;
        this.isPar = isPar;
        this.maximo = maximo;
    }    
    @Override
    public void run(){
        for(int i=0 ; i<=maximo; i++){
            if(isPar){
                if(i % 2  == 0){
                    System.out.println(nome+": "+i);
                }
            }else{
                if(i % 2  == 1){
                    System.out.println(nome+": "+i);
                }
            }
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MeuThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
