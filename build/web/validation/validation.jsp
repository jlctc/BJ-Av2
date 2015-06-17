<%-- 
    Document   : validation
    Created on : Jun 16, 2015, 4:39:39 PM
    Author     : BrunoWB
--%>

<%
    response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); //prevents caching at the proxy server
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@page import="plist.DAO.*"%>

<%@page import="plist.controller.*"%>

<%  
    //Initialize Variables
    String Log  = " ";
    String Pass = " ";
    String LogS = "false";
    String Index = "false";
    
    //Get Cookies and set Values into variables
    Cookie[] cookies = request.getCookies();
    for(int i = 0; i < cookies.length; i++) { 
        Cookie c = cookies[i];
        if (c.getName().equals("Login"))    { Log = c.getValue(); }
        if (c.getName().equals("Senha"))    { Pass = c.getValue(); }
        if (c.getName().equals("LogStatus")){ LogS = c.getValue(); }
        if (c.getName().equals("Index"))    { Index = c.getValue(); }
    }  
    
    // If Page Comes from Index, Check Login and Password
    if (Index.equals("true")) {
        Log = request.getParameter("fLog");
        Pass = request.getParameter("fPass");
    }
    
    
    // Check if Login is not true (Cookie Object)
    if (!LogS.equals("true")){
        // Check for incoming Login and Password 
        if (!Log.equals(" ")) {
            //Call Function to Verify User
            if (!SiteValidUser.Valid(Log, Pass)) {
                // Redirect to Index
                response.sendRedirect("index.jsp");
            } else {
                // Set LogStatus on Cookie to true
                Cookie LogStatus = new Cookie("LogStatus","true");
                response.addCookie(LogStatus);
            }
        } else {
            // Redirect to Index
            response.sendRedirect("index.jsp");
        }
    }
%>