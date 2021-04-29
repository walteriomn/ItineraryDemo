package com.acme.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itinerary")
public class Itinerary {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="iditinerary")
    private int idItinerary;

    @Column(name="deperturedate")
    private String depertureDate;

    @Column(name="arrivaldate")
    private String arrivalDate;

    @Column(name="sourcecity")
    private String sourceCity;

    @Column(name="destinationcity")
    private String destinationCity;

    @Column(name="passengername")
    private String passengerName;

    @Column(name="passengerage")
    private String passengerAge;

    @Column(name="luggageroom")
    private int luggageRoom;

    @Column(name="price")
    private String price;

    @Column(name="deperturetime")
    private String depertureTime;

    public Itinerary(){}

    public int getIdItinerary() {
        return idItinerary;
    }

    public void setIdItinerary(int idItinerary) {
        this.idItinerary = idItinerary;
    }

    public String getDepertureDate() {
        return depertureDate;
    }

    public void setDepertureDate(String depertureDate) {
        this.depertureDate = depertureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(String passengerAge) {
        this.passengerAge = passengerAge;
    }

    public int getLuggageRoom() {
        return luggageRoom;
    }

    public void setLuggageRoom(int luggageRoom) {
        this.luggageRoom = luggageRoom;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDepertureTime() {
        return depertureTime;
    }

    public void setDepertureTime(String depertureTime) {
        this.depertureTime = depertureTime;
    }

    @Override
    public String toString() {
        return "User [id=" + idItinerary + ", source=" + sourceCity + ", destination=" + destinationCity + ", passenger=" + passengerName
                + ", deperture=" + depertureTime + "]";
    }
}
