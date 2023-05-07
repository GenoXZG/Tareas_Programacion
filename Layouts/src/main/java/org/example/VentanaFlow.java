package org.example;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaFlow extends Frame {
    private Label etiqueta1;
    private TextField cuadro1;
    private Label etiqueta2;
    private TextField cuadro2;
    private FlowLayout layout;

    public VentanaFlow(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        FlowLayout layout =new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);
        etiqueta1 = new Label("Etiqueta 1");
        this.add(etiqueta1);
        cuadro1 = new TextField(30);
        this.add(cuadro1);
        etiqueta2 = new Label("Etiqueta 2");
        this.add(etiqueta2);
        cuadro2 = new TextField(30);
        this.add(cuadro2);

        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
    }
}
