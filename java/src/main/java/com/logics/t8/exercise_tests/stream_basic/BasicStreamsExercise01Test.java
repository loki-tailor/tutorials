package com.logics.t8.exercise_tests.stream_basic;

import static com.logics.t8.exercise_tests.stream_basic.TestData.FORKS;
import static com.logics.t8.exercise_tests.stream_basic.TestData.KNIVES;
import static com.logics.t8.exercise_tests.stream_basic.TestData.PLATES;
import static org.assertj.core.api.Assertions.assertThat;

import com.logics.t8.exercises.stream_basic.BasicStreamsExercise01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasicStreamsExercise01Test {

    private BasicStreamsExercise01 exercise = new BasicStreamsExercise01();

    @Test
    @DisplayName("Find utensils sorted by name")
    void findUtensilsSortedByName() {
        assertThat(exercise.findUtensilsSortedByName(TestData.getProducts()))
                .describedAs("Exercise 1: Your solution does not return utensils sorted by name.")
                .containsExactly(FORKS, KNIVES, PLATES);
    }
}
