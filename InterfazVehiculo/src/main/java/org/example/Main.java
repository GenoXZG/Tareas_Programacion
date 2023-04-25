package org.example;

public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion("Diesel", 30);
        System.out.println(camion);
        camion.encender();
        camion.avanzar();
        camion.transportar();
        camion.frenar();
        camion.apagar();
        System.out.println("--------------------------------");
        Motocicleta moto = new Motocicleta(300, "Suzuki");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        moto.apagar();
    }
}