package com.example.lab3._3.repository;

import com.example.lab3._3.enitity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
