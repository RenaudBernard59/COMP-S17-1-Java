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
import streamingweb.entity.Serie;
import streamingweb.service.SerieService;
import streamingweb.service.SerieServiceImpl;

/**
 *
 * @author renob
 */
@WebServlet(name = "SeriesServlet", urlPatterns = {"/series"})
public class SeriesServlet extends HttpServlet {
    private SerieService service = new SerieServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. Récupérer la liste de films avec SerieService
        List<Serie> films = service.listerSeries();

        //2. Envoyer liste films film comme attribut request
        req.setAttribute("listeDesSeries", films);

        //3. Envoyer vers films.jsp
        req.getRequestDispatcher("series.jsp").forward(req, resp);
    }
    
    
}
