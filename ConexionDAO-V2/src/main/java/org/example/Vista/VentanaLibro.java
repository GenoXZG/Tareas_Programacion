package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaLibro extends JFrame {

    private JLabel lblId;
    private JLabel lblTitulo;
    private JLabel lblAutor;
    private JTextField txtId;
    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JTable tblLibros;
    private JScrollPane scrollPane;
    private JButton btnAgregar;
    private JButton btnCargarTabla;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private GridLayout layout;

    public VentanaLibro(String title) throws HeadlessException {
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
        lblTitulo = new JLabel("Titulo:");
        txtTitulo = new JTextField(15);
        lblAutor = new JLabel("Autor:");
        txtAutor = new JTextField(15);
        btnAgregar = new JButton("Agregar:");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblTitulo);
        panel1.add(txtTitulo);
        panel1.add(lblAutor);
        panel1.add(txtAutor);
        panel1.add(btnAgregar);
        panel1.updateUI();


        //Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(135, 198, 218));
        this.getContentPane().add(panel2,1);
        tblLibros = new JTable();
        scrollPane = new JScrollPane(tblLibros);
        btnCargarTabla = new JButton("Cargar");
        panel2.add(btnCargarTabla);
        panel2.add(scrollPane);
        panel2.updateUI();


        //Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(203, 156, 215));
        this.getContentPane().add(panel3,2);
        //Panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(229, 205, 154));
        this.getContentPane().add(panel4,3);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JLabel getLblAutor() {
        return lblAutor;
    }

    public void setLblAutor(JLabel lblAutor) {
        this.lblAutor = lblAutor;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(JTextField txtTitulo) {
        this.txtTitulo = txtTitulo;
    }

    public JTextField getTxtAutor() {
        return txtAutor;
    }

    public void setTxtAutor(JTextField txtAutor) {
        this.txtAutor = txtAutor;
    }

    public JTable getTblLibros() {
        return tblLibros;
    }

    public void setTblLibros(JTable tblLibros) {
        this.tblLibros = tblLibros;
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

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }
    public void limpiarTexto(){

        this.getTxtTitulo().setText("");
        this.getTxtAutor().setText("");

    }

}
