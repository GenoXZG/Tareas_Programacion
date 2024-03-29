package org.example.Persistencia;

import org.example.Modelo.Postre;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PostreDAO implements DAO{

    public static final String DB = "Postres.db";
    public static final String DBWena = "PostresB.db";
    public PostreDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        int rowCount = 0;

        String sqlInsert = "INSERT INTO PostresB (nombre , gastronomia , descripcion, categoria, imageurl) VALUES(?,?,?,?,?)";
        PreparedStatement pstm = ConexionSingleton.getInstance("PostresB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, (((Postre)obj).getNombre()));
        pstm.setString(2,((Postre)obj).getGastronomia());
        pstm.setString(3,((Postre)obj).getDescripcion());
        pstm.setString(4,((Postre)obj).getCategoria());
        pstm.setString(5,((Postre)obj).getUrlImage());
        rowCount = pstm.executeUpdate();
        System.out.println("Se insertaron " + rowCount + " registros");
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        int rowCount = 0;
        String sqlUpdate = "UPDATE PostresB SET nombre = ?, gastronomia = ?, descripcion = ?, categoria = ?, imageurl = ?  WHERE  id = ? ;";
        PreparedStatement pstm = ConexionSingleton.getInstance(DBWena).getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, (((Postre)obj).getNombre()));
        pstm.setString(2,((Postre)obj).getGastronomia());
        pstm.setString(3,((Postre)obj).getDescripcion());
        pstm.setString(4,((Postre)obj).getCategoria());
        pstm.setString(5,((Postre)obj).getUrlImage());
        pstm.setInt(6,((Postre)obj).getId());
        rowCount = pstm.executeUpdate();
        System.out.println("Se actualizaron " + rowCount + " registros");
        return rowCount > 0;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        int rowCount = 0;
        String sqlUpdate = "DELETE FROM PostresB WHERE id = ? ;";
        PreparedStatement pstm = ConexionSingleton.getInstance(DBWena).getConnection().prepareStatement(sqlUpdate);
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
        String sql = "SELECT * FROM PostresB;";
        ArrayList<Postre> resultado = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance(DBWena).getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){

            resultado.add(new Postre(rst.getInt(1), rst.getString(2), rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));

        }

        return resultado ;
    }

    @Override
    public Object buscarPorId(int id) throws SQLException {
        String sqlFindById = "SELECT * FROM Postres WHERE id = ?;";
        Postre postre = null;
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance(DB).getConnection().prepareStatement(sqlFindById);
            pstm.setInt(1, id);
            ResultSet rst = pstm.executeQuery();

            if (rst.next()){
                postre = new Postre(rst.getInt(1), rst.getString(2), rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6) );
                System.out.println("Postre encontrado: " + postre);
            }
            else{
                System.out.println("No hay ningun postre en la posicion ingresada");
            }

        }catch (SQLException sqle){
            System.out.println("Error al buscar " + sqle.getMessage());
            sqle.printStackTrace();
        }


        return postre;
    }
}
