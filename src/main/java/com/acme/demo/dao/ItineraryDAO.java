package com.acme.demo.dao;

import com.acme.demo.entity.Itinerary;

public interface ItineraryDAO {

    public Itinerary findById(int id);

    public void save(Itinerary itinerary);
}
