/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.3.22.v20171030
 * Generated at: 2018-01-05 11:17:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pag;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class OpenAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<body data-type=\"index\" class=\"theme-white\">\r\n");
      out.write("\t\r\n");
      out.write("    <div class=\"am-g tpl-g\">\r\n");
      out.write("        <!-- 头部 -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/head.jsp", out, false);
      out.write("\r\n");
      out.write("        <!-- 风格切换 -->\r\n");
      out.write("        \r\n");
      out.write("        <!-- 侧边导航栏 -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/left.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- 内容区域 -->\r\n");
      out.write("        <div class=\"tpl-content-wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row-content am-cf\">\r\n");
      out.write("                <div class=\"row  am-cf\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"am-u-sm-12 am-u-md-12 am-u-lg-12\">\r\n");
      out.write("                        <div class=\"widget am-cf\">\r\n");
      out.write("                            <div class=\"widget-head am-cf\">\r\n");
      out.write("                                <div class=\"widget-title am-fl\">银行卡开户</div>\r\n");
      out.write("                                <div class=\"widget-function am-fr\">\r\n");
      out.write("                                    <a href=\"javascript:;\" class=\"am-icon-cog\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"widget-body am-fr\">\r\n");
      out.write("\r\n");
      out.write("                                <form class=\"am-form tpl-form-line-form\">\r\n");
      out.write("                                    <div class=\"am-form-group\">\r\n");
      out.write("                                        <label for=\"user-name\" class=\"am-u-sm-3 am-form-label\">密码 <span class=\"tpl-form-line-small-title\"></span></label>\r\n");
      out.write("                                        <div class=\"am-u-sm-9\">\r\n");
      out.write("                                            <input type=\"password\" class=\"tpl-form-input\" id=\"password\" placeholder=\"请输入6位银行卡密码\">\r\n");
      out.write("                                            <small></small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"am-form-group\">\r\n");
      out.write("                                        <label for=\"user-name\" class=\"am-u-sm-3 am-form-label\">确认密码 <span class=\"tpl-form-line-small-title\"></span></label>\r\n");
      out.write("                                        <div class=\"am-u-sm-9\">\r\n");
      out.write("                                            <input type=\"password\" class=\"tpl-form-input\" id=\"confirmPwd\" placeholder=\"请输入6位银行卡密码\">\r\n");
      out.write("                                            <small></small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    \r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"am-form-group\">\r\n");
      out.write("                                        <div class=\"am-u-sm-9 am-u-sm-push-3\">\r\n");
      out.write("                                            <button type=\"button\" class=\"am-btn am-btn-primary tpl-btn-bg-color-success \" onclick=\"openaccount();\">开户</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write(" \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("         <div class=\"am-modal am-modal-alert\" tabindex=\"-1\" id=\"my-alert\">\r\n");
      out.write("\t\t  <div class=\"am-modal-dialog\">\r\n");
      out.write("\t\t    <div class=\"am-modal-hd\">开户</div>\r\n");
      out.write("\t\t    <div class=\"am-modal-bd\" id=\"successAlet\">\r\n");
      out.write("\t\t      \t卡号\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <div class=\"am-modal-footer\">\r\n");
      out.write("\t\t      <span class=\"am-modal-btn\">确定</span>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"am-modal am-modal-no-btn\" tabindex=\"-1\" id=\"your-modal\">\r\n");
      out.write("\t\t  <div class=\"am-modal-dialog\">\r\n");
      out.write("\t\t    <div class=\"am-modal-hd\">\r\n");
      out.write("\t\t      <a href=\"javascript: void(0)\" class=\"am-close am-close-spin\" data-am-modal-close>&times;</a>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <div class=\"am-modal-bd\" id=\"errorAlert\">\r\n");
      out.write("\t\t      \t操作成功\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/foot.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    \t$(document).ready(function() {\r\n");
      out.write("    \t\t$('ul li a').removeClass('active');\r\n");
      out.write("    \t\t$('#openaccountHref').addClass(\"active\");\r\n");
      out.write("    \t\t$('#my-alert').on('close.modal.amui', function() {\r\n");
      out.write("    \t\t\twindow.location.href=\"/card/toUsercenter.do\";\r\n");
      out.write("    \t\t});\r\n");
      out.write("    \t});\r\n");
      out.write("    \t\r\n");
      out.write("    \tfunction upload() {\r\n");
      out.write("    \t\t$('#avatarForm').submit();\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
      out.write("    \tfunction openaccount() {\r\n");
      out.write("    \t\talert(\"开始\");\r\n");
      out.write("    \t\tvar param={\r\n");
      out.write("        \t\t\tpassword:$('#password').val(),\r\n");
      out.write("    \t\t\t\tconfirmPwd:$('#confirmPwd').val()\r\n");
      out.write("\t\t\t};\r\n");
      out.write("    \t\t$.post('/card/openAccount.do',param,callback);\r\n");
      out.write("    \t}\r\n");
      out.write("    \tfunction callback(data,status){\r\n");
      out.write("\t\t\talert(\"点击\");\r\n");
      out.write("\t\t\tvar ajaxDAO=data;\r\n");
      out.write("\t\t\tif(ajaxDAO.success){\r\n");
      out.write("\t\t\t\t$('#successAlet').html(ajaxDAO.data.number);\r\n");
      out.write("\t\t\t\t$('#my-alert').modal('toggle');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\t$('#errorAlert').html(data.message);\r\n");
      out.write("        \t\t$('#your-modal').modal('toggle');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("    \t\r\n");
      out.write("    \tfunction loadAvatar() {\r\n");
      out.write("\t\t\t$('#picture').attr('src',\"/resources/show/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("?\"+new Date().getTime());\t\r\n");
      out.write("    \t}\r\n");
      out.write("    \t</script>\r\n");
      out.write("\r\n");
      out.write("    \t</body>\r\n");
      out.write("\t<iframe name=\"avatarFrame\" style=\"display: none;\">\r\n");
      out.write("\t</iframe>\r\n");
      out.write("    \t</html>\r\n");
      out.write("    \t");
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
