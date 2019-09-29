<%-- 
    Document   : currencyrate
    Created on : Sep 27, 2019, 9:18:36 AM
    Author     : Sars
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
       <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>JSP Page</title>
    </head>
    <body class="container">
        <h1>currencyrate</h1>

        ${code1.currency} 
        ${code1.code} <br>
        ${code1.date}
        ${code2.date}</br>
        ${code1.value} 
        ${code2.value}<br>
        ${ratex}
        </br>
        <a href="back"><button>back</button></a><br/>
    </body>
</html>
