/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorPersona;

import Modelo.Persona;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author IDEAPAD 330
 */
@WebServlet(name = "PersonaCotroller", urlPatterns = {"/PersonaCotroller"})
public class PersonaCotroller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        personabd personabd = new personabd();
        String accion;
        RequestDispatcher dispatcher = null;
        accion = request.getParameter("accion");

        if ("nuevo".equals(accion)) {
            
            dispatcher = request.getRequestDispatcher("Productos/registro.jsp");
        }
        else if("insert".equals(accion)){
            try {
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String telefono = request.getParameter("telefono");
                String usuario = request.getParameter("usuario");
                String contraseña = request.getParameter("contraseña");
                String correo = request.getParameter("correoelectronico");
                
                Persona p = new Persona(nombre, apellido, telefono, usuario, contraseña, correo);
                personabd.Registar(p);
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            }
                

            }
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
