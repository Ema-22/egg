/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import java.util.Scanner;

/**
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 *
 * @author Ema Castro
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
        
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORECTO");
        }
    }
    
}
