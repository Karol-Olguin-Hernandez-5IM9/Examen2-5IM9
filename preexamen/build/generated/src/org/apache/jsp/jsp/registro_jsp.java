package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro de Usuarios</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Registro de Usuarios</h1>\n");
      out.write("        <form method=\"POST\" action='RegistroServlet'>\n");
      out.write("            <BR>\n");
      out.write("            <BR>\n");
      out.write("            <center>\n");
      out.write("                Introduzca su nombre y pulse el bot&oacute;n de enviar<BR>\n");
      out.write("                <BR>Nombre:<input type=text name=\"Nom\">\n");
      out.write("                <BR>\n");
      out.write("                <BR>A. Paterno:<input type=text name=\"AP\">\n");
      out.write("                <BR>\n");
      out.write("                <BR>A. Materno:<input type=text name=\"AM\">\n");
      out.write("                <BR>\n");
      out.write("                <BR>Usuario:<input type=text name=\"Usu\">\n");
      out.write("                <BR>\n");
      out.write("                <BR>Password: <input type=text name=\"Pas\">\n");
      out.write("                    Repita Password: <input type=text name=\"Pas1\">\n");
      out.write("                <BR>\n");
      out.write("                <BR>Telefono:<input type=number name=\"Tel\">\n");
      out.write("                <BR>\n");
      out.write("                <BR>Escuela:<input type=text name=\"Esc\">\n");
      out.write("                <BR>\n");
      out.write("                <BR>Materia Favorita:<input type=text name=\"MF\">\n");
      out.write("                <BR>\n");
      out.write("                <BR>Deporte Favorito:<input type=text name=\"DF\">\n");
      out.write("                <BR>\n");
      out.write("                <BR>Rol<input type=number name=\"Rol\">\n");
      out.write("                <BR>\n");
      out.write("                <BR><input type=submit value=\"Aceptar\">\n");
      out.write("                <input type=reset value=\"Borrar\">\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
