package com.acme.demo.service;

import com.acme.demo.dao.ItineraryDAO;
import com.acme.demo.entity.Itinerary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItineraryServiceImpl implements ItineraryService{
    @Autowired
    private ItineraryDAO itineraryDAO;

    @Override
    public Itinerary findById(int id) {
        Itinerary itinerary = itineraryDAO.findById(id);
        return itinerary;
    }

    @Override
    public void save(Itinerary itinerary) {
        itineraryDAO.save(itinerary);
    }
}
