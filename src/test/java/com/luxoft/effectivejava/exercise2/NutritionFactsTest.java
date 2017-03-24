package com.luxoft.effectivejava.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Fix the code to make the test pass.
 */
public class NutritionFactsTest {

    @Test
    public void shouldCreateNutritionFacts() {
        // given
        int calories = 100;
        int fat = 25;
        int sodium = 35;
        int carbohydrate = 27;

        // when
        NutritionFacts cocaCola = new NutritionFacts.Builder().calories(100).fat(25).build();

        // then
        assertEquals(calories, cocaCola.getCalories());
        assertEquals(fat, cocaCola.getFat());
        assertEquals(sodium, cocaCola.getSodium());
        assertEquals(carbohydrate, cocaCola.getCarbohydrate());
    }
}