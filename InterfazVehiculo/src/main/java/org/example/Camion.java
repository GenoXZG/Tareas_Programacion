package org.example;

public class Camion implements Vehiculo {
    private String combustible;
    private int peso;

    public Camion() {
    }

    public Camion(String combustible, int peso) {
        this.combustible = combustible;
        this.peso = peso;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Camion{" +
                "Combustible='" + combustible + '\'' +
                ", Peso=" + peso +
                '}';
    }
    public void transportar(){
        System.out.println("El camion de " + this.combustible + " esta transportando una carga");
    }

    @Override
    public boolean encender() {
        System.out.println("El camion se esta encendiendo ...");
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("El camion ha comenzado a avanzar ...");
    }

    @Override
    public void frenar() {
        System.out.println("El camion esta frenando ...");
    }

    @Override
    public boolean apagar() {
        System.out.println("El camion se esta apagando ...");
        return true;
    }
}
