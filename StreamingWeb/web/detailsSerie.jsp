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
            <h2>Détails de la Série</h2>
            <p>Titre : ${serie.titre} </p>   
            <p>Realisateur : </p> 
            <p>Année : ${serie.annee} </p> 
            <p>Acteurs :  </p> 
            <p>Genre : ${serie.genre.nom} </p> 
            <p>Pays :<ul>
                <c:forEach items="${serie.pays}" var="paysAct">
                    <li>${paysAct.nom}</li>
                </c:forEach>
            </ul>
            </p> 
            <p>Saison :<ul>
                <c:forEach items="${serie.saison}" var="SaisonAct">
                    <li>${saisonAct.nom}</li>
                </c:forEach>
            </ul>
            </p> 
            <p>Synposis : ${serie.synopsis} </p> 
        </main>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
