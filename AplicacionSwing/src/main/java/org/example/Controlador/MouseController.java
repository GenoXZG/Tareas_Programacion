package org.example.Controlador;

import org.example.Modelo.ModeloPostreTabla;
import org.example.Modelo.Postre;
import org.example.Vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseController extends MouseAdapter {

    private Ventana view;
    private ModeloPostreTabla modelo;

    public MouseController(Ventana view) {
        this.view = view;
        modelo = new ModeloPostreTabla();
        this.view.getBtnCargarTabla().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);



    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargarTabla()){

            modelo.cargarDatos();
            this.view.getTblPostres().setModel(modelo);
            this.view.getTblPostres().updateUI();

        }

        // Eventos sobre btnAgregar
        if (e.getSource() == this.view.getBtnAgregar()) {
            if (this.view.getTxtNombre().getText().equals("") || this.view.getTxtGastronomia().equals("")) {
                JOptionPane.showMessageDialog(view, "No puedes agregar un registro vacio", "Aviso", JOptionPane.ERROR_MESSAGE);
            } else {
                Postre nuevoPostre = new Postre();
                nuevoPostre.setNombre(this.view.getTxtNombre().getText());
                nuevoPostre.setGastronomia(this.view.getTxtGastronomia().getText());
                nuevoPostre.setDescripcion(this.view.getTxtDescripcion().getText());
                nuevoPostre.setCategoria(this.view.getTxtCategoria().getText());
                nuevoPostre.setUrlImage(this.view.getTxtUrlImage().getText());
                if (modelo.agregarPostre(nuevoPostre)) {
                    JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(view, "No se pudo agregar", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
                modelo.cargarDatos();
                this.view.getTblPostres().setModel(modelo);
                this.view.getTblPostres().updateUI();
                this.view.limpiarTexto();
            }
        }

        // Eventos sobre btnActualizar
        if (e.getSource() == this.view.getBtnActualizar()){

            Postre actualizacion = new Postre();
            actualizacion.setId(Integer.parseInt(this.view.getTxtidActualizar().getText()));
            actualizacion.setNombre(this.view.getTxtNombreActualizar().getText());
            actualizacion.setGastronomia(this.view.getTxtGastronomiaActualizar().getText());
            actualizacion.setDescripcion(this.view.getTxtDescripcionActualizar().getText());
            actualizacion.setCategoria(this.view.getTxtTipoActualizar().getText());
            actualizacion.setUrlImage(this.view.getTxtUrlImage().getText());
            if (modelo.actualizarRegistro(actualizacion)){
                JOptionPane.showMessageDialog(view, "El registro se actualizo correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(view, "No se pudo actualizar el registro", "Aviso", JOptionPane.ERROR_MESSAGE);
            }

            modelo.cargarDatos();
            this.view.getTblPostres().setModel(modelo);
            this.view.getTblPostres().updateUI();



        }

        //Eventos sobre btnEliminar
        if (e.getSource() == this.view.getBtnEliminar()) {

            int registroEliminado = Integer.parseInt(this.view.getTxtidEliminar().getText());
            int seleccionDelete = JOptionPane.showConfirmDialog(this.view,"Estas seguro de borrar el registro?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            System.out.println(seleccionDelete);
            if (seleccionDelete == JOptionPane.YES_NO_OPTION){
                JOptionPane.showMessageDialog(this.view,"El registro se elimino de forma exitosa","Delete",JOptionPane.INFORMATION_MESSAGE);

                modelo.eliminarRegistro(registroEliminado);
                modelo.cargarDatos();

                this.view.getTxtidEliminar().setText("0");
                this.view.getTxtNombreEliminar().setText("");
                this.view.getTxtGastronomiaEliminar().setText("");
                this.view.getTxtDescripcionEliminar().setText("");
                this.view.getTxtTipoEliminar().setText("");
                this.view.getTxtUrlImageEliminar().setText("");

                this.view.getTxtidActualizar().setText("0");
                this.view.getTxtNombreActualizar().setText("");
                this.view.getTxtGastronomiaActualizar().setText("");
                this.view.getTxtDescripcionActualizar().setText("");
                this.view.getTxtTipoActualizar().setText("");
                this.view.getTxtUrlImageActualizar().setText("");


                this.view.getTblPostres().setModel(modelo);
                this.view.getTblPostres().updateUI();
            }
            else {
                System.out.println("No se elimino el registro");
            }


        }
    }
}
