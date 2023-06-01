package org.example.Modelo;

public class Postre {
    private int id;
    private String nombre;
    private String gastronomia;

    private String descripcion;

    private String categoria;

    private String urlImage;

    public Postre() {
    }

    public Postre(int id, String nombre, String gastronomia, String descripcion, String categoria, String urlImage) {
        this.id = id;
        this.nombre = nombre;
        this.gastronomia = gastronomia;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.urlImage = urlImage;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public String toString() {
        return "Postre{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", gastronomia='" + gastronomia + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", urlImage='" + urlImage + '\'' +
                '}';
    }
}
