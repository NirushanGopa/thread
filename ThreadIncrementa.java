/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziotpsitthread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class ThreadIncrementa implements Runnable{
    
    Counter contatore = new Counter();

    @Override
    public void run() {
        
        for(int i = 0; i < 100; i++){
        
            contatore.decrementa();
            
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadIncrementa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
