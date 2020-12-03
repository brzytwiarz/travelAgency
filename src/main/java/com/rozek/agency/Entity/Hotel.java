package com.rozek.agency.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hotel {
    private String name;
    private int stars;
    private City city;
    private String description;
}
