/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Utente
 */
public class Piloti extends Thread{
    Semaforo vuoto;
    Semaforo pieno;
    pista p;
    spogliatoio s;

    public Piloti(Semaforo vuoto, Semaforo pieno, pista p, spogliatoio s) {
        this.vuoto = vuoto;
        this.pieno= pieno;
        this.p = p;
        this.s = s;
    }
    public void run(){
        s.tuta();
        p.corri();
        s.spogliati();
    }
    
    
    
}
