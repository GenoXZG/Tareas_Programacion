package org.example.Modelo;

public class Postre {
    private int id;
    private String nombre;
    private String gastronomia;

    public Postre() {
    }

    public Postre(int id, String nombre, String gastronomia) {
        this.id = id;
        this.nombre = nombre;
        this.gastronomia = gastronomia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGastronomia() {
        return gastronomia;
    }

    public void setGastronomia(String gastronomia) {
        this.gastronomia = gastronomia;
    }

    @Override
    public String toString() {
        return "Postre{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", gastronomia='" + gastronomia + '\'' +
                '}';
    }
}
