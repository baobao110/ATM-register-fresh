/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.3.22.v20171030
 * Generated at: 2018-01-05 11:16:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pag.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class foot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"/js/jquery.js\"></script>\r\n");
      out.write("<script src=\"/js/theme.js\"></script>\r\n");
      out.write("<script src=\"/js/amazeui.min.js\"></script>\r\n");
      out.write("<script src=\"/js/amazeui.datatables.min.js\"></script>\r\n");
      out.write("<script src=\"/js/dataTables.responsive.min.js\"></script>\r\n");
      out.write("<script src=\"/js/app.js\"></script>\r\n");
      out.write("<script src=\"/js/vue.js\"></script>\r\n");
      out.write("<div class=\"am-modal am-modal-alert\" tabindex=\"-1\" id=\"my-alert\">\r\n");
      out.write("\t<div class=\"am-modal-dialog\">\r\n");
      out.write("\t\t<div class=\"am-modal-hd\"></div>\r\n");
      out.write("\t\t<div class=\"am-modal-bd\" id=\"successAlet\"></div>\r\n");
      out.write("\t\t<div class=\"am-modal-footer\">\r\n");
      out.write("\t\t\t<span class=\"am-modal-btn\">确定</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"am-modal am-modal-no-btn\" tabindex=\"-1\" id=\"your-modal\">\r\n");
      out.write("\t<div class=\"am-modal-dialog\">\r\n");
      out.write("\t\t<div class=\"am-modal-hd\">\r\n");
      out.write("\t\t\t<a href=\"javascript: void(0)\" class=\"am-close am-close-spin\"\r\n");
      out.write("\t\t\t\tdata-am-modal-close>&times;</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"am-modal-bd\" id=\"errorAlert\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("   <script>\r\n");
      out.write("\r\n");
      out.write("\tvar host=window.location.host;\r\n");
      out.write("\tvar url=\"ws://\"+host+\"/Information\";\r\n");
      out.write("\tvar ws = new WebSocket(url);/* 这里注意url地址127和localhost是完全不同的   */\r\n");
      out.write("\t\r\n");
      out.write("\tws.onopen = function(){\r\n");
      out.write("\t\tconsole.log(\"websocket已连接\");\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tws.onmessage = function(evt) {\r\n");
      out.write("\t\tconsole.log('服务器端发送的消息：' + evt.data);\r\n");
      out.write("\t\tloadMessage();\r\n");
      out.write("\t};\r\n");
      out.write("\t//特别注意这里如何实现消息的实时刷新就是通过这里的onmessage方法,当有消息发送过来时就会调用loadMessage();\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\tloadMessage();\r\n");
      out.write("\t\t$('#Notice').click(flush);//注意这里的选择器的使用 ,这个方法就是每当点击 id为Notice的元素自动调用 相应的方法 ,这里用于时间实时刷新 \r\n");
      out.write("\t});\r\n");
      out.write("\t//这里就是之前没有 想到加载时需要刷新消息 \r\n");
      out.write("\tws.onclose   = function(evt)  {  console.log(\"close\"); };\r\n");
      out.write("\tws.onerror   = function(evt)  {  console.log(\"error\"); };\r\n");
      out.write("\t\r\n");
      out.write("\tvar Message =new Vue({\r\n");
      out.write("\t\tel : '#MessageFlow',\r\n");
      out.write("\t\tdata : {\r\n");
      out.write("\t\t\tMessageList : []/*vue的使用数据以数组的形式保存  ,注意这里的appFlow 对应 head中的 id  flowList 同样对应 head中的 ，所以这里不是 随意定义 ,同时这里还需要注意的是 include的jsp 是分开编译 然后 拼接在一起的 ,所以要注意不同jsp的方法最好不同  */\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\tfunction loadMessage() {\r\n");
      out.write("\t\t$.post(\"/message/Information.do\",{},Messageback);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction Messageback(messageDTO,status){/* 这里可以知道ajax的形式可以不一样  */\r\n");
      out.write("\t\tvar unReadNumber=messageDTO.unReadNumber;\r\n");
      out.write("\t\t/* var results=messageDTO.obj;\r\n");
      out.write("\t\tvar startTime = new Date().getTime();\r\n");
      out.write("\t\tfor (var i=0;i<results.length; i++) {\r\n");
      out.write("\t\t\tvar result = results[i];\r\n");
      out.write("\t\t\tresult.createtime = parseInt((startTime-result.createtime)/1000/60);\r\n");
      out.write("\t\t\tresult.filed = '分钟之前';\r\n");
      out.write("\t\t\tif (result.createtime >= 60) {\r\n");
      out.write("\t\t\t\tresult.createtime= parseInt(result.createtime/60);\r\n");
      out.write("\t\t\t\tresult.filed = '小时之前';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tMessage.MessageList=results; */\r\n");
      out.write("\t\tMessage.MessageList=messageDTO.obj;\r\n");
      out.write("\t\t$(\"#unReadNumber\").html(unReadNumber);\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction flush(){\r\n");
      out.write("\t\tvar results=Message.MessageList;\r\n");
      out.write("\t\tvar startTime = new Date().getTime();\r\n");
      out.write("\t\tfor (var i=0;i<results.length; i++) {\r\n");
      out.write("\t\t\tvar result = results[i];\r\n");
      out.write("\t\t\tresult.time = parseInt((startTime-result.createtime)/1000);\r\n");
      out.write("\t\t\tresult.filed = '秒之前 ';\r\n");
      out.write("\t\t\tif (result.time>= 60) {\r\n");
      out.write("\t\t\t\tresult.time = parseInt((startTime-result.createtime)/1000/60);\r\n");
      out.write("\t\t\t\tresult.filed = '分钟之前';\r\n");
      out.write("\t\t\t\tif(result.time >= 60){\r\n");
      out.write("\t\t\t\t\tresult.time = parseInt((startTime-result.createtime)/1000/60/60);\r\n");
      out.write("\t\t\t\t\tresult.filed = '小时之前 ';\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t Vue.set(Message.MessageList, i, result)\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t/*这里需要特别注意 的就是这里的VUE的set方法因为这里如果不用这个方法它不会显示 时间 ,同时需要和head。jsp 页面相联系 ,\r\n");
      out.write("\t\t注意那边的 时间是time,那边的时间time就是在这里的result中 设置的一个属性 ,写的过程中因为对于 时间变量 的来源不清楚 ,所以出现的情况就是 直接 \r\n");
      out.write("\t\t对 createtime进行时间转化 ,这样出现的 结果就是世界的 转化第一次正确,但是再次点击时间格式不正确 ,注意这里的result。time */\r\n");
      out.write("</script>");
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
