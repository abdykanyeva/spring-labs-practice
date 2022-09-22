package com.cydeo.lab03yummi;

import com.cydeo.lab03yummi.config.DBConfigData;
import com.cydeo.lab03yummi.service.RecipeService;
import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class YummiApplication {

	public static void main(String[] args) {




		ApplicationContext context = SpringApplication.run(YummiApplication.class, args);
		RecipeService recipe = context.getBean(RecipeService.class);

		recipe.prepareRecipe();
		DBConfigData author = context.getBean(DBConfigData.class);
		System.out.println("Here you are! Author of the recipe");
		System.out.println("Name: " + author.getName() + "Surname: " + author.getSurname()
		+ "Social media" + author.getSocialMedia() + "Email"+author.getEmail());


	}

}
