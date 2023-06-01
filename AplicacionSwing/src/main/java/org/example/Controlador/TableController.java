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

                    //Seccion Delete
                    TableController.this.view.getTxtidEliminar().setText(TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 0).toString());
                    TableController.this.view.getTxtNombreEliminar().setText((String) TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 1));
                    TableController.this.view.getTxtGastronomiaEliminar().setText(TableController.this.view.getTblPostres().getValueAt(registroSeleccionado, 2).toString());

                    switch (registroSeleccionado){

                        case 0:
                            try {
                                String urlImagen = "https://www.steamycooker.com/wp-content/uploads/2020/08/flan-7-735x547.jpg";
                                URL url = new URL(urlImagen);
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
                            break;
                        case 1:
                            try {
                                String urlImagen = "https://www.recetasnestle.com.ec/sites/default/files/srh_recipes/7f45d6f8807ebc775928651a3398dce9.png";
                                URL url = new URL(urlImagen);
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
                            break;
                        case 2:
                            try {
                                String urlImagen = "https://cdn0.recetasgratis.net/es/posts/1/9/1/alfajores_cordobeses_76191_600.jpg";
                                URL url = new URL(urlImagen);
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
                            break;
                        case 3:
                            try {
                                String urlImagen = "https://1.bp.blogspot.com/-3WHtjJhwN4U/VHDfVm-dVgI/AAAAAAAAEBY/YBPRnr8TpCQ/w1200-h630-p-k-no-nu/daifuku_mochi2.jpg";
                                URL url = new URL(urlImagen);
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
                            break;
                        case 4:
                            try {
                                String urlImagen = "https://gopher.mx/dynamic/products-catalog/image/arroz-leche.jpg";
                                URL url = new URL(urlImagen);
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
                            break;

                        default:

                            TableController.this.view.getLblImagenPanel3().setIcon(null);



                    }

                }
            }
        });
    }
}
