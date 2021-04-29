package com.acme.demo.controller;

import com.acme.demo.entity.Itinerary;
import com.acme.demo.service.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ItineraryRestController {
    @Autowired
    private ItineraryService itineraryService;

    @GetMapping("/itineraries/{itineraryId}")
    public Itinerary getItinerary(@PathVariable int itineraryId){
        Itinerary itinerary = itineraryService.findById(itineraryId);

        if(itinerary == null) {
            throw new RuntimeException("Itinerary id not found -"+itineraryId);
        }

        return itinerary;
    }

    @PostMapping("/itineraries")
    public Itinerary addItinerary(@RequestBody Itinerary itinerary) {
        itinerary.setIdItinerary(0);

        itineraryService.save(itinerary);

        return itinerary;
    }

}
