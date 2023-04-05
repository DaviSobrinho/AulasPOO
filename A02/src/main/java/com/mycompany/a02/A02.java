/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.a02;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author davi.labre
 */
public class A02 {

    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone();
        Smartphone smartphone2 = new Smartphone();
        Smartphone smartphone3 = new Smartphone();
        Smartphone smartphone4 = new Smartphone();
        Smartphone smartphone5 = new Smartphone();
        smartphone1.mostraDados();
        smartphone2.maisVolume(15);
        smartphone2.ligarMudo();
        smartphone2.mostraDados();
        smartphone3.ligar();
        smartphone3.mostraDados();
        smartphone4.desligarMudo();
        smartphone4.mostraDados();
        smartphone5.menosVolume(20);
        smartphone5.maisVolume(10);
        smartphone5.mostraDados();
    }
}
