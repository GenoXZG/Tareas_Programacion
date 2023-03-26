package org.example;

public class Contenedor {
    private int capacidad;
    private String sustancia;

    public Contenedor() {
    }

    public Contenedor(int capacidad, String sustancia) {
        if ( capacidad < 5001){
            this.capacidad = capacidad;
        }
        else{
            System.out.println("Capacidad maxima excedida");
        }
        this.sustancia = sustancia;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getSustancia() {
        return sustancia;
    }

    public void setSustancia(String sustancia) {
        this.sustancia = sustancia;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "capacidad=" + capacidad +
                ", sustancia='" + sustancia + '\'' +
                '}';
    }
}
