package test.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    private String publisher;
    private String title;
    private String source_url;
    private String recipe_id;
    private String image_url;
    private double social_rank;
    private String publisher_url;
}


