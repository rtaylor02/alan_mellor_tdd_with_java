package com.rtaylor02;

import com.rtaylor02.wordz.Letter;
import com.rtaylor02.wordz.Score;
import com.rtaylor02.wordz.Word;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author Rodney Taylor (u228616)
 */
class WordTest {
    /*
     * GIVEN a single character word
     * WHEN an incorrect guess to the word is presented
     * THEN score value of INCORRECT should be given
     */
    @Test
    void oneIncorrectLetter() {
        // ARRANGE
        var word = new Word("A");
        var score = word.guess("Z");

        // ACT
        assertScoreForLetter(score, 0, Letter.INCORRECT);
    }

    /**
     * GIVEN a single character word
     * WHEN a correct guess to the word is presented
     * THEN score value of CORRECT should be given
     */
    @Test
    void oneCorrectLetter() {
        // ARRANGE
        var word = new Word("A");
        var score = word.guess("A");

        // ACT - ASSERT
        assertScoreForLetter(score, 0, Letter.CORRECT);
    }

    private static void assertScoreForLetter(Score score, int position, Letter correct) {
        var result = score.letter(position);

        // ACT - ASSERT
        assertThat(result).isEqualTo(correct);
    }
}
