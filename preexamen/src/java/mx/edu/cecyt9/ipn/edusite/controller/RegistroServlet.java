/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cecyt9.ipn.edusite.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.cecyt9.ipn.edusite.utils.Conexion;

/**
 *
 * @author eog
 */
public class RegistroServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistroServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistroServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Nom=request.getParameter("Nom");
        String Ap=request.getParameter("AP");
        String Am=request.getParameter("AM");
        String Usu=request.getParameter("Usu");
        String Pas=request.getParameter("Pas");
        String Tel=request.getParameter("Tel");
        String Esc=request.getParameter("Esc");
        String Mat=request.getParameter("MF");
        String Dep=request.getParameter("DF");
        int Rol=Integer.parseInt(request.getParameter("Rol"));
        
        
        Conexion cone= new Conexion();
        String Conf=cone.Insert(Usu, Pas, Nom,Esc, Ap, Am, Tel, Mat, Dep, Rol);
       
        
        if(Conf.equals("Usuario Dado de alta")){
            response.sendRedirect("/preexamen/index.jsp");
        }
        
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
