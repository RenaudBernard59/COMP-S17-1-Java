<%-- 
    Document   : _TEMPLATE
    Created on : 17 avr. 2018, 15:49:11
    Author     : renob
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="_ENTETE.jsp"/>
        <c:import url="_MENU.jsp"/>
        <main>
            <c:forEach items="${listeDesFilms}" var="filmActuel">
                <p>${filmActuel.titre} | <a href="detail_film?idDuFilm=${filmActuel.id}"><button>Détails</button></a></p>
            </c:forEach>
        </main>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
