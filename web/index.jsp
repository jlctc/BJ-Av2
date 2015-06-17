<%-- 
    Document   : index
    Created on : Jun 16, 2015, 4:37:49 PM
    Author     : BrunoWB
--%>

<%
    response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); //prevents caching at the proxy server
%>
<%@include file="validation/devalid.jsp" %>
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
        <div class='outerwrap'>
            <div class='innerwrap'>
                <div class='logdiv'>
                    <!-- <img src="Images/indexProtected.png" class="maxwid380"> -->
                    <form name='myForm' method='GET' action='home.jsp' class="myform">
                        <input type="submit" style="outline:none" class="Submit" value=" "><br>
                        <div class="pre-input"> LOGIN</div><input name="fLog" type='text'/><br>
                        <div class="pre-input"> PASS</div><input name="fPass" type='password'/><br>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
