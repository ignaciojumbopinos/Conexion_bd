package ControladorPersona;

import Conexion.Conexion;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class personabd {

    PreparedStatement ps = null;
    Statement stm = null;
    Connection con = null;
    Conexion co = new Conexion();

    // metodo para guardar
    public boolean Registar(Persona persona) {
        
        String sql = "INSERT INTO registro (nombre, apellido, telefono, usuario,contraseña, correoelectronico) "
                + "values (?,?,?,?,?,?)";
        try {
            con = co.getConection();

            ps = con.prepareStatement(sql);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getTelefono());
            ps.setString(4, persona.getUsuario());
            ps.setString(5, persona.getContraseña());
            ps.setString(6, persona.getCorreo());
            
            ps.execute();

            return true;
        } catch (SQLException e) {
            System.out.println("Error al registar " + e.getMessage());
            return false;
        }


    }

}
