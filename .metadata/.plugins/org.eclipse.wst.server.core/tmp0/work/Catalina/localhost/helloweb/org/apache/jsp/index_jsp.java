/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.47
 * Generated at: 2019-12-03 10:01:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/includes/navigation.jsp", Long.valueOf(1575365527244L));
    _jspx_dependants.put("/includes/footer.jsp", Long.valueOf(1574426797183L));
    _jspx_dependants.put("/includes/header.jsp", Long.valueOf(1574425065338L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String titulo = "HelloWeb | inicio";

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html> <!-- html5 -->\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>");
      out.print(titulo);
      out.write("</title>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat|Roboto&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- <base href=\"/PruebaTecnica/\"> -->\r\n");
      out.write("    <base href=\"/helloweb/\">\r\n");
      out.write("    <!-- estilos -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles.css?time=");
      out.print(System.currentTimeMillis());
      out.write("\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>");
      out.write("\r\n");
      out.write("<div class=\"parallax\">\r\n");
      out.write("\t<h1>Prueba Técnica Juan Carlos</h1>\r\n");
      out.write("\t<h2>HTML, CSS, JAVASCRIPT</h2>\r\n");
      out.write("</div>\r\n");
      out.write("<header class=\"nav-wrapper\">\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"topnav\" id=\"myTopnav\">\r\n");
      out.write("        <a href=\"index.jsp\" class=\"active\">Inicio</a>\r\n");
      out.write("        <div class=\"dropdown\">\r\n");
      out.write("            <button class=\"dropbtn\">CSS\r\n");
      out.write("                <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"dropdown-content\">\r\n");
      out.write("                <a href=\"ejemplos/css/animaciones.jsp\">Animaciones</a>\r\n");
      out.write("                <a href=\"ejemplos/css/basico.jsp\">Basico</a>\r\n");
      out.write("                <a href=\"ejemplos/css/especificidad.jsp\">Especificidad</a>\r\n");
      out.write("                <a href=\"ejemplos/css/avanzado.jsp\">Avanzado</a>\r\n");
      out.write("                <a href=\"ejemplos/css/flexbox.jsp\">flexbox</a>\r\n");
      out.write("                <a href=\"ejemplos/css/media-querys.jsp\">media querys</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"dropdown\">\r\n");
      out.write("            <button class=\"dropbtn\">HTML\r\n");
      out.write("                <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"dropdown-content\">\r\n");
      out.write("                <a href=\"ejemplos/html/box-model.jsp\">VisualizaciÃ³n</a>\r\n");
      out.write("                <a href=\"ejemplos/html/posicionamiento.jsp\">Posicionamiento</a>\r\n");
      out.write("                <a href=\"ejemplos/html/formulario.jsp\">Formularios</a>\r\n");
      out.write("                <a href=\"login.jsp\">Login</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"dropdown\">\r\n");
      out.write("            <button class=\"dropbtn\">JavaScript\r\n");
      out.write("                <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"dropdown-content\">\r\n");
      out.write("                <a href=\"ejemplos/js/game.jsp\">Arkanoid</a>\r\n");
      out.write("                <a href=\"ejemplos/js/datatable.jsp\">Datatables</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"dropdown\">\r\n");
      out.write("            <button class=\"dropbtn\">Utilidades\r\n");
      out.write("                <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"dropdown-content\">\r\n");
      out.write("                <a href=\"https://caniuse.com/\">caniuse</a>\r\n");
      out.write("                 <a href=\"conversor.jsp\">Conversor</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a href=\"javascript:void(0);\" style=\"font-size:15px;\" class=\"icon\" onclick=\"myFunction()\">&#9776;</a>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function myFunction() {\r\n");
      out.write("            var x = document.getElementById(\"myTopnav\");\r\n");
      out.write("            if (x.className === \"topnav\") {\r\n");
      out.write("                x.className += \" responsive\";\r\n");
      out.write("            } else {\r\n");
      out.write("                x.className = \"topnav\";\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("<main>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<caption>Alumnos de clase Ipartek</caption>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\">Ander(Profesor)</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Mikel</td>\r\n");
      out.write("\t\t\t<td>Joseba</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Nadie</td>\r\n");
      out.write("\t\t\t<td>Raul</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Erlantz</td>\r\n");
      out.write("\t\t\t<td>Cristian</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Ana</td>\r\n");
      out.write("\t\t\t<td>Alejandro</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Maria</td>\r\n");
      out.write("\t\t\t<td>Juan Carlos</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Kiryl</td>\r\n");
      out.write("\t\t\t<td>Iñigo</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>nadie</td>\r\n");
      out.write("\t\t\t<td>Endika</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Iker</td>\r\n");
      out.write("\t\t\t<td>Aitor</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<a target=\"_blank\" href=\"https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table\">Ejemplo\r\n");
      out.write("\t\tw3schools</a>\r\n");
      out.write("\r\n");
      out.write("\t<h3>\r\n");
      out.write("\t\tVoluntario <span id=\"nombre\"> </span>\r\n");
      out.write("\t</h3>\r\n");
      out.write("\t<button onclick=\"buscarVoluntario()\">Quien lee?</button>\r\n");
      out.write("\r\n");
      out.write("\t<i class=\"fas fa-eye fa-2x\"></i>\r\n");
      out.write("\r\n");
      out.write("\t<p>Lorem ipsum dolor sit amet consectetur adipisicing elit.\r\n");
      out.write("\t\tVoluptatibus itaque voluptatem blanditiis eum nam minus, iste omnis\r\n");
      out.write("\t\talias voluptate recusandae dolorem dolores accusamus animi doloremque\r\n");
      out.write("\t\tsapiente eius atque, quia consequatur?</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<a id=\"btnUp\" href=\"#\"><i class=\"material-icons\">\r\n");
      out.write("\t\t\tkeyboard_arrow_up </i></a>\r\n");
      out.write("\r\n");
      out.write("</main>\r\n");
      out.write("<div class=\"footer-wrapper\">\r\n");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer-left\">\r\n");
      out.write("            <h2> <strong>Ipartek &copy</strong></h2>\r\n");
      out.write("            <h2>Juan Carlos San Celedonio</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer-right\">\r\n");
      out.write("            <h2>Recursos:</h2>\r\n");
      out.write("            <a href=\"https://github.com/juancar92?tab=repositories\">\r\n");
      out.write("                <i class=\"fab fa-github fa-2x\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </footer>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- javascript -->\r\n");
      out.write("<script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}