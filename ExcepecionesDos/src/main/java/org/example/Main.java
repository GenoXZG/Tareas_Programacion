package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LeerArchivoSinThrow lectura = new LeerArchivoSinThrow();
        lectura.leer("datos.txt");
        System.out.println("----------------- Con throw -----------------");
        LeerArchivoConThrow lectura2 = new LeerArchivoConThrow();
       try {
           lectura2.m1("datos.txt");
       }
       catch (IOException ioe ){
           System.out.println("El archivo no existe !!");
           System.out.println(ioe.getMessage());
           ioe.printStackTrace();
       }


    }
}