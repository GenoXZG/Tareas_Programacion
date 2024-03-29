package org.example.Persistencia;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DAO {
    public abstract boolean insertar (Object obj ) throws SQLException;
    public abstract boolean update (Object obj ) throws SQLException;
    public abstract boolean delete (int id ) throws SQLException;
    public abstract ArrayList obtenerTodo ( ) throws SQLException;
    public abstract Object buscarPorId (int id ) throws SQLException;
}
