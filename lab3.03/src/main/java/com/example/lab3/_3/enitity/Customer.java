package com.example.lab3._3.enitity;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cusotmerId;
    @Column(nullable = false,length = 100)
    private String customerName;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CustomerStatus customerStatus;
    @Column(nullable = false)
    private Integer totalCustomerMilage;

    public Customer() {}

    public Customer(String customerName, CustomerStatus customerStatus, Integer totalCustomerMilage) {
        this.customerName = customerName;
        this.customerStatus = customerStatus;
        this.totalCustomerMilage = totalCustomerMilage;
    }

    public Integer getCusotmerId() {
        return cusotmerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Integer getTotalCustomerMilage() {
        return totalCustomerMilage;
    }

    public void setTotalCustomerMilage(Integer totalCustomerMilage) {
        this.totalCustomerMilage = totalCustomerMilage;
    }
}
