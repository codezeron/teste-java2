package test.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * Represents the response structure for recipe search operations.
 * This class encapsulates the total count of recipes found and a list of {@link Recipe} objects.
 * It uses Lombok annotations to reduce boilerplate code for getters, setters, and constructors.
 */
@Data // Generates getters, setters, equals, hashCode, and toString methods.
@NoArgsConstructor // Generates a no-argument constructor.
@AllArgsConstructor // Generates a constructor that initializes all fields.
public class RecipeResponse {
    private int count; // The total number of recipes found.
    private List<Recipe> recipes; // A list of recipes matching the search criteria.
}