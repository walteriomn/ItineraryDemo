package com.acme.demo.service;

import com.acme.demo.entity.Itinerary;

public interface ItineraryService {
    public Itinerary findById(int id);

    public void save(Itinerary user);
}
