/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.3.22.v20171030
 * Generated at: 2018-01-05 11:16:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pag;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usercenter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<body data-type=\"index\" class=\"theme-white\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"am-g tpl-g\">\r\n");
      out.write("    \t  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/head.jsp", out, false);
      out.write("\r\n");
      out.write("    \t  \r\n");
      out.write("    \t    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/left.jsp", out, false);
      out.write("\r\n");
      out.write("    \t    \r\n");
      out.write("    \t      <div class=\"tpl-content-wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row-content am-cf\">\r\n");
      out.write("                <div class=\"row  am-cf\" id=\"cardData\">\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("               \r\n");
      out.write("\r\n");
      out.write(" <div class=\"am-u-sm-12 am-u-md-12 am-u-lg-6\">\r\n");
      out.write("                        <div class=\"widget am-cf\">\r\n");
      out.write("                            <div class=\"widget-head am-cf\">\r\n");
      out.write("                                <div class=\"widget-title am-fl\">最近十笔流水</div>\r\n");
      out.write("                                <div class=\"widget-function am-fr\">\r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"widget-body  widget-body-lg am-fr\">\r\n");
      out.write("\r\n");
      out.write("                                <table width=\"100%\" class=\"am-table am-table-compact am-table-bordered am-table-radius am-table-striped tpl-table-black \" id=\"example-r\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>卡号</th>\r\n");
      out.write("                                            <th>时间</th>\r\n");
      out.write("                                            <th>金额</th>\r\n");
      out.write("                                            \r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody id=\"flow\">\r\n");
      out.write("                                        \r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/foot.jsp", out, false);
      out.write("\r\n");
      out.write("   \r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("      \r\n");
      out.write("      $(document).ready(function() {\r\n");
      out.write("    \t  flow();\r\n");
      out.write("    \t  ten();\r\n");
      out.write("  \t});\r\n");
      out.write("      \r\n");
      out.write("      function upload() {\r\n");
      out.write("  \t\t$('#avatarForm').submit();\r\n");
      out.write("  \t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction flow(){\r\n");
      out.write("\t\t\t$.post('/user/Flow.do',{},back);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction back(data,status){\r\n");
      out.write("\t\t\talert(\"点击\");\r\n");
      out.write("\t\t\t/* var ajaxDAO=JSON.parse(data); */\r\n");
      out.write("\t\t\tvar ajax=data;\r\n");
      out.write("\t\t\tvar card=\"\";\r\n");
      out.write("\t\t\tvar result=ajax.data;\r\n");
      out.write("\t\t\t\tfor (var i=0; i<result.length;i++) {\r\n");
      out.write("\t\t\t\t\tcard += '<div class=\"am-u-sm-12 am-u-md-6 am-u-lg-4\">';\r\n");
      out.write("\t\t\t\t\tcard += '<div class=\"widget widget-primary am-cf\">';\r\n");
      out.write("\t\t\t\t\tcard += '<div class=\"widget-statistic-header\">';\r\n");
      out.write("\t\t\t\t\tcard += result[i].number;\r\n");
      out.write("\t\t\t\t\tcard += '</div>';\r\n");
      out.write("\t\t\t\t\tcard += '<div class=\"widget-statistic-body\">';\r\n");
      out.write("\t\t\t\t\tcard += '<div class=\"widget-statistic-value\">';\r\n");
      out.write("\t\t\t\t\tcard += '￥' + result[i].money;\r\n");
      out.write("\t\t\t\t\tcard += '</div>';\r\n");
      out.write("\t\t\t\t\tcard += '<div class=\"widget-statistic-description\">';\r\n");
      out.write("\t\t\t\t\tcard += '</div>';\r\n");
      out.write("\t\t\t\t\tcard += '<span class=\"widget-statistic-icon am-icon-credit-card-alt\"></span>';\r\n");
      out.write("\t\t\t\t\tcard += '</div>';\r\n");
      out.write("\t\t\t\t\tcard += '</div>';\r\n");
      out.write("\t\t\t\t\tcard+= '</div>';\r\n");
      out.write("\t        }\r\n");
      out.write("\t    \t$('#cardData').html(card); \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction ten(){\r\n");
      out.write("\t\t\tvar param={\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\t$.post('/user/ten.do',param,call);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction call(data,status){\r\n");
      out.write("\t\t\talert(\"点击\");\r\n");
      out.write("\t\t\t/* var ajaxDAO=JSON.parse(data); */\r\n");
      out.write("\t\t\tvar ajaxDAO=data;\r\n");
      out.write("\t\t\talert(ajaxDAO);\r\n");
      out.write("\t\t\tvar result=ajaxDAO.data;\r\n");
      out.write("\t\t\tvar msg=\"<thead><tr> <th>卡号</th> <th>时间</th> <th>金额</th> <th>备注</th></tr>  </thead>\";\r\n");
      out.write("\t\t\tfor (var i=0; i<result.length; i++) {\r\n");
      out.write("                 msg+='<tr class=\"gradeX\">';\r\n");
      out.write("\t\t\t\tmsg+=' <td>'+result[i].number+'</td>';\r\n");
      out.write("\t\t\t\tmsg+='<td>'+ result[i].createtime+'</td>';\r\n");
      out.write("\t\t\t\tmsg+='<td>'+result[i].money+'</td>';\r\n");
      out.write("\t\t\t\tmsg+='<td>'+result[i].description+'</td>';\r\n");
      out.write("\t\t\t\tmsg+='</tr>';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$('#example-r').html(msg);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction loadAvatar() {\r\n");
      out.write("\t\t\t$('#picture').attr('src','/user/showPicture.do?'+new Date().getTime());\t\r\n");
      out.write("    \t}/*  页面中的页面 */\r\n");
      out.write("    \t\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<iframe name=\"avatarFrame\" style=\"display: none;\">\r\n");
      out.write("</iframe>\r\n");
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
