package com.othiagoduarte.sistemas_distribuidos.imparpar;

public class Main {
    public static void main(String[] args) {
        MeuThread meuThreadPar = new MeuThread("PARES", true, 100);
        MeuThread meuThreadImpar = new MeuThread("IMPAR", false, 100);
        meuThreadPar.start();
        meuThreadImpar.start();
         try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                //Logger.getLogger(com.othiagoduarte.sd2017.impl.projeto01.Main.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}

