package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Manzana", false ));
        System.out.println(cajaComida);
        System.out.println(cajaComida.get(0));

        System.out.println("-------- ArrayList -------");

        ArrayList<Comida> comida2 = new ArrayList<>();
        /*
        comida2.add(0, new Comida("Torta", false));
        comida2.add(1, new Comida("Leche", false));
        comida2.add(2, new Comida("Huevo", false));
        comida2.add(3, new Comida("Jumex", true));
        comida2.add(4, new Comida("Tamal", false));
        comida2.add(5, new Comida("Atole", false));
        comida2.add(6, new Comida("Zanahoria", false));
        */
        comida2.add( new Comida("Torta", false));
        comida2.add( new Comida("Leche", false));
        comida2.add( new Comida("Huevo", false));
        comida2.add( new Comida("Jumex", true));
        comida2.add( new Comida("Tamal", false));
        comida2.add( new Comida("Atole", false));
        comida2.add( new Comida("Zanahoria", false));

        System.out.println(comida2.get(3));
        comida2.add(6,new Comida("Sandia",false));
        comida2.set(0, new Comida("Cereal", true));
        System.out.println(comida2.get(6));

        System.out.println("---------------- For e ------------------");
        int size = comida2.size();
        for (Comida comidas:comida2) {
            System.out.println(comidas);
        }
        System.out.println("Largo del arreglo: " + size);

    }
}