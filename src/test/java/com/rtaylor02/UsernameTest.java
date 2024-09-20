package com.rtaylor02;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


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
    void shouldBeInLowercase_whenUsernameIsProcessed() {
        // ARRANGE
        var userName = new Username("SirJakington35179");
        
        // ACT
        var actual = userName.asLowerCase();
        
        // ASSERT
        assertThat(actual).isEqualTo("sirjakington35179");
    }
    
    /*
     * GIVEN a player
     * WHEN they assign short username with < 3 characters
     * THEN InvalidNameException will be thrown
     */
    @Test
    void shouldThrowInvalidNameException_whenShortUsernameIsUsed() {
        // ARRANGE - ACT - ASSERT
        assertThatExceptionOfType(InvalidNameException.class).isThrownBy(() -> new Username("abc"));
    }
}


