<%-- 
    Document   : index
    Created on : Sep 19, 2019, 12:03:34 PM
    Author     : Sars
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%--<%@page import="java.util.Date"%>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>JSP Page</title>
    </head>
    <body class="container">

        <h1>euro ir užsienio valiutų santykiai!</h1>
        <h3>Valiutų kursų data </h3>        
        <form action="list" method="post">
            <input type="date" name="date" value="${date}" min="2014-10-01" max="${date}" title=" Pasirinkite datą vliutų kursui užkrauti"  > <input
                type="submit" value="Valiutų kursai">
        </form><br>

        Pasirinkite valiutą ir datos intervalą<br>

        <select action="currencyrate" method="post" name="code" size="4" multiple form="currencycodeform">

            <c:forEach items="${currlist}" var="cl">
                <option name='code' value="${cl.code}">${cl.currency} ${cl.code} </option>
            </c:forEach>
        </select><br>
        <form action="currencyrate" method="post" id="currencycodeform">
            Pasirinkite datos intervala:<br>
            <input type="date" name="startingday" min="2014-10-01" value="2019-09-16">
            <input type="date" name="endingday" min="2014-10-01" value="2019-09-25"><br>
            <input type="submit" value="Tvirtinti">
            <input type="reset" value="Išvalyti">
        </form>





    </body>
</html>
