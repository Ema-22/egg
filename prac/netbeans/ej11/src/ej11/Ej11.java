/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:
 *
 * MENU 1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Salir Elija opción:
 *
 * @author Ema Castro
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String op;
        int n1;
        int n2;
        int opcion;
        boolean salir = false;

        while (!salir) {

            System.out.println("MENU ");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            System.out.println("ingrese una opcion");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("SUMA");
                    System.out.println("ingrese un numero");
                    n1 = leer.nextInt();
                    System.out.println("ingrese el segundo numero");
                    n2 = leer.nextInt();
                    System.out.println("el resultado es: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("RESTA");
                    System.out.println("ingrese un numero");
                    n1 = leer.nextInt();
                    System.out.println("ingrese el segundo numero");
                    n2 = leer.nextInt();
                    System.out.println("el resultado es: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("MULTIPLICACION");
                    System.out.println("ingrese un numero");
                    n1 = leer.nextInt();
                    System.out.println("ingrese el segundo numero");
                    n2 = leer.nextInt();
                    System.out.println("el resultado es: " + (n1 * n2));
                    break;
                case 4:
                    String opinion;
                    System.out.println("DIVISION");
                    System.out.println("ingrese un numero");
                    n1 = leer.nextInt();
                    System.out.println("ingrese el segundo numero");
                    n2 = leer.nextInt();
                    System.out.println("el resultado es: " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    op = leer.next();
                    if (op.equals("s")) {
                        salir = true;
                    } else if (op.equals("n")) {
                        opcion = 0;
                    }
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
            }
        }

    }

}
