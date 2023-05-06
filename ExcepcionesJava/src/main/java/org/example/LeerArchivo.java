package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {

        try {
            String ruta = "datos.txt";
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
        }
        catch (FileNotFoundException fnfe){
            System.out.println("El archivo que intentas leer no existe !!");
            System.out.println(fnfe.getMessage());
        }
        finally {
            System.out.println("Me ejecuto siempre...");
        }
    }
}
