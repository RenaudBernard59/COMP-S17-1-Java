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
import streamingweb.entity.Serie;
import streamingweb.service.SerieService;
import streamingweb.service.SerieServiceImpl;

/**
 *
 * @author renob
 */
@WebServlet(name = "DetailSeriesServlet", urlPatterns = {"/detail_serie"})
public class DetailsSeriesServlet extends HttpServlet {
    private SerieService service = new SerieServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1. Réceptionner l'ID du serie sélectionner
        String idString = req.getParameter("idSerie");

        // 2. Récupérer serie à pardir de la SGBD et de l'ID
        Serie serie = service.rechercheParId(Long.parseLong(idString));

        // 3. Set serie en attribut requete
        req.setAttribute("serie", serie);
       
        // 4. Forwart to KSP
        req.getRequestDispatcher("detailsSerie.jsp").forward(req, resp);
    }

    
    
    
    
    
}
