package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        System.out.print("Escribe tu Nombre, Profesion y Pais de origen: ");
        String entrada = datos.nextLine();
        System.out.println(" Datos:  " + entrada);
        String[] separado = entrada.trim().split(" ");
        for (int i = 0; i <= 0 ; i++) {
            System.out.println(" Nombre: " + separado[0].toUpperCase());
            System.out.println(" Profesion: " + separado[1].toUpperCase());
            System.out.println(" Pais de Origen: " + separado[2].toUpperCase());
            
        }


    }
    }
