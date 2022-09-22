package com.cydeo.lab03yummi.service;

import ch.qos.logback.core.pattern.FormatInfo;
import com.cydeo.lab03yummi.config.DBConfigData;
import com.cydeo.lab03yummi.enums.QuantityType;
import com.cydeo.lab03yummi.enums.RecipeType;
import com.cydeo.lab03yummi.model.Ingredients;
import com.cydeo.lab03yummi.model.Recipe;
import com.cydeo.lab03yummi.proxy.ShareService;
import com.cydeo.lab03yummi.repository.RecipeRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.*;


@Component
public class RecipeServiceImpl implements RecipeService{


    private final RecipeRepository repository;
    private final ShareService shareService;
    private final DBConfigData dbConfigData;
    private final Faker faker;

    public RecipeServiceImpl(RecipeRepository repository, ShareService shareService, DBConfigData dbConfigData, Faker faker) {
        this.repository = repository;
        this.shareService = shareService;
        this.dbConfigData = dbConfigData;
        this.faker = faker;
    }


    @Override
    public boolean prepareRecipe() {

        for (int i = 0; i < 20; i++) {

            Arrays.stream(RecipeType.values()).forEach(recipeType -> {

                Recipe recipe = new Recipe();
                recipe.setId(UUID.randomUUID());
                recipe.setName(faker.food().dish());
                recipe.setDuration(generateRandomValue());
                recipe.setPreparation(faker.lorem().paragraph(generateRandomValue()));
                recipe.setIngredients(prepareIngredients());
                recipe.setRecipeType(recipeType);


                repository.save(recipe);
                shareService.share(recipe);


            });
        }
        return true;
    }

    private List<Ingredients> prepareIngredients() {
        List<QuantityType> quantityTypes = List.of(QuantityType.values());
        List<Ingredients> ingredients = new ArrayList<>();

        for (int i = 0; i < generateRandomValue(); i++) {

            Ingredients ingredient = new Ingredients();
            ingredient.setName(faker.food().ingredient());
            ingredient.setQuantity(generateRandomValue());
            ingredient.setQuantityType(quantityTypes.get(new Random().nextInt(3)));
            ingredient.setQuantity(generateRandomValue());


        }

        return ingredients;

    }


    private int generateRandomValue(){
        return new Random().nextInt(20);
    }

//    @PreDestroy
//    public void printCreator(){
//        System.out.println(dbConfigData.getName());
//        System.out.println(dbConfigData.getSurname());
//        System.out.println(dbConfigData.getEmail());
//        System.out.println(dbConfigData.getSocialMedia());
//    }
}
