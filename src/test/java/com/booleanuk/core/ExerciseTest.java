package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ExerciseTest {
    Exercise exercise;

    public ExerciseTest() {
        this.exercise = new Exercise();
    }

    @Test
    public void shouldBeAListOfNumbers() {
        ArrayList<Integer> list = this.exercise.getFavouriteNumbers();
        Assertions.assertEquals(42, list.get(0));
        Assertions.assertEquals(360, list.get(1));
        Assertions.assertEquals(120, list.get(2));
    }

    @Test
    public void shouldBe360() {
        Assertions.assertEquals(360, this.exercise.getSecondNumber());
    }

    @Test
    public void shouldMultiply() {
        ArrayList<Integer> list = new ArrayList<>(){{
            add(2);
            add(5);
            add(6);
        }};

        ArrayList<Integer> result = this.exercise.multiply(list, 2);

        Assertions.assertEquals(4, result.get(0));
        Assertions.assertEquals(10, result.get(1));
        Assertions.assertEquals(12, result.get(2));
    }

    @Test
    public void shouldMultiplyMore() {
        ArrayList<Integer> list = new ArrayList<>(){{
            add(3);
            add(7);
            add(12);
            add(11);
            add(16);
        }};

        ArrayList<Integer> result = this.exercise.multiply(list, 3);

        Assertions.assertEquals(9, result.get(0));
        Assertions.assertEquals(21, result.get(1));
        Assertions.assertEquals(36, result.get(2));
        Assertions.assertEquals(33, result.get(3));
        Assertions.assertEquals(48, result.get(4));
    }

    @Test
    public void mustBeEmpty() {
        ArrayList<String> list = new ArrayList<>();
        Assertions.assertTrue(this.exercise.isEmpty(list));
    }

    @Test
    public void mustNotBeEmpty() {
        ArrayList<String> list = new ArrayList<>(){{
            add("Java");
            add("JavaScript");
        }};
        Assertions.assertFalse(this.exercise.isEmpty(list));
    }

    @Test
    public void mustAddIngredients() {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> result = this.exercise.addIngredient(list, "milk");
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("milk", result.get(0));
    }

    @Test
    public void mustRemoveIngredient() {
        ArrayList<String> list = new ArrayList<>(){{
            add("milk");
            add("coffee");
            add("water");
        }};
        ArrayList<String> result = this.exercise.removeIngredient(list, "coffee");
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals("milk", result.get(0));
        Assertions.assertEquals("water", result.get(1));
    }

    @Test
    public void mustCheckList() {
        ArrayList<String> list = new ArrayList<>(){{
            add("milk");
            add("coffee");
            add("water");
        }};
        Assertions.assertTrue(this.exercise.containsIngredient(list, "coffee"));
        Assertions.assertFalse(this.exercise.containsIngredient(list, "sugar"));
    }
}
