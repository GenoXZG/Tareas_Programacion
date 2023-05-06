package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner entrada = new Scanner(System.in);
            int a = 10;
            System.out.print("Ingresa el numero por el cual vas a dividir al 10: ");
            int b = Integer.parseInt(entrada.nextLine());
            System.out.println("La division es: " + (a/b));
        }
        catch (ArithmeticException e){
            System.out.println("La division entre cero no es posible !!");
        }
        catch (NumberFormatException nfe){
            System.out.println("El numero debe ser ingresado en forma de numero");
        }
        finally {
            System.out.println("Me ejecuto siempre...");
        }

        System.out.println("El programa ha finalizado");

    }
}