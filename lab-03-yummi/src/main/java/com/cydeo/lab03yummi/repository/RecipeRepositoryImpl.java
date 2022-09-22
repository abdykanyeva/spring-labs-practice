package com.cydeo.lab03yummi.repository;

import com.cydeo.lab03yummi.model.Recipe;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


@Component
public class RecipeRepositoryImpl implements RecipeRepository{

    List<Recipe> recipeList = new ArrayList<>();
    @Override
    public boolean save(Recipe recipe) {
        recipeList.add(recipe);

        return true;
    }
}
