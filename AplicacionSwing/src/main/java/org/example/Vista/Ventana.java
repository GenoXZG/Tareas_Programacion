package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblGastronomia;

    private JLabel lblDescripcion;
    private JLabel lblCategoria;
    private JLabel lblUrlImage;
    private JLabel lblImagenPanel3;

    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtGastronomia;
    private JTextField txtDescripcion;
    private JTextField txtCategoria;
    private JTextField txtUrlImage;

    private JTable tblPostres;
    private JScrollPane scrollPane;
    private JButton btnAgregar;
    private JButton btnCargarTabla;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel3Delete;
    private JPanel panel3Update;

    //Seccion Update panel 4

    private JLabel lblidActualizar;
    private JTextField txtidActualizar;
    private JLabel lblNombreActualiar;
    private JTextField txtNombreActualizar;
    private JLabel lblGastronomiaActualizar;
    private JTextField txtGastronomiaActualizar;
    private JLabel lblDescripcionActualizar;
    private JTextField txtDescripcionActualizar;
    private JLabel lblTipoActualizar;
    private JTextField txtTipoActualizar;
    private JLabel lblUrlImageActualizar;
    private JTextField txtUrlImageActualizar;
    private JButton btnActualizar;

    //Seccion Delete panel 4
    private JLabel lblidEliminar;
    private JTextField txtidEliminar;
    private JLabel lblNombreEliminar;
    private JTextField txtNombreEliminar;
    private JLabel lblGastronomiaEliminar;
    private JTextField txtGastronomiaEliminar;
    private JLabel LblDescripcionEliminar;
    private JTextField txtDescripcionEliminar;
    private JLabel lblTipoEliminar;
    private JTextField txtTipoEliminar;
    private JLabel lblUrlImageEliminar;
    private JTextField txtUrlImageEliminar;
    private JButton btnEliminar;
    private GridLayout layout;

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblGastronomia() {
        return lblGastronomia;
    }

    public void setLblGastronomia(JLabel lblGastronomia) {
        this.lblGastronomia = lblGastronomia;
    }

    public JLabel getLblDescripcion() {
        return lblDescripcion;
    }

    public void setLblDescripcion(JLabel lblDescripcion) {
        this.lblDescripcion = lblDescripcion;
    }

    public JLabel getLblCategoria() {
        return lblCategoria;
    }

    public void setLblCategoria(JLabel lblCategoria) {
        this.lblCategoria = lblCategoria;
    }

    public JLabel getLblUrlImage() {
        return lblUrlImage;
    }

    public void setLblUrlImage(JLabel lblUrlImage) {
        this.lblUrlImage = lblUrlImage;
    }

    public JLabel getLblImagenPanel3() {
        return lblImagenPanel3;
    }

    public void setLblImagenPanel3(JLabel lblImagenPanel3) {
        this.lblImagenPanel3 = lblImagenPanel3;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtGastronomia() {
        return txtGastronomia;
    }

    public void setTxtGastronomia(JTextField txtGastronomia) {
        this.txtGastronomia = txtGastronomia;
    }

    public JTextField getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(JTextField txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    public JTextField getTxtCategoria() {
        return txtCategoria;
    }

    public void setTxtCategoria(JTextField txtCategoria) {
        this.txtCategoria = txtCategoria;
    }

    public JTextField getTxtUrlImage() {
        return txtUrlImage;
    }

    public void setTxtUrlImage(JTextField txtUrlImage) {
        this.txtUrlImage = txtUrlImage;
    }

    public JTable getTblPostres() {
        return tblPostres;
    }

    public void setTblPostres(JTable tblPostres) {
        this.tblPostres = tblPostres;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargarTabla() {
        return btnCargarTabla;
    }

    public void setBtnCargarTabla(JButton btnCargarTabla) {
        this.btnCargarTabla = btnCargarTabla;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JPanel getPanel3Delete() {
        return panel3Delete;
    }

    public void setPanel3Delete(JPanel panel3Delete) {
        this.panel3Delete = panel3Delete;
    }

    public JPanel getPanel3Update() {
        return panel3Update;
    }

    public void setPanel3Update(JPanel panel3Update) {
        this.panel3Update = panel3Update;
    }

    public JLabel getLblidActualizar() {
        return lblidActualizar;
    }

    public void setLblidActualizar(JLabel lblidActualizar) {
        this.lblidActualizar = lblidActualizar;
    }

    public JTextField getTxtidActualizar() {
        return txtidActualizar;
    }

    public void setTxtidActualizar(JTextField txtidActualizar) {
        this.txtidActualizar = txtidActualizar;
    }

    public JLabel getLblNombreActualiar() {
        return lblNombreActualiar;
    }

    public void setLblNombreActualiar(JLabel lblNombreActualiar) {
        this.lblNombreActualiar = lblNombreActualiar;
    }

    public JTextField getTxtNombreActualizar() {
        return txtNombreActualizar;
    }

    public void setTxtNombreActualizar(JTextField txtNombreActualizar) {
        this.txtNombreActualizar = txtNombreActualizar;
    }

    public JLabel getLblGastronomiaActualizar() {
        return lblGastronomiaActualizar;
    }

    public void setLblGastronomiaActualizar(JLabel lblGastronomiaActualizar) {
        this.lblGastronomiaActualizar = lblGastronomiaActualizar;
    }

    public JTextField getTxtGastronomiaActualizar() {
        return txtGastronomiaActualizar;
    }

    public void setTxtGastronomiaActualizar(JTextField txtGastronomiaActualizar) {
        this.txtGastronomiaActualizar = txtGastronomiaActualizar;
    }

    public JLabel getLblDescripcionActualizar() {
        return lblDescripcionActualizar;
    }

    public void setLblDescripcionActualizar(JLabel lblDescripcionActualizar) {
        this.lblDescripcionActualizar = lblDescripcionActualizar;
    }

    public JTextField getTxtDescripcionActualizar() {
        return txtDescripcionActualizar;
    }

    public void setTxtDescripcionActualizar(JTextField txtDescripcionActualizar) {
        this.txtDescripcionActualizar = txtDescripcionActualizar;
    }

    public JLabel getLblTipoActualizar() {
        return lblTipoActualizar;
    }

    public void setLblTipoActualizar(JLabel lblTipoActualizar) {
        this.lblTipoActualizar = lblTipoActualizar;
    }

    public JTextField getTxtTipoActualizar() {
        return txtTipoActualizar;
    }

    public void setTxtTipoActualizar(JTextField txtTipoActualizar) {
        this.txtTipoActualizar = txtTipoActualizar;
    }

    public JLabel getLblUrlImageActualizar() {
        return lblUrlImageActualizar;
    }

    public void setLblUrlImageActualizar(JLabel lblUrlImageActualizar) {
        this.lblUrlImageActualizar = lblUrlImageActualizar;
    }

    public JTextField getTxtUrlImageActualizar() {
        return txtUrlImageActualizar;
    }

    public void setTxtUrlImageActualizar(JTextField txtUrlImageActualizar) {
        this.txtUrlImageActualizar = txtUrlImageActualizar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JLabel getLblidEliminar() {
        return lblidEliminar;
    }

    public void setLblidEliminar(JLabel lblidEliminar) {
        this.lblidEliminar = lblidEliminar;
    }

    public JTextField getTxtidEliminar() {
        return txtidEliminar;
    }

    public void setTxtidEliminar(JTextField txtidEliminar) {
        this.txtidEliminar = txtidEliminar;
    }

    public JLabel getLblNombreEliminar() {
        return lblNombreEliminar;
    }

    public void setLblNombreEliminar(JLabel lblNombreEliminar) {
        this.lblNombreEliminar = lblNombreEliminar;
    }

    public JTextField getTxtNombreEliminar() {
        return txtNombreEliminar;
    }

    public void setTxtNombreEliminar(JTextField txtNombreEliminar) {
        this.txtNombreEliminar = txtNombreEliminar;
    }

    public JLabel getLblGastronomiaEliminar() {
        return lblGastronomiaEliminar;
    }

    public void setLblGastronomiaEliminar(JLabel lblGastronomiaEliminar) {
        this.lblGastronomiaEliminar = lblGastronomiaEliminar;
    }

    public JTextField getTxtGastronomiaEliminar() {
        return txtGastronomiaEliminar;
    }

    public void setTxtGastronomiaEliminar(JTextField txtGastronomiaEliminar) {
        this.txtGastronomiaEliminar = txtGastronomiaEliminar;
    }

    public JLabel getLblDescripcionEliminar() {
        return LblDescripcionEliminar;
    }

    public void setLblDescripcionEliminar(JLabel lblDescripcionEliminar) {
        LblDescripcionEliminar = lblDescripcionEliminar;
    }

    public JTextField getTxtDescripcionEliminar() {
        return txtDescripcionEliminar;
    }

    public void setTxtDescripcionEliminar(JTextField txtDescripcionEliminar) {
        this.txtDescripcionEliminar = txtDescripcionEliminar;
    }

    public JLabel getLblTipoEliminar() {
        return lblTipoEliminar;
    }

    public void setLblTipoEliminar(JLabel lblTipoEliminar) {
        this.lblTipoEliminar = lblTipoEliminar;
    }

    public JTextField getTxtTipoEliminar() {
        return txtTipoEliminar;
    }

    public void setTxtTipoEliminar(JTextField txtTipoEliminar) {
        this.txtTipoEliminar = txtTipoEliminar;
    }

    public JLabel getLblUrlImageEliminar() {
        return lblUrlImageEliminar;
    }

    public void setLblUrlImageEliminar(JLabel lblUrlImageEliminar) {
        this.lblUrlImageEliminar = lblUrlImageEliminar;
    }

    public JTextField getTxtUrlImageEliminar() {
        return txtUrlImageEliminar;
    }

    public void setTxtUrlImageEliminar(JTextField txtUrlImageEliminar) {
        this.txtUrlImageEliminar = txtUrlImageEliminar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public Ventana(String title) throws HeadlessException {
        super(title);

        layout = new GridLayout(2,2);

        this.setSize(1000,1000);
        this.setVisible(true);
        this.getContentPane().setLayout(layout);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(171, 252, 181));
        this.getContentPane().add(panel1,0);

        lblId = new JLabel("Id:");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(15);
        lblGastronomia = new JLabel("Gastronomia:");
        txtGastronomia = new JTextField(15);
        lblDescripcion = new JLabel("Descripcion:");
        txtDescripcion = new JTextField(15);
        lblCategoria = new JLabel("Categoria:");
        txtCategoria = new JTextField(15);
        lblUrlImage = new JLabel("URL:");
        txtUrlImage = new JTextField(15);

        btnAgregar = new JButton("Agregar:");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblGastronomia);
        panel1.add(txtGastronomia);
        panel1.add(lblDescripcion);
        panel1.add(txtDescripcion);
        panel1.add(lblCategoria);
        panel1.add(txtCategoria);
        panel1.add(lblUrlImage);
        panel1.add(txtUrlImage);
        panel1.add(btnAgregar);
        panel1.updateUI();


        //Panel 2

        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(135, 198, 218));
        this.getContentPane().add(panel2,1);
        tblPostres = new JTable();
        scrollPane = new JScrollPane(tblPostres);
        btnCargarTabla = new JButton("Cargar");
        panel2.add(btnCargarTabla);
        panel2.add(scrollPane);
        panel2.updateUI();

        //Panel 3

        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(203, 156, 215));
        this.getContentPane().add(panel3,2);
        lblImagenPanel3 = new JLabel();
        panel3.add(lblImagenPanel3);

        //Panel 4

        panel4 = new JPanel(new GridLayout(2,1));
        panel4.setBackground(new Color(229, 205, 154));
        //Seccion Update
        panel3Update = new JPanel(new FlowLayout());
        panel3Update.setBackground(new Color(122, 220, 190));
        lblidActualizar = new JLabel("Id:");
        txtidActualizar = new JTextField(3);
        txtidActualizar.setEnabled(false);
        lblNombreActualiar = new JLabel("Nombre: ");
        txtNombreActualizar = new JTextField(15);
        lblGastronomiaActualizar = new JLabel("Gastronomia: ");
        txtGastronomiaActualizar = new JTextField(15);
        lblDescripcionActualizar = new JLabel("Descripcion: ");
        txtDescripcionActualizar = new JTextField(15);
        lblTipoActualizar = new JLabel("Categoria: ");
        txtTipoActualizar = new JTextField(15);
        lblUrlImageActualizar = new JLabel("URL: ");
        txtUrlImageActualizar = new JTextField(15);
        btnActualizar = new JButton("Actualizar registro");
        panel3Update.add(lblidActualizar);
        panel3Update.add(txtidActualizar);
        panel3Update.add(lblNombreActualiar);
        panel3Update.add(txtNombreActualizar);
        panel3Update.add(lblGastronomiaActualizar);
        panel3Update.add(txtGastronomiaActualizar);
        panel3Update.add(lblDescripcionActualizar);
        panel3Update.add(txtDescripcionActualizar);
        panel3Update.add(lblTipoActualizar);
        panel3Update.add(txtTipoActualizar);
        panel3Update.add(lblUrlImageActualizar);
        panel3Update.add(txtUrlImageActualizar);
        panel3Update.add(btnActualizar);
        //Seccion Delete
        panel3Delete = new JPanel(new FlowLayout());
        panel3Delete.setBackground(new Color(231, 117, 117));
        lblidEliminar = new JLabel("Id");
        txtidEliminar = new JTextField(3);
        txtidEliminar.setEnabled(false);
        lblNombreEliminar = new JLabel("Nombre: ");
        txtNombreEliminar = new JTextField(14);
        lblGastronomiaEliminar = new JLabel("Gastronomia: ");
        txtGastronomiaEliminar = new JTextField(15);
        LblDescripcionEliminar = new JLabel("Descripcion: ");
        txtDescripcionEliminar = new JTextField(15);
        lblTipoEliminar = new JLabel("Categoria: ");
        txtTipoEliminar = new JTextField(15);
        lblUrlImageEliminar = new JLabel("URL: ");
        txtUrlImageEliminar = new JTextField(15);

        btnEliminar = new JButton("Eliminar registro");
        panel3Delete.add(lblidEliminar);
        panel3Delete.add(txtidEliminar);
        panel3Delete.add(lblNombreEliminar);
        panel3Delete.add(txtNombreEliminar);
        panel3Delete.add(lblGastronomiaEliminar);
        panel3Delete.add(txtGastronomiaEliminar);
        panel3Delete.add(LblDescripcionEliminar);
        panel3Delete.add(txtDescripcionEliminar);
        panel3Delete.add(lblTipoEliminar);
        panel3Delete.add(txtTipoEliminar);
        panel3Delete.add(lblUrlImageEliminar);
        panel3Delete.add(txtUrlImageEliminar);
        panel3Delete.add(btnEliminar);


        panel4.add(panel3Update,0);
        panel4.add(panel3Delete,1);
        this.getContentPane().add(panel4,3);
        panel4.updateUI();







    }

    public void limpiarTexto(){

        this.getTxtNombre().setText("");
        this.getTxtGastronomia().setText("");
        this.getTxtDescripcion().setText("");
        this.getTxtCategoria().setText("");
        this.getTxtUrlImage().setText("");

    }
}
