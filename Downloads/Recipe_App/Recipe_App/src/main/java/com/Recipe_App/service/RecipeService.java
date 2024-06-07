package com.Recipe_App.service;

import com.Recipe_App.domain.Recipe;
import org.springframework.stereotype.Service;
import com.Recipe_App.repository.RecipeRepo;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeService {
    private final RecipeRepo recipeRepository;

    public RecipeService(RecipeRepo recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAllRecipes() throws IOException {
        return recipeRepository.getAllRecipes();
    }

    public List<Recipe> getGlutenFreeRecipes() throws IOException {
        return getAllRecipes().stream()
                .filter(Recipe::getGlutenFree)
                .collect(Collectors.toList());
    }

    public List<Recipe> getVeganRecipes() throws IOException {
        return getAllRecipes().stream()
                .filter(Recipe::getVegan)
                .collect(Collectors.toList());
    }

    public List<Recipe> getVeganAndGlutenFreeRecipes() throws IOException {
        return getAllRecipes().stream()
                .filter(recipe -> recipe.getVegan() && recipe.getGlutenFree())
                .collect(Collectors.toList());
    }

    public List<Recipe> getVegetarianRecipes() throws IOException {
        return getAllRecipes().stream()
                .filter(Recipe::getVegetarian)
                .collect(Collectors.toList());
    }

}
