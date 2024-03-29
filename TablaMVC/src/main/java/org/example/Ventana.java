package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPeso;
    private JLabel lblPlataforma;
    private JLabel lblDesarrollador;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPeso;
    private JTextField txtPlataforma;
    private JTextField txtDesarrolador;
    private JButton btnAgregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTablaMVC modelo;
    private ArrayList<Videojuego> videojuegos;
    private JScrollPane scroll;
    private JTable tblTabla;

    public Ventana(String title) throws HeadlessException {
        super(title);

        this.setSize(700, 1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        layout = new GridLayout(2, 1);
        this.getContentPane().setLayout(layout);

        //Panel 1
        //Configuracion del panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(111, 191, 191, 255));
        this.getContentPane().add(panel1, 0);
        //Contenido del panel 1

        lblId = new JLabel("Id: ");
        txtId = new JTextField(4);
        panel1.add(lblId);
        panel1.add(txtId);

        lblNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField(30);
        panel1.add(lblNombre);
        panel1.add(txtNombre);

        lblGenero = new JLabel("Genero: ");
        txtGenero = new JTextField(20);
        panel1.add(lblGenero);
        panel1.add(txtGenero);

        lblPeso = new JLabel("Peso en GB: ");
        txtPeso = new JTextField(5);
        panel1.add(lblPeso);
        panel1.add(txtPeso);

        lblPlataforma = new JLabel("Plataforma: ");
        txtPlataforma = new JTextField(20);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);

        lblDesarrollador = new JLabel("Desarrollador: ");
        txtDesarrolador = new JTextField(20);
        panel1.add(lblDesarrollador);
        panel1.add(txtDesarrolador);

        btnAgregar = new JButton("Agregar");
        panel1.add(btnAgregar);


        //Panel 2
        //Configuracion del panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(164, 129, 229, 255));
        this.getContentPane().add(panel2, 1);
        //Contenido del panel 2
        videojuegos = new ArrayList<>();
        Videojuego videojuego1 = new Videojuego(1,"Valorant","Fps", 15.0 ,"PC","Riot Games");
        videojuegos.add(videojuego1);
        modelo = new ModeloTablaMVC(videojuegos);
        tblTabla = new JTable(modelo);
        scroll = new JScrollPane(tblTabla);
        panel2.add(scroll);

        btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              Videojuego nuevo = new Videojuego();
              nuevo.setId(Integer.parseInt(txtId.getText()));
              nuevo.setNombre(txtNombre.getText());
              nuevo.setGenero(txtGenero.getText());
              nuevo.setPesoGB(Double.parseDouble(txtPeso.getText()));
              nuevo.setPlataforma(txtPlataforma.getText());
              nuevo.setDesarrollador(txtDesarrolador.getText());
              modelo.agregarJuego(nuevo);
              tblTabla.updateUI();

            }
        });





    }
}
