/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.Scanner;

/**
 *
 * @author Jesslim
 */
public abstract class OperacionesPadre {

    protected int valor1, valor2, res;
    Scanner read = new Scanner(System.in);

    public void PedirDatos() {
        System.out.print("ingresa un numero: ");
        valor1 = read.nextInt();
        System.out.print("segundo valor: ");
        valor2 = read.nextInt();
    }

    public abstract void Operacion();
    
    public void Mostrar(){
        System.out.print("holis "+res);
    }

    

}
