/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2014-06-18 18:18:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Manager.Layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BaseLayout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fignore_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fignore_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fignore_005fnobody.release();
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../style/Layout.css\"></link>\r\n");
      out.write("<title>");
      if (_jspx_meth_tiles_005finsertAttribute_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f1(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_tiles_005finsertAttribute_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<div id=\"content-container\">\r\n");
      out.write("\t\t<div id=\"content-container2\">\r\n");
      out.write("\t\t\t<div id=\"content-container3\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_tiles_005finsertAttribute_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f0 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fignore_005fnobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_005finsertAttribute_005f0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsertAttribute_005f0.setParent(null);
    // /Manager/Layout/BaseLayout.jsp(9,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f0.setName("title");
    // /Manager/Layout/BaseLayout.jsp(9,7) name = ignore type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f0.setIgnore(true);
    int[] _jspx_push_body_count_tiles_005finsertAttribute_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_tiles_005finsertAttribute_005f0 = _jspx_th_tiles_005finsertAttribute_005f0.doStartTag();
      if (_jspx_th_tiles_005finsertAttribute_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_tiles_005finsertAttribute_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_tiles_005finsertAttribute_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_tiles_005finsertAttribute_005f0.doFinally();
      _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fignore_005fnobody.reuse(_jspx_th_tiles_005finsertAttribute_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f1 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_005finsertAttribute_005f1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsertAttribute_005f1.setParent(null);
    // /Manager/Layout/BaseLayout.jsp(12,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f1.setName("Header");
    int[] _jspx_push_body_count_tiles_005finsertAttribute_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_tiles_005finsertAttribute_005f1 = _jspx_th_tiles_005finsertAttribute_005f1.doStartTag();
      if (_jspx_th_tiles_005finsertAttribute_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_tiles_005finsertAttribute_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_tiles_005finsertAttribute_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_tiles_005finsertAttribute_005f1.doFinally();
      _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody.reuse(_jspx_th_tiles_005finsertAttribute_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f2 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_005finsertAttribute_005f2.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsertAttribute_005f2.setParent(null);
    // /Manager/Layout/BaseLayout.jsp(13,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f2.setName("Navigation");
    int[] _jspx_push_body_count_tiles_005finsertAttribute_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_tiles_005finsertAttribute_005f2 = _jspx_th_tiles_005finsertAttribute_005f2.doStartTag();
      if (_jspx_th_tiles_005finsertAttribute_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_tiles_005finsertAttribute_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_tiles_005finsertAttribute_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_tiles_005finsertAttribute_005f2.doFinally();
      _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody.reuse(_jspx_th_tiles_005finsertAttribute_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f3 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_005finsertAttribute_005f3.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsertAttribute_005f3.setParent(null);
    // /Manager/Layout/BaseLayout.jsp(17,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f3.setName("Body");
    int[] _jspx_push_body_count_tiles_005finsertAttribute_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_tiles_005finsertAttribute_005f3 = _jspx_th_tiles_005finsertAttribute_005f3.doStartTag();
      if (_jspx_th_tiles_005finsertAttribute_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_tiles_005finsertAttribute_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_tiles_005finsertAttribute_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_tiles_005finsertAttribute_005f3.doFinally();
      _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody.reuse(_jspx_th_tiles_005finsertAttribute_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f4 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_005finsertAttribute_005f4.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsertAttribute_005f4.setParent(null);
    // /Manager/Layout/BaseLayout.jsp(21,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f4.setName("Footer");
    int[] _jspx_push_body_count_tiles_005finsertAttribute_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_tiles_005finsertAttribute_005f4 = _jspx_th_tiles_005finsertAttribute_005f4.doStartTag();
      if (_jspx_th_tiles_005finsertAttribute_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_tiles_005finsertAttribute_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_tiles_005finsertAttribute_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_tiles_005finsertAttribute_005f4.doFinally();
      _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody.reuse(_jspx_th_tiles_005finsertAttribute_005f4);
    }
    return false;
  }
}
