package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

public class VentanaPaneles  extends JFrame {
    private JPanel panel1;
    private JLabel etiquetaPanel1;
    private JButton botonPanel1;
    private JPanel panel2;
    private JLabel etiquetaPanel2;
    private JPanel panel3;
    private JComboBox<String> comboBoxPanel3;
    private JPanel panel4;
    private GridLayout layout;

    public VentanaPaneles(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new GridLayout(2,2);
        this.setLayout(layout);

        // panel 1
        panel1 = new JPanel();
        panel1.setBackground(new Color(251, 103, 153 ));
        panel1.setLayout(new FlowLayout(3));
        botonPanel1 = new JButton("Presioname para actualizar el texto");
        etiquetaPanel1 = new JLabel("....");
        panel1.add(botonPanel1);
        panel1.add(etiquetaPanel1);
        botonPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiquetaPanel1.setText("Haz actualizado el texto");
            }
        });
        this.getContentPane().add(panel1,0);


        // panel 2
        String urlImagen = "https://i.ebayimg.com/images/g/kgUAAMXQNo5TXZ6X/s-l500.jpg";
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        // Cargar la img
        try {
            URL url = new URL(urlImagen);
            Image imagen = ImageIO.read(url);
            ImageIcon imageIcon = new ImageIcon(imagen);
            etiquetaPanel2 = new JLabel(imageIcon);
            panel2.add(etiquetaPanel2);
            panel2.setBackground(new Color(181, 140, 243));

        }
        catch (MalformedURLException me){

            System.out.println("El url no funciona");
        }
        catch (Exception e){
            System.out.println("Error al cargar la imagen");
        }
        this.getContentPane().add(panel2,1);




        // panel 3
        panel3 = new JPanel();
        panel3.setBackground(new Color(142, 221, 213));
        panel3.setLayout(new FlowLayout());
        String[] elementos = {"Elemento 1", "Elemento 2","Elemento 3","Elemento 4"};
        comboBoxPanel3 = new JComboBox<>(elementos);
        panel3.add(comboBoxPanel3);
        comboBoxPanel3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println( e.getSource().toString());
                System.out.println(comboBoxPanel3.getSelectedIndex());
            }
        });
        this.getContentPane().add(panel3,2);


        // panel 4
        panel4 = new JPanel();
        panel4.setBackground(new Color(207, 248, 154));
        this.getContentPane().add(panel4,3);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}
