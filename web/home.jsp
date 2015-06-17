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
                <div class='leftmenu'>
                    <a href="browsetipo.jsp?tipo=free+streamer" class="blocka">
                    <div class="button">
                        BROWSE TYPE
                    </div>
                       </a>
                </div>
                
                
                <div class='logdiv'>
                    <%=  SiteGetSitesDiv.getBlocks()  %>
                </div>
                
                <%@include file="include/BotSite.jsp" %>
            </div>
        </div>
    </body>
</html>
