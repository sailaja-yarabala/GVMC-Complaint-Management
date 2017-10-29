package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <title>Registration</title>\n");
      out.write("    <link REL=\"StyleSheet\" TYPE=\"text/css\" HREF=\"Register_Page.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("            <br/>\n");
      out.write("            <img src = \"images/logo.png\" alt='logo'>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <ul>\n");
      out.write("                    <li><a href=#>About Vizag</a></li>\n");
      out.write("                    <li><a href=#>Departments</a></li>\n");
      out.write("                    <li><a href=#>Activities</a></li>\n");
      out.write("                    <li><a href=#>Register</a></li>\n");
      out.write("                    <li><a href=#>Home</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <form action=\"Reg\">\n");
      out.write("            <div class=\"register_form animated fadeInUp\">\n");
      out.write("                <div class=\"box-header\">\n");
      out.write("                    <h2>Register Your Complaint</h2>\n");
      out.write("                </div>\n");
      out.write("                <table border=0 cellpadding=10 align=center>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td><input type=text name=name size=33 maxlength=30 placeholder=\"type your name\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td>Contact No.</td>\n");
      out.write("                            <td><input type=text name=number size=33 maxlength=10 placeholder=\"type your number\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td>Complaint Type</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select name=\"Problem\">\n");
      out.write("                                <option value=\"Drinage\">Drinage</option>\n");
      out.write("                                <option value=\"Water\">Water</option>\n");
      out.write("                                <option value=\"Current Poles\">Current Poles</option>\n");
      out.write("                                <option value=\"Garbage Cleaning\">Garbage Cleaning</option>\n");
      out.write("                                <option value=\"Others\">Others</option>\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td>Description</td>\n");
      out.write("                            <td><input type=text name=description size=33 maxlength=80 placeholder=\"give description of your complaint\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td>Location</td>\n");
      out.write("                            <td><input type=text name=location size=33 maxlength=80 placeholder=\"enter location\"></td>\n");
      out.write("                    </tr>                           \n");
      out.write("                    <tr>\n");
      out.write("                           <td>Upload Image</td>\n");
      out.write("                            <td><input type=file name=file value=\"file\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <button type=\"submit\">Register</button>\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
