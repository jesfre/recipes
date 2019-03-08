package com.blogspot.jesfre.recipes.services;


import com.blogspot.jesfre.recipes.model.Recipe;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    void deleteById(Long idToDelete);
}
