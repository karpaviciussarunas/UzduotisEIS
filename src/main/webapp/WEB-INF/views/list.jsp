<%-- 
    Document   : list.jsp
    Created on : Sep 24, 2019, 4:53:15 PM
    Author     : Sars
--%>

<%@page import="java.text.SimpleDateFormat"%>
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
        <h1>Valiutų sąrašas - data: ${date}.</h1>

        <table id="curr_rates">
            <thead>
                <tr>
                    <th class="header">Valiutos pavadinimas</th>
                    <th class="header">Valiutos kodas</th>
                    <th class="header">Santykis</th>
                    <th class="header">Data</th>
                </tr>
            </thead>
            <c:forEach items="${currlist}" var="cl">
                <tbody>
                    <tr>
                        <td title="${cl.currency}">${cl.currency}</td>
                        <td title="${cl.code}">${cl.code}</td>
                        <td><span>${cl.value}</span></td>
                        <td title="date">${cl.date}<data></td>
                    </tr>
                </tbody>
            </c:forEach>

            <a href="back"><button>back</button></a><br>


            
            
            </body>
            </html>
