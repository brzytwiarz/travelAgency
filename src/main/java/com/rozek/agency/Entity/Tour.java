package com.rozek.agency.Entity;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Tour {
    private AirPort from;
    private Hotel hotel;
    private LocalDate dateOfDepartures;
    private LocalDate dateOfBack;
    private int days;
    private BigDecimal priceForAdult;
    private BigDecimal priceForChild;
    private boolean promotion;
    private int numberOfPlacesForAdult;
    private int numberOfPlacesForChild;
}
