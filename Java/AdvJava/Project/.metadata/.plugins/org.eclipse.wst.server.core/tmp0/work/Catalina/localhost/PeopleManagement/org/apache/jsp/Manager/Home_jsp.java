/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2014-05-31 13:38:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("\t<h2>Page heading</h2>\r\n");
      out.write("\t<p>Lorem ipsum dolor sit amet consect etuer adipi scing elit sed\r\n");
      out.write("\t\tdiam nonummy nibh euismod tinunt ut laoreet dolore magna aliquam erat\r\n");
      out.write("\t\tvolut. Ut wisi enim ad minim veniam, quis nostrud exerci tation\r\n");
      out.write("\t\tullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.\r\n");
      out.write("\t\tDuis autem vel eum iriure dolor in hendrerit in vulputate velit esse\r\n");
      out.write("\t\tmolestie consequat, vel illum dolore eu feugiat nulla facilisis at\r\n");
      out.write("\t\tvero eros et accumsan et iusto odio dignissim qui blandit praesent\r\n");
      out.write("\t\tluptatum zzril delenit augue duis dolore te feugait nulla facilisi.</p>\r\n");
      out.write("\t<p>Ut wisi enim ad minim veniam, quis nostrud exerci tation\r\n");
      out.write("\t\tullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.\r\n");
      out.write("\t\tDuis autem vel eum iriure dolor in hendrerit in vulputate velit esse\r\n");
      out.write("\t\tmolestie consequat, vel illum dolore eu feugiat nulla facilisis at\r\n");
      out.write("\t\tvero eros et accumsan et iusto odio dignissim qui blandit praesent\r\n");
      out.write("\t\tluptatum zzril delenit augue duis dolore te feugait nulla facilisi.\r\n");
      out.write("\t\tLorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam\r\n");
      out.write("\t\tnonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat\r\n");
      out.write("\t\tvolutpat.</p>\r\n");
      out.write("\t<p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit\r\n");
      out.write("\t\tesse molestie consequat, vel illum dolore eu feugiat nulla facilisis\r\n");
      out.write("\t\tat vero eros et accumsan et iusto odio dignissim qui blandit praesent\r\n");
      out.write("\t\tluptatum zzril delenit augue duis dolore te feugait nulla facilisi.\r\n");
      out.write("\t\tLorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam\r\n");
      out.write("\t\tnonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat\r\n");
      out.write("\t\tvolutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation\r\n");
      out.write("\t\tullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"aside\">\r\n");
      out.write("\t<h3>Aside heading</h3>\r\n");
      out.write("\t<p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit\r\n");
      out.write("\t\tesse molestie consequat, vel illum dolore eu feugiat nulla facilisis\r\n");
      out.write("\t\tat vero eros et accumsan.</p>\r\n");
      out.write("</div>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}