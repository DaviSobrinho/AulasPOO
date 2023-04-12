/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ufc;

/**
 *
 * @author davi.labre
 */
public class UFC {

    public static void main(String[] args) {
        Lutador lutadores[] = new Lutador[6];
        lutadores[0] = new Lutador("Jean","França",31,1.75f,68.9f,11,2,1);
        lutadores[1] = new Lutador("João","Brasil",29,1.68f,57.8f,14,2,3);
        lutadores[2] = new Lutador("John","EUA",35,1.65f,80.9f,12,2,1);
        lutadores[3] = new Lutador("Johnny","Austrália",28,1.93f,81.6f,13,0,2);
        lutadores[4] = new Lutador("Jão","Brasil",37,1.70f,119.3f,5,4,3);
        lutadores[5] = new Lutador("Zhuan","Rússia",30,1.81f,105.7f,12,2,4);
        lutadores[0].status();
        
    }
    
}
