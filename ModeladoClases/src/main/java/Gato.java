package org.example;

public class Gato {
    private String nombre;
    private String raza;
    private String tamanio;
    private String colorPelaje;
    private int edad;

    public Gato(String nombre, String raza, String tamanio, String colorPelaje, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
        this.colorPelaje = colorPelaje;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", colorPelaje='" + colorPelaje + '\'' +
                ", edad=" + edad +
                '}';
    }


    // Metodos de la clase

    public void JugarPelota(){
        System.out.println( nombre + " tiene la pelota en sus patas ");
        System.out.println(nombre + " te acaba de lanzar la pelota");
        if (Math.random() > .5){
            System.out.println("Le has regresado la pelota");

        }
        else {
            System.out.println( nombre + "  te ha quitado la pelota");
        }

    }

    public void DormirGato(){
        System.out.println(nombre + " esta sobre su cama");
        if(Math.random()>.5){
            System.out.println( nombre + " se durmio");
        }else{
            System.out.println(nombre + " decidio no dormir");
        }
    }

    public void DarComida(){
        System.out.println(nombre + " te quiere decir algo");
        System.out.println(nombre + " quiere que lo sigas");
        System.out.println(nombre + " te esta pidiendo comida");
        System.out.println("Alimentaste a: " + nombre);
    }
}
