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
import streamingweb.entity.Serie;

/**
 *
 * @author renob
 */
public class SerieDAOJpaImpl implements SerieDAO {

    @Override
    public List<Serie> lister() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query q = em.createQuery("SELECT s FROM Serie s ");
        List<Serie> series = q.getResultList();
        return series;
    }
    @Override
    public Serie trouverDetailSerie(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Serie.class, id);
        
    }
    @Override
    public List<Long> listerSaisonsSerie() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query q = em.createQuery("SELECT ss FROM Serie s JOIN serie.saison ss");
        List<Long> saisons = q.getResultList();
        return saisons;
    }
    @Override
    public List<Long> listerEpisodesSaisonSerie() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query q = em.createQuery("SELECT se FROM Serie s JOIN serie.saison ss JOIN ss.episode se ");
        List<Long> episodes = q.getResultList();
        return episodes;
    }

}
