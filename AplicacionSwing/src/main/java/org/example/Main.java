package org.example;

import org.example.Controlador.MouseController;
import org.example.Controlador.TableController;
import org.example.Vista.Ventana;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ventana view = new Ventana("Postres");
        MouseController mouseController = new MouseController(view);
        TableController tableController = new TableController(view);
    }
}