package org.example.Controlador;

import org.example.Modelo.Libro;
import org.example.Modelo.ModeloTablaLibro;
import org.example.Vista.VentanaLibro;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorLibro extends MouseAdapter {
    private VentanaLibro view;
    private ModeloTablaLibro modelo;

    public ControladorLibro(VentanaLibro view) {
        this.view = view;
        modelo = new ModeloTablaLibro();
        this.view.getBtnCargarTabla().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargarTabla()) {

            modelo.cargarDatos();
            this.view.getTblLibros().setModel(modelo);
            this.view.getTblLibros().updateUI();
        }
        if (e.getSource() == this.view.getBtnAgregar()){
            if (this.view.getTxtAutor().getText().equals("") || this.view.getTxtTitulo().equals("")){
              JOptionPane.showMessageDialog(view,"No puedes agregar un libro vacio", "Aviso",JOptionPane.ERROR_MESSAGE);
            }
            else {
                Libro nuevoLibro = new Libro();
                nuevoLibro.setTitulo(this.view.getTxtTitulo().getText());
                nuevoLibro.setAutor(this.view.getTxtAutor().getText());
                if (modelo.agregarLibro(nuevoLibro)){
                    JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(view,"No se pudo agregar","Aviso",JOptionPane.ERROR_MESSAGE);
                }
                modelo.cargarDatos();
                this.view.getTblLibros().setModel(modelo);
                this.view.limpiarTexto();
                this.view.getTblLibros().updateUI();
            }
            }

    }
}
