package com.cydeo.lab03yummi.model;


import com.cydeo.lab03yummi.enums.QuantityType;
import lombok.Data;

@Data
public class Ingredients {

    private String name;
    private int quantity;
    private QuantityType quantityType;
}
