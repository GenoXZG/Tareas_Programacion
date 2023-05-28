package org.example.Vista;

import org.example.Controlador.ControladorLibro;
import org.example.Modelo.Libro;
import org.example.Persistencia.libroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        VentanaLibro view = new VentanaLibro("MVC con Database");
        ControladorLibro controller = new ControladorLibro(view);


    }
}