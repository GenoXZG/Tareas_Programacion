package org.example;

public class Perro {
    private String nombre;
    private String raza;
    private String tamanio;
    private String colorPelaje;
    private int edad;

    public Perro(String nombre, String raza, String tamanio, String colorPelaje, int edad) {
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
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", colorPelaje='" + colorPelaje + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
    // Metodos de la clase


    public void DormirPerro(){
        System.out.println(nombre + " esta sobre su cama");
        if(Math.random()>.5){
            System.out.println( nombre + " se durmio");
        }else{
            System.out.println(nombre + " decidio no dormir");
        }
    }



     public void PasearPerro(){

         System.out.println( nombre + " trajo su correa");
         if (Math.random() > 0.51){
             System.out.println("Pasea con " + nombre);
         }
         else {
             System.out.println(nombre + " no queria pasear");
         }

     }

     public void LadrarPerro(){

         System.out.println(nombre + " vio a alguien en la ventana");
         if (Math.random() > .51){
             System.out.println("Es alguien conocido, " + nombre + " no ladro");

         }
         else {
             System.out.println(nombre + " no reconce a la persona, " + nombre + " le ladro");
         }


     }



}
