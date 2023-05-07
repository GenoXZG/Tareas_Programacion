package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaGrid extends Frame {
    private Label etiqueta1;
    private TextField cuadro1;
    private Label etiqueta2;
    private TextField cuadro2;
    private Button boton1;
    private GridLayout layout;

    public VentanaGrid(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new GridLayout(3,2);
        this.setLayout(layout);
        etiqueta1 = new Label("Etiqueta 1");
        this.add(etiqueta1, 0);
        cuadro1 = new TextField(30);
        this.add(cuadro1, 1);
        etiqueta2 = new Label("Etiqueta 2");
        this.add(etiqueta2, 2);
        cuadro2 = new TextField(30);
        this.add(cuadro2, 3);
        boton1 = new Button("Enviar");
        this.add(boton1, 4);
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String saludo;
                saludo = cuadro1.getText() + " " + cuadro2.getText();
                JOptionPane.showMessageDialog(null,saludo);
            }
        });
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
