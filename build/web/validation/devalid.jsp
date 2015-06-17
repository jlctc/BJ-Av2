<%-- 
    Document   : devalid
    Created on : Jun 16, 2015, 6:42:11 PM
    Author     : BrunoWB
--%>

<%
    response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); //prevents caching at the proxy server
%>


<%@page import="javax.servlet.http.Cookie"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 

    
    Cookie LogSts   = new Cookie("LogStatus","false");
    Cookie Login    = new Cookie("Login"," ");
    Cookie Senha    = new Cookie("Senha"," ");
    Cookie Index    = new Cookie("Index","true");
    
    LogSts.setMaxAge(24*60*60);
    Login.setMaxAge(24*60*60);
    Senha.setMaxAge(24*60*60);
    Index.setMaxAge(24*60*60);
            
    response.addCookie(LogSts);
    response.addCookie(Login);
    response.addCookie(Senha);
    response.addCookie(Index);
    
   
    %>
