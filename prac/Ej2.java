/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.Scanner;

/**
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 *
 * @author Ema Castro
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese su nombre");
        String nom = leer.nextLine();
        
        System.out.println("ingrese su edad");
        int edad = leer.nextInt();
        
        System.out.println("ingrese su nacionalidad");
        String naci = leer.nextLine();
        
        System.out.println("ingrese la provincia");
        String pro = leer.nextLine();
        
        System.out.println("ingrese un numero de telefono");
        int tel = leer.nextInt();
        
        System.out.println("su nombre es: "+nom);
        System.out.println("edad: "+edad);
        System.out.println("nacionalidad: "+naci);
        System.out.println("provincia: "+pro);
        System.out.println("telefono: "+tel);
        
    }
    
}
