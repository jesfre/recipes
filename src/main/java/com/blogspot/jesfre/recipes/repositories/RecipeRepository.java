package com.blogspot.jesfre.recipes.repositories;

import com.blogspot.jesfre.recipes.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
