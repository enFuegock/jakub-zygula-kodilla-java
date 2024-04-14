package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    private OddNumbersExterminator oddNumbersExterminator;

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
        oddNumbersExterminator = new OddNumbersExterminator();
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create OddNumbersExterminator with emptyList, " +
            "then emptyList should return blank array")

    @Test
    void testOddNumbersExterminatorEmptyListTest() {
        // Given
        List<Integer> emptyList = new ArrayList<>();

        // When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);

        // Then
        Assertions.assertEquals(0, result.size());
    }

    @DisplayName("when create OddNumbersExterminator with normal size list with numbers, " +
            "then this list should return even numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {
        // Given
        List<Integer> normalList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expectedResult = Arrays.asList(2, 4, 6, 8, 10);
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(normalList);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
