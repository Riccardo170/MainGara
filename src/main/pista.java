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
public class pista {
    Semaforo pieno;
    
    public pista(Semaforo pieno){
        this.pieno=pieno;
    }
    
    public void corri(){
        pieno.P();  // sale sul kart e entra in pista
        for(int i=0;i<15;i++){
            System.out.println("il pilota ha fatto "+i+" giri");
        }
        pieno.V();  //lascia la pista
    }
}
