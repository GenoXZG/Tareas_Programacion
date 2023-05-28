package org.example.Persistencia;

import org.example.Interfaz.DAO;
import org.example.Modelo.Libro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class libroDAO implements DAO {
    public  static final String DB = "LibrosDAO.db";
    public libroDAO() {
    }


    @Override
    public boolean insertar(Object obj) throws SQLException {
        int rowCount = 0;

        String sqlInsert = "INSERT INTO LibrosDAO (titulo,autor) VALUES(?,?)";
            PreparedStatement pstm = ConexionSingleton.getInstance(DB).getConnection().prepareStatement(sqlInsert);
            pstm.setString(1, (((Libro)obj).getTitulo()));
            pstm.setString(2,((Libro)obj).getAutor());
            rowCount = pstm.executeUpdate();
            System.out.println("Se insertaron " + rowCount + " registros");
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {

        int rowCount = 0;
        String sqlUpdate = "UPDATE LibrosDAO SET titulo = ?, autor = ? WHERE  id = ? ;";
        PreparedStatement pstm = ConexionSingleton.getInstance(DB).getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, (((Libro)obj).getTitulo()));
        pstm.setString(2,((Libro)obj).getAutor());
        pstm.setInt(3,((Libro)obj).getId());
        rowCount = pstm.executeUpdate();
        System.out.println("Se actualizaron " + rowCount + " registros");
        return rowCount > 0;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        int rowCount = 0;
        String sqlUpdate = "DELETE FROM LibrosDAO WHERE id = ? ;";
        PreparedStatement pstm = ConexionSingleton.getInstance(DB).getConnection().prepareStatement(sqlUpdate);
        pstm.setInt(1, id);
        rowCount = pstm.executeUpdate();
        System.out.println("Se eliminaron " + rowCount + " registros");
        if (rowCount == 0){
            System.out.println("No hay ningun registro en la base de datos que coincida con el id ingresada");
        }
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {

        String sql = "SELECT * FROM LibrosDAO;";
        ArrayList<Libro> resultado = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance(DB).getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){

            resultado.add(new Libro(rst.getInt(1), rst.getString(2), rst.getString(3) ));

        }

        return resultado ;
    }

    @Override
    public Object buscarPorId(int id) throws SQLException {

        String sqlFindById = "SELECT * FROM librosDAO WHERE id = ?;";
        Libro libro = null;
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance(DB).getConnection().prepareStatement(sqlFindById);
            pstm.setInt(1, id);
            ResultSet rst = pstm.executeQuery();

            if (rst.next()){
                libro = new Libro(rst.getInt(1), rst.getString(2),rst.getString(3) );
                System.out.println("Libro encontrado: " + libro);
            }
            else{
                System.out.println("No hay ningun libro en la posicion ingresada");
            }

        }catch (SQLException sqle){
            System.out.println("Error al buscarr " + sqle.getMessage());
            sqle.printStackTrace();
        }


        return libro;

    }
}
