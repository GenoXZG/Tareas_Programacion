package org.example;

import Herenciamultiple.AlumnoExtraordinario;
import Herenciamultiple.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cuadrado Cuadrado1 = new Cuadrado(5);
        Circulo circulo = new Circulo();
        circulo.setRadio(8.5);
        System.out.println(Cuadrado1.calcularArea());
        System.out.println(circulo.calcularArea());
        Persona p1 = new Persona("juan", 25);
        System.out.println("----------------------------");
        AlumnoExtraordinario ada = new AlumnoExtraordinario();
        ada.setNombre("Luis");
        ada.setDeporte("Futbol");
        ada.setArte("Pintura");
        System.out.println();
        ada.ensyar("Acuarela");
        ada.presentarObra();
        ada.entrenar();
        ada.competir("Fes Aragon");


    }




}