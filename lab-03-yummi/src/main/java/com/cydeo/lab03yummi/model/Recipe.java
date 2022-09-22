package com.cydeo.lab03yummi.model;

import com.cydeo.lab03yummi.enums.RecipeType;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;


@Data
public class Recipe {

    private UUID id;
    private String name;
    private int duration;
    private String preparation;
    private List<Ingredients> ingredients;
    private RecipeType recipeType;

}
