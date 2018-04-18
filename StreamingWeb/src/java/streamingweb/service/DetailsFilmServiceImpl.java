/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.dao.FilmDAO;
import streamingweb.dao.DetailsFilmDAOJpaImpl;
import streamingweb.entity.Film;

/**
 *
 * @author renob
 */
public class DetailsFilmServiceImpl implements FilmService {
    private DetailsFilmDAO dao = new DetailsFilmDAOJpaImpl();
    @Override
    public List<String> listerElements() {
        
        
        return dao.lister();
    }
    
}
