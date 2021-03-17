/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziotpsitthread;

/**
 *
 * @author informatica
 */
public class Counter {
    
    private static int count = 0;

    public void incrementa() {
        count++;
    }

    public void decrementa() {
        count--;
    }

    void stampaValoreFinale() {
        System.out.println("Il contatore è: " + count);
    }
}
