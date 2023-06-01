package org.example;

import org.example.Controlador.MouseController;
import org.example.Controlador.TableController;
import org.example.Modelo.Postre;
import org.example.Persistencia.PostreDAO;
import org.example.Vista.Ventana;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ventana view = new Ventana("Postres");
        MouseController mouseController = new MouseController(view);
        TableController tableController = new TableController(view);



        /*
        PostreDAO prueba = new PostreDAO();
       try {
            System.out.println(prueba.obtenerTodo());
        }
        catch (SQLException q){
            q.getMessage();
        }*/

    }
}