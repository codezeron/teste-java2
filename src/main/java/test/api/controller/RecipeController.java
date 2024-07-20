package test.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.api.client.ForkifyClient;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private ForkifyClient forkifyClient;

    @GetMapping("/search")
    public ResponseEntity<String> getRecipes(@RequestParam String dish) {
        return forkifyClient.searchRecipes(dish);
    }
}
