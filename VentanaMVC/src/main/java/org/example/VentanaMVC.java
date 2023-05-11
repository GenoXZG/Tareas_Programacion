package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaMVC extends JFrame {
       private JLabel lblnombre;
       private JTextField txtnombre;
       private JButton btnnombre;
       private FlowLayout layout;
       private JComboBox comboBox;
       private NombreMVC modelo;

    public VentanaMVC(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        layout = new FlowLayout();
        this.setLayout(layout);
        lblnombre = new JLabel("Ingresa un Nombre: ");
        this.getContentPane().add(lblnombre);
        txtnombre = new JTextField(10);
        this.getContentPane().add(txtnombre);
        btnnombre = new JButton("agregar");
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nuevo = txtnombre.getText();
                modelo.agregarNombre(nuevo);
                txtnombre.setText("");
            }
        });
        this.getContentPane().add(btnnombre);
        modelo = new NombreMVC();
        modelo.agregarNombre("Luis");
        modelo.agregarNombre("David");
        modelo.agregarNombre("Juan");
        comboBox = new JComboBox(modelo);
        this.getContentPane().add(comboBox);
        comboBox.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(comboBox.getSelectedIndex());
                System.out.println(comboBox.getSelectedItem());
                JOptionPane.showMessageDialog(null, "Hola " + comboBox.getSelectedItem());
            }
        });
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
