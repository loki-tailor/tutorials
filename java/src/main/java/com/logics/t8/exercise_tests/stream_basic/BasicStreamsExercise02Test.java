package com.logics.t8.exercise_tests.stream_basic;

import com.pluralsight.streamslambdas.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.pluralsight.streamslambdas.Category.*;
import static org.assertj.core.api.Assertions.assertThat;

class BasicStreamsExercise02Test {

    private BasicStreamsExercise02 exercise = new BasicStreamsExercise02();

    @Test
    @DisplayName("Get product names for category")
    void getProductNamesForCategory() {
        assertThat(exercise.getProductNamesForCategory(com.pluralsight.streamslambdas.exercises.TestData.getProducts(), OFFICE))
                .describedAs("Exercise 2a: Your solution does not return the correct result for the category OFFICE.")
                .containsExactly("Pencils");

        assertThat(exercise.getProductNamesForCategory(com.pluralsight.streamslambdas.exercises.TestData.getProducts(), FOOD))
                .describedAs("Exercise 2a: Your solution does not return the correct result for the category FOOD.")
                .containsExactly("Apples", "Spaghetti");

        assertThat(exercise.getProductNamesForCategory(com.pluralsight.streamslambdas.exercises.TestData.getProducts(), UTENSILS))
                .describedAs("Exercise 2a: Your solution does not return the correct result for the category UTENSILS.")
                .containsExactly("Plates", "Knives", "Forks");

        assertThat(exercise.getProductNamesForCategory(com.pluralsight.streamslambdas.exercises.TestData.getProducts(), CLEANING))
                .describedAs("Exercise 2a: Your solution does not return the correct result for the category CLEANING.")
                .containsExactly("Detergent");
    }

    @Test
    @DisplayName("Categories to product names")
    void categoriesToProductNames() {
        assertThat(exercise.categoriesToProductNames(com.pluralsight.streamslambdas.exercises.TestData.getProducts().stream().collect(Collectors.groupingBy(Product::getCategory)), Stream.of(FOOD, UTENSILS, CLEANING, OFFICE)))
                .describedAs("Exercise 2b: Your solution does not return the correct result.")
                .containsExactly("Apples", "Spaghetti", "Plates", "Knives", "Forks", "Detergent", "Pencils");
    }
}
