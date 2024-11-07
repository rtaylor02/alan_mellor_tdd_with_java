package com.rtaylor02.learning;

import com.rtaylor02.InvalidNameException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class UsernameTest {
    /**
     * GIVEN a username
     * WHEN it's processed to be lowercase
     * THEN the username has only lowercase
     */
    @ParameterizedTest
    @CsvSource({"Rt12345, rt12345", "ABCd, abcd", "123ABCd, 123abcd"})
    void convertToLowerCase(String input, String expected) {
        // ARRANGE
        var username = new Username(input);

        // ACT
        var actual = username.asLowerCase();

        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    /**
     * GIVEN a username input
     * WHEN the name passes minimum (4) and maximum (10) character criteria
     * THEN the application should accept the name as username
     */
    @ParameterizedTest
    @ValueSource(strings = {"abcd", "abdcefg", "abcdefghij"})
    void acceptsValidLengthName(String input) {
        // ARRANGE - ACT - ASSERT
        assertThatNoException().isThrownBy(() -> new Username(input));
    }

    /**
     * GIVEN a username input
     * WHEN the name does not comply with minimum (4) and maximum (10) characters criteria
     * THEN an InvalidNameException is thrown
     */
    @ParameterizedTest
    @ValueSource(strings = {"a", "abcde123456"})
    void rejectsInvalidLengthName(String input) {
        assertThatExceptionOfType(InvalidNameException.class).isThrownBy(() -> new Username(input));
    }
}
