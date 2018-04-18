/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.dao.SerieDAO;
import streamingweb.dao.SerieDAOJpaImpl;
import streamingweb.entity.Serie;

/**
 *
 * @author renob
 */
public class SerieServiceImpl implements SerieService {
    private SerieDAO dao = new SerieDAOJpaImpl();
    @Override
    public List<Serie> listerSeries() {
        
        
        return dao.lister();
    }
    
}
