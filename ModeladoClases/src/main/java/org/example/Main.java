package org.example;

import org.example.Gato;

public class Main {
    public static void main(String[] args) {

        // CLASE PERRO
        Perro Perro1 = new Perro("Rufus","Husky", "Grande", "Blanco con Negro", 3 );
        Perro Perro2 = new Perro("Simba","Maltes", "Mediano", "Negro", 6);
        System.out.println(Perro1.toString());
        System.out.println(Perro2.toString());

        System.out.println("El nombre del perro es: " + Perro1.getNombre());
        System.out.println("La raza del perro es: " + Perro1.getRaza());
        System.out.println("El tamanio del perro es: " + Perro1.getTamanio() );
        System.out.println("El pelaje del perro es: " + Perro1.getColorPelaje());
        System.out.println("La edad del perro es: " + Perro1.getEdad() + " anios");
        System.out.println("---------------------------------------------------");
        // Llamado de metodos
        Perro1.DormirPerro();
        System.out.println("----------------------------------------");
        Perro2.PasearPerro();
        System.out.println("----------------------------------------");
        Perro1.LadrarPerro();

        System.out.println("----------------------------------------");
        // CLASE GATO


        Gato Gato1 = new Gato("Hamburgueso","Sin raza","Grande", "Blanco",3);
        System.out.println(Gato1.toString());
        System.out.println("El nombre del gato es: " + Gato1.getNombre());
        System.out.println("La raza del gato es: " + Gato1.getRaza());
        System.out.println("El tamanio del gato es: " + Gato1.getTamanio() );
        System.out.println("El pelaje del gato es: " + Gato1.getColorPelaje());
        System.out.println("La edad del gato es: " + Gato1.getEdad() + " anios");

        System.out.println("----------------------------------------------");
        Gato1.JugarPelota();
        System.out.println("-----------------------------------------------");
        Gato1.setNombre("Orion");
        Gato1.DormirGato();
        System.out.println("----------------------------------------------");
        Gato1.DarComida();



    }

}