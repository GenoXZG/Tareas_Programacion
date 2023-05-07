package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaSwing extends JFrame {
    private JLabel gradosC;
    private JTextField gradosAConvertir;
    private JButton convertir;
    private JLabel gradosF;
    private FlowLayout layout;

    public VentanaSwing(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        layout = new FlowLayout();
        this.getContentPane().setLayout(layout);
        gradosC = new JLabel(" Grados centigrados a convertir: ");
        this.getContentPane().add(gradosC);
        gradosAConvertir = new JTextField(10);
        this.getContentPane().add(gradosAConvertir);
        convertir = new JButton("Convertir");
        this.getContentPane().add(convertir);
        gradosF = new JLabel("0.0 F");
        this.getContentPane().add(gradosF);
        this.convertir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double centigrados = Double.parseDouble(gradosAConvertir.getText());
                double fahrenheit = (centigrados * 9.0/5.0) + 32.0;
                gradosF.setText( fahrenheit + " F");
            }
        });
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null,"adios...");
                System.exit(0);
            }
        });



    }
}
