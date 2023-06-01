package org.example.Controlador;

import org.example.Vista.Ventana;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class TableController {

    private Ventana view;

    public TableController(Ventana view) {
        this.view = view;
        this.view.getTblPostres().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int registroSeleccionado = TableController.this.view.getTblPostres().getSelectedRow();
                    // Seccion Actualizar

                    TableController.this.view.getTxtidActualizar().setText(TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 0).toString());
                    TableController.this.view.getTxtNombreActualizar().setText((String) TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 1));
                    TableController.this.view.getTxtGastronomiaActualizar().setText(TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 2).toString());
                    TableController.this.view.getTxtDescripcionActualizar().setText(TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 3).toString());
                    TableController.this.view.getTxtTipoActualizar().setText(TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 4).toString());
                    TableController.this.view.getTxtUrlImageActualizar().setText(TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 5).toString());

                    //Seccion Delete
                    TableController.this.view.getTxtidEliminar().setText(TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 0).toString());
                    TableController.this.view.getTxtNombreEliminar().setText((String) TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 1));
                    TableController.this.view.getTxtGastronomiaEliminar().setText(TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 2).toString());

                    TableController.this.view.getTxtDescripcionEliminar().setText(TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 3).toString());
                    TableController.this.view.getTxtTipoEliminar().setText(TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 4).toString());
                    TableController.this.view.getTxtUrlImageEliminar().setText(TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 5).toString());

                    String URL = TableController.this.view.getTxtUrlImageActualizar().getText();

                    try {
                        URL url = new URL(URL);
                        Image image = ImageIO.read(url);
                        ImageIcon imageIcon = new ImageIcon(image);
                        TableController.this.view.getLblImagenPanel3().setIcon(imageIcon);

                    }
                    catch (MalformedURLException mue){
                        mue.getMessage();
                    }
                    catch (IOException ioe){
                        ioe.getMessage();
                    }

                }
            }
        });
    }
}
