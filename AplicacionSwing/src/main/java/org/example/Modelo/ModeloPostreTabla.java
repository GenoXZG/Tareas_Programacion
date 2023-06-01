package org.example.Modelo;

import org.example.Persistencia.PostreDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloPostreTabla implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<Postre> datos;
    private PostreDAO pdao;

    public ModeloPostreTabla() {
        pdao = new PostreDAO();
        datos = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Gastronomia";
            case 3:
                return "Descripcion";
            case 4:
                return "Categoria";
            case 5:
                return "Url Image";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Postre tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getGastronomia();
            case 3:
                return tmp.getDescripcion();
            case 4:
                return tmp.getCategoria();
            case 5:
                return tmp.getUrlImage();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).setId(0);
                break;
            case 1:
                datos.get(rowIndex).setNombre( (String) aValue );
                break;
            case 2:
                datos.get(rowIndex).setGastronomia( (String) aValue );
                break;
            case 3:
                datos.get(rowIndex).setDescripcion((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setCategoria((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setUrlImage((String) aValue);
                break;
            default:
                System.out.println("No se modifico nada");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try {
            datos = pdao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println("Error al cargar: " + sqle.getMessage());
            sqle.printStackTrace();
        }
    }
    public boolean agregarPostre(Postre postre){
        boolean resultado = false;
        try {
            if (pdao.insertar(postre)){
                datos.add(postre);
                resultado = true;
            }
            else {
                resultado = false;
                System.out.println("No se pudo");
            }
        }catch (SQLException sqle){
            System.out.println("Error al insertar" + sqle.getMessage()) ;
            sqle.printStackTrace();
        }


        return resultado;
    }

    public boolean actualizarRegistro(Postre postre){
        try{
            if (pdao.update(postre)){

                return true;
            }



        }catch (SQLException sqle){

            System.out.println("Error al actualizar: " + sqle.getMessage());
            sqle.printStackTrace();
        }
        return false;
    }
    public void eliminarRegistro(int id){
        try{

            pdao.delete(id);


        }catch (SQLException sqle){

            System.out.println("Error al eliminar: " + sqle.getMessage());
            sqle.printStackTrace();
        }

    }
}
