package com.kodilla.testing.forum.statistics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;

    private StatisticsCounter calculator;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        calculator = new StatisticsCounter();
    }

    @Test
    public void testCalculateAdvStatisticsWhenPostsCountIsZero() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        List<String> users = Arrays.asList("user1", "user2");
        when(statisticsMock.usersNames()).thenReturn(users);

        // When
        calculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, calculator.getAvgPostsPerUser());
        assertEquals(0, calculator.getAvgCommentsPerPost());
    }

}