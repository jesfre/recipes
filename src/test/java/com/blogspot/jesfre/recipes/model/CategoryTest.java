package com.blogspot.jesfre.recipes.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setup() {
        category = new Category();
    }

    @Test
    public void getId() {
        category.setId(3L);

        assertEquals(3, category.getId().longValue());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}