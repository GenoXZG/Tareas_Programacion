package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa la cadena de caracteres:  "); // ABC
        String cadena = teclado.nextLine();
        System.out.println("Cadena Ingresada: " + cadena);

        char p1 = cadena.charAt(0);
        char p2 = cadena.charAt(1);
        char p3 = cadena.charAt(2);
        int decimal1 = (int) p1;
        int decimal2 = (int) p2;
        int decimal3 = (int) p3;
        System.out.println("El valor decimal del primer caracter es: " + decimal1);
        System.out.println("El valor decimal del segundo caracter es: " + decimal2);
        System.out.println("El valor decimal del tercer caracter es: " + decimal3);

        if ( decimal2 == decimal1 + 1){
            System.out.println("Estado de la secuencia = True" );
        }
        else {

            System.out.println( "Estado de la secuencia = False");
        }

    }
}