package com.cydeo.lab03yummi.proxy;

import com.cydeo.lab03yummi.model.Recipe;
import org.springframework.stereotype.Component;


@Component
public class InstagramShareService implements ShareService{


    public boolean share(Recipe recipe) {

        System.out.println("Shared on instagram");
        System.out.println("RecipeType: " + recipe.getRecipeType());
        System.out.println("Recipe Name " + recipe.getName() );
        System.out.println("Ingredient List ");
        recipe.getIngredients().forEach(ingredients -> {
            System.out.println("    Ingredient Name " + ingredients.getName() + " Quantity : " + ingredients.getQuantity() +
                    " " + ingredients.getQuantityType());
        });
        System.out.println("Preperation: \n" + "\t" + recipe.getPreparation());

        return true;
    }
}
