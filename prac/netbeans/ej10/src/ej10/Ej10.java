/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial.
 *
 * @author Ema Castro
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String s = "s";
        String n = "n";
        int lim = 0;
        int n1;
        int suma = 0;
        boolean salir = false;
        while (!salir) {
            do {
                System.out.println("ingrese un limite positivo");
                lim = leer.nextInt();
            } while (lim < 0);

            do {
                System.out.println("ingrese el numero");
                n1 = leer.nextInt();
                suma = suma + n1;
            } while (suma < lim);

            System.out.println("LIMITE SUPERADO. La suma de los numeros ingresados es: " + suma);

            System.out.println("desea continuar s/n");
            String op = leer.next();
            if (op.equals("s")) {
                lim = 0;
            } else if (op.equals("n")) {
                salir = true;
            }

        }
    }

}
