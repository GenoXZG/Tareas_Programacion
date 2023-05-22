package org.example;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModeloTablaMatriz implements TableModel {
    matriz datos;

    public ModeloTablaMatriz(matriz datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.getFilas();
    }

    @Override
    public int getColumnCount() {
        return datos.getColumnas();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Integer.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
