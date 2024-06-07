package com.Recipe_App.web;

import com.Recipe_App.domain.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Recipe_App.service.RecipeService;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeRestController {
    private final RecipeService recipeService;

    @Autowired
    public RecipeRestController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/all")
    public List<Recipe> getAllRecipes() throws IOException {
        return recipeService.getAllRecipes();
    }

    @GetMapping("/gluten-free")
    public List<Recipe> getGlutenFreeRecipes() throws IOException {
        return recipeService.getGlutenFreeRecipes();
    }

    @GetMapping("/vegan")
    public List<Recipe> getVeganRecipes() throws IOException {
        return recipeService.getVeganRecipes();
    }

    @GetMapping("vegan-and-gluten-free")
    public List<Recipe> getVeganAndGlutenFreeRecipes() throws IOException {
        return recipeService.getVeganAndGlutenFreeRecipes();
    }

    @GetMapping("/vegetarian")
    public List<Recipe> getVegetarianRecipes() throws IOException {
        return recipeService.getVegetarianRecipes();
    }
}
