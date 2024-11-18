package com.model;

import lombok.Data;
import javax.persistence.Embeddable;
import javax.persistence.Column;

@Embeddable
@Data
public class Address {
    @Column(nullable = false)
    private String street;
    
    @Column(nullable = false)
    private String city;
    
    @Column(nullable = false)
    private String state;
    
    @Column(nullable = false)
    private String zipCode;
    
    @Column(nullable = false)
    private String country;
}