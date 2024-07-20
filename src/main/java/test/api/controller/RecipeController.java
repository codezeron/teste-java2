package test.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.api.client.ForkifyClient;

/**
 * The {@code RecipeController} class handles HTTP requests related to recipes.
 * It provides endpoints for searching recipes based on a dish name.
 */
@RestController
@RequestMapping("/recipes")
public class RecipeController {

    // Injects an instance of ForkifyClient to interact with the external recipe API.
    @Autowired
    private ForkifyClient forkifyClient;

    /**
     * Handles GET requests to search for recipes based on a dish name.
     *
     * @param dish The name of the dish to search for recipes.
     * @return A {@link ResponseEntity} containing the search results as a String.
     */
    @GetMapping("/search")
    public ResponseEntity<String> getRecipes(@RequestParam String dish) {
        return forkifyClient.searchRecipes(dish);
    }
}
