package org.example;

public class Main {
    public static void main(String[] args) {

    Contenedor agua = new Contenedor(5000, "Agua");
    Contenedor crema = new Contenedor(1500, "Crema");
    Contenedor cafe = new Contenedor(1000, "Cafe");
    Vasos vasospacafe = new Vasos(50, 200);
    Maquina maquina1 = new Maquina("Oster", agua, crema, cafe, vasospacafe);


        // Llamado de los diferentes metodos
        maquina1.Americano();
        System.out.println("----------------------------------------------");
        maquina1.Expreso();
        System.out.println("----------------------------------------------");
        maquina1.Capuccino();
        System.out.println("----------------------------------------------");
        // Bucle para hacer cafes hasta que se alcance el minimo para cualquier cafe
        for (int i = 0; i < 21; i++) {
            maquina1.Capuccino();
            System.out.println("-----------------------------------------");
        }
        // Metodo para saber las cantidades actuales de la cafetera
        maquina1.ComprobacionEstado();


    }



}