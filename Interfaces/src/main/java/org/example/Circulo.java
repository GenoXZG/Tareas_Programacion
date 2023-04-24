package org.example;

public class Circulo implements Figura {
    private double Pi = 3.1416;
    private double radio;

    public Circulo() {
    }

    public Circulo(double pi, double radio) {
        this.Pi = pi;
        this.radio = radio;
    }

    public double getPi() {
        return Pi;
    }

    public void setPi(double pi) {
        Pi = pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "Pi=" + Pi +
                ", radio=" + radio +
                '}';
    }

    @Override
    public double calcularArea() {
        return Pi * this.radio * this.radio;
    }
}
