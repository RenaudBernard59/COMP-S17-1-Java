/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.dao.FilmDAO;
import streamingweb.dao.FilmDAOJpaImpl;
import streamingweb.entity.Film;

/**
 *
 * @author renob
 */
public class FilmServiceImpl implements FilmService {
    private FilmDAO dao = new FilmDAOJpaImpl();
    @Override
    public List<Film> listerFilms() {
        
        
        return dao.lister();
    }
    
}
