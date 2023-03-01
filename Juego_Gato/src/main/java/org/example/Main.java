package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa una cadena de X, O o _ para el juego de gato (Maximo 9 caracteres): ");
        String cadena = teclado.nextLine();
        System.out.println("Cadena ingresada: " + cadena.trim());
        // _XXOXOXX_

        //String[] separado = cadena.trim().split("");

        System.out.println("-----");
        System.out.println("|" + cadena.trim().substring(0,3) + "|" );
        System.out.println("|" + cadena.trim().substring(3,6) + "|" );
        System.out.println("|" + cadena.trim().substring(6,9) + "|" );
        System.out.println("-----");


    }
    }
