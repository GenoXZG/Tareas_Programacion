package org.example;

public class matriz {

    private int filas;
    private int columnas;

    public matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    @Override
    public String toString() {
        return "matriz{" +
                "filas=" + filas +
                ", columnas=" + columnas +
                '}';
    }
}
