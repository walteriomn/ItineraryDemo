package com.acme.demo.dao;

import com.acme.demo.entity.Itinerary;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class ItineraryDAOImpl implements ItineraryDAO{
    @Autowired
    private EntityManager entityManager;


    @Override
    public Itinerary findById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        Itinerary itinerary = currentSession.get(Itinerary.class, id);

        return itinerary;
    }

    @Override
    public void save(Itinerary itinerary) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(itinerary);
    }
}
