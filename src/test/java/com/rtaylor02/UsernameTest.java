package com.rtaylor02;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * @author Rodney Taylor (u228616)
 */
public class UsernameTest {
    
    private Username systemUnderTest;
    
    /*
     * GIVEN a player
     * WHEN their username is processed
     * THEN their username should be in lowercase
     */
    @Test
    public void shouldBeInLowercase_whenUsernameIsProcessed() {
        // ARRANGE
        var expected = new Username("SirJakington35179");
        
        // ACT
        var actual = systemUnderTest.asLowerCase();
        
        // ASSERT
        assertThat(actual).isEqualTo("sirjakington35179");
    }
}


