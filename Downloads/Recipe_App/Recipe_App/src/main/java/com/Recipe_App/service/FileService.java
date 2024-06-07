package com.Recipe_App.service;

import com.Recipe_App.domain.Recipe;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileService {
    public List<String> readFile(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName));

    }

    public List<Recipe> readRecipeFile() {
        List<Recipe> recipes = new ArrayList<>();

        try (Reader in = new FileReader("recipes.txt")) {
            CSVFormat csvFormat = CSVFormat.Builder.create()
                    .setHeader()
                    .setSkipHeaderRecord(true)
                    .setTrim(true)
                    .setIgnoreSurroundingSpaces(true)
                    .setEscape('\\')
                    .setQuote('"')
                    .build();

            CSVParser parser = csvFormat.parse(in);

            Iterable<CSVRecord> records = parser.getRecords();

            for (CSVRecord record : records) {
                try {
                    Recipe recipe = parseRecipe(record);
                    recipes.add(recipe);
                } catch (IllegalArgumentException e) {
                    System.err.println("Error parsing record: " + e.getMessage() + " Record: " + record);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return recipes;
    }

    private Recipe parseRecipe(CSVRecord record) {
        Recipe recipe = new Recipe(
                safeParseInt(record.get("Cooking Minutes")),
                Boolean.parseBoolean(record.get("Dairy Free")),
                Boolean.parseBoolean(record.get("Gluten Free")),
                record.get("Instructions"),
                safeParseDouble(record.get("Preparation Minutes")),
                safeParseDouble(record.get("Price Per Serving")),
                safeParseInt(record.get("Ready In Minutes")),
                safeParseInt(record.get("Servings")),
                safeParseDouble(record.get("Spoonacular Score")),
                record.get("Title"),
                Boolean.parseBoolean(record.get("Vegan")),
                Boolean.parseBoolean(record.get("Vegetarian"))
        );

        return recipe;
    }

    private int safeParseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private double safeParseDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

}
