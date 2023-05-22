package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class vista extends JFrame {

    private JLabel lblvariables;
    private JTextField txtvariables;
    private JPanel panel1;
    private JPanel panel2;
    private JTable tablaMatriz;

    private matriz matrizej;

    private ModeloTablaMatriz modelo;
    private GridLayout layout;
    private JButton insertar;

    public vista(String title) throws HeadlessException {
        super(title);

        this.setSize(500,1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        layout = new GridLayout(2,1);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        this.getContentPane().add(panel1,0);
        panel1.setBackground(new Color(150, 216, 219));
        lblvariables = new JLabel("Ingresa el numero de variables");
        txtvariables = new JTextField(10);
        insertar = new JButton("Generar");
        panel1.add(lblvariables);
        panel1.add(txtvariables);
        panel1.add(insertar);
        insertar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int n = Integer.parseInt(txtvariables.getText());
                System.out.println(n);
                matriz tmp = new matriz(n,n+1);
                System.out.println(tmp);
                modelo = new ModeloTablaMatriz(tmp);
                tablaMatriz = new JTable(modelo);
                panel2.add(tablaMatriz);
            }
        });

        //panel2
        panel2 = new JPanel(new FlowLayout());
        this.getContentPane().add(panel2,1);
        panel2.setBackground(new Color(179, 241, 158));





    }
}
