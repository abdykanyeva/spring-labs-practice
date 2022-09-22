package com.cydeo.lab03yummi.repository;

import com.cydeo.lab03yummi.model.Recipe;

public interface RecipeRepository {

    boolean save(Recipe recipe);
}
