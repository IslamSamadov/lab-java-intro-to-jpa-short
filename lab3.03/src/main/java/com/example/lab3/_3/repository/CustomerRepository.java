package com.example.lab3._3.repository;

import com.example.lab3._3.enitity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
