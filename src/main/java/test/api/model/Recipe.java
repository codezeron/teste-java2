package test.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents a recipe with various details such as publisher, title, and URLs.
 * Utilizes Lombok annotations for boilerplate code like getters, setters, and constructors.
 */
@Data
@NoArgsConstructor // Generates a no-argument constructor.
@AllArgsConstructor // Generates a constructor for all fields.
public class Recipe {
    private String publisher; // The name of the publisher of the recipe.
    private String title; // The title of the recipe.
    private String source_url; // The URL to the original recipe post.
    private String recipe_id; // A unique identifier for the recipe.
    private String image_url; // The URL to the image of the dish.
    private double social_rank; // A ranking based on social metrics.
    private String publisher_url; // The URL to the publisher's homepage.
}