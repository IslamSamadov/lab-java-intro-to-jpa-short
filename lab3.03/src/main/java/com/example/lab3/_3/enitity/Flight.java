package com.example.lab3._3.enitity;

import jakarta.persistence.*;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightId;
    @Column(name = "number",nullable = false, unique = true)
    private String flightNumber;
    @Column(nullable = false)
    private String aircraft;
    @Column(name = "total_seats",nullable = false)
    private Integer totalAircraftSeats;
    @Column(name = "milage", nullable = false)
    private Integer flightMilage;

    public Flight() {}

    public Flight(String flightNumber, String aircraft, Integer totalAircraftSeats, Integer flightMilage) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.totalAircraftSeats = totalAircraftSeats;
        this.flightMilage = flightMilage;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Integer getTotalAircraftSeats() {
        return totalAircraftSeats;
    }

    public void setTotalAircraftSeats(Integer totalAircraftSeats) {
        this.totalAircraftSeats = totalAircraftSeats;
    }

    public Integer getFlightMilage() {
        return flightMilage;
    }

    public void setFlightMilage(Integer flightMilage) {
        this.flightMilage = flightMilage;
    }
}