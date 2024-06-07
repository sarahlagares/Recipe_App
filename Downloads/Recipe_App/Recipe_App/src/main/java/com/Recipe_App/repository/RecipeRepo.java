package com.Recipe_App.repository;

import com.Recipe_App.domain.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.Recipe_App.service.FileService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeRepo {
    List<Recipe> recipes = new ArrayList<>();

    @Autowired
    private FileService fileService;

    public List<Recipe> getAllRecipes() throws IOException {
        if (CollectionUtils.isEmpty(recipes)) {
            recipes = fileService.readRecipeFile();

        }
        return recipes;
    }
}
