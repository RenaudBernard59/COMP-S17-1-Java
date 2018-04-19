/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streamingweb.entity.Film;

/**
 *
 * @author renob
 */
public class FilmDAOJpaImpl implements FilmDAO {

    @Override
    public List<Film> lister() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query q = em.createQuery("SELECT f FROM Film f");
        List<Film> films = q.getResultList();
        return films;
    }
    @Override
    public Film trouverDetailFilm(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Film.class, id);
        
    }
}
