package org.example.Controlador;

import org.example.Modelo.ModeloTablaLibro;
import org.example.Vista.VentanaLibro;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorLibro extends MouseAdapter {
    private VentanaLibro view;
    private ModeloTablaLibro modelo;

    public ControladorLibro(VentanaLibro view) {
        this.view = view;
        this.view.getBtnCargarTabla().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargarTabla()) {
            modelo = new ModeloTablaLibro();
            modelo.cargarDatos();
            this.view.getTblLibros().setModel(modelo);
            this.view.getTblLibros().updateUI();
        }

    }
}
