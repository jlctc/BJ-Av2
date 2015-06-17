<%-- 
    Document   : home
    Created on : Jun 16, 2015, 6:41:32 PM
    Author     : BrunoWB
--%>
<%
    response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); //prevents caching at the proxy server
%>
<%@include file="validation/validation.jsp" %>
<%@page import="plist.DAO.*"%>
<%@page import="plist.controller.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    String Tipo = request.getParameter("tipo");
%>

<!DOCTYPE html>
<html>
    <head> 
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="mycss.css">
    </head>
    <body>
         <%@include file="include/Exit.jsp" %>
        <div class='outerwrap'>
            <div class='innerwrap'>
                <%@include file="include/TopSite.jsp" %>
                                
                <form action="browsetipo.jsp" method="GET">               
                    <select name="tipo">
                        <option value="free streamer">Free Streamer</option>
                        <option value="pay to be happy">Pay to be Happy</option>
                        <option value="fail and bizarre">Fail and Bizarre</option>
                        <option value="searchporn">Search 4 Porn</option>
                    </select>
                    <input type="submit" name ="Gimme">
                </form>
                
                <div class='logdiv'>
                    
                    <%=  SiteGetSitesDiv.getBlocks(Tipo)  %>
                    
                </div>
                
                <%@include file="include/BotSite.jsp" %>
            </div>
        </div>
    </body>
</html>
