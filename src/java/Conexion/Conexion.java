
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
     private final String base = "paginaweb";
    private final String user = "root";
    private final String password = "101219931";
    private final String url = "jdbc:mysql://Localhost:3306/" + base;
    
    
    //metodo para generar la conexion
    public Connection getConection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base");
        }
        return  con;
    }
    
}
