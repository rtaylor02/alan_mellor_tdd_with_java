package com.rtaylor02;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author Rodney Taylor (u228616)
 */
class UsernameTest {
    
    /*
     * GIVEN a player
     * WHEN their username is processed
     * THEN their username should be in lowercase
     */
    @Test
    void testAsLowerCase_shouldBeInLowercase_whenUsernameIsProcessed() {
        // ARRANGE
        var userName = new Username("SirJakington35179");
        
        // ACT
        var actual = userName.asLowerCase();
        
        // ASSERT
        assertThat(actual).isEqualTo("sirjakington35179");
    }
}


