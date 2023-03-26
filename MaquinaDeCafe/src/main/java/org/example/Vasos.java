package org.example;

public class Vasos {
    private int cantidad;
    private int capacidad;

    public Vasos() {
    }

    public Vasos(int cantidad, int capacidad) {
        this.cantidad = cantidad;
        this.capacidad = capacidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Vasos{" +
                "cantidad=" + cantidad +
                ", capacidad=" + capacidad +
                '}';
    }
}
