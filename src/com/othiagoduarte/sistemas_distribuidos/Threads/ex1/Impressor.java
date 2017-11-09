package com.othiagoduarte.sistemas_distribuidos.Threads.ex1;

import java.util.ArrayList;

public class Impressor {
    
    ArrayList<ImpressorThread> impressores = null;
    
    public Impressor(int numero) {
        this.impressores = new ArrayList<ImpressorThread>();
        for (int i = 0; i < numero; i++) {
            this.impressores.add( new ImpressorThread(i + 1, numero));
        }
    }
    
    public void rodarImpressao(){
        for (ImpressorThread impressor : this.impressores) {
            impressor.start();
        }
    }
}
