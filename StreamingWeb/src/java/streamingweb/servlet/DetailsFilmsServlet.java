/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streamingweb.entity.Film;
import streamingweb.service.FilmService;
import streamingweb.service.FilmServiceImpl;

/**
 *
 * @author renob
 */
@WebServlet(name = "DetailFilmsServlet", urlPatterns = {"/DetailFilmsServlet"})
public class DetailsFilmsServlet extends HttpServlet {
    private FilmService service = new FilmServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1. Réceptionner l'ID du film sélectionner
        String idString = req.getParameter("idFilm");

        // 2. Récupérer film à pardir de la SGBD et de l'ID
        Film film = service.rechercheParId(Long.parseLong(idString));

        // 3. Set film en attribut requete
       
       
        // 4. Forwart to KSP
        
    }

    
    
    
    
    
}
