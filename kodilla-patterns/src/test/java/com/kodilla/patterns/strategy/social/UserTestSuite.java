package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        // Given
        User millenial = new Millenials("Millenial User");
        User yGeneration = new YGeneration("YGeneration User");
        User zGeneration = new ZGeneration("ZGeneration User");

        // When
        String millenialPost = millenial.sharePost();
        String yGenerationPost = yGeneration.sharePost();
        String zGenerationPost = zGeneration.sharePost();

        // Then
        assertEquals("Facebook", millenialPost);
        assertEquals("Twitter", yGenerationPost);
        assertEquals("Snapchat", zGenerationPost);
    }

    @Test
    void testIndividualSharingStrategy() {
        // Given
        User millenial = new Millenials("Millenial User");

        // When
        String millenialPost = millenial.sharePost();
        millenial.setSocialPublisher(new SnapchatPublisher());
        String newMillenialPost = millenial.sharePost();

        // Then
        assertEquals("Facebook", millenialPost);
        assertEquals("Snapchat", newMillenialPost);
    }
}
