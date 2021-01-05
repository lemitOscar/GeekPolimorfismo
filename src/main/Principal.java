/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import polimorfismo.ChijaResta;
import polimorfismo.ChijaSuma;
import polimorfismo.OperacionesPadre;

/**
 *
 * @author Jesslim
 */
public class Principal {
  
    
    public static void main(String[] args) {
        OperacionesPadre kate = new ChijaSuma();
        kate.PedirDatos();
        kate.Operacion();
        kate.Mostrar();
    }
}
