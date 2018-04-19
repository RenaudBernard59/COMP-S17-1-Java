/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "ListerFilmsServlet", urlPatterns = {"/lister_films"})
public class ListerFilmsServlet extends HttpServlet {
    private FilmService service = new FilmServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. Récupérer la liste de films avec FilmService
        List<Film> films = service.listerFilms();

        //2. Envoyer liste films film comme attribut request
        req.setAttribute("listeDesFilms", films);

        //3. Envoyer vers films.jsp
        req.getRequestDispatcher("films.jsp").forward(req, resp);
    }
    
    
}
