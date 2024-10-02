package com.rtaylor02;

<<<<<<< HEAD
=======
import com.rtaylor02.wordz.Letter;
>>>>>>> 9b5dcab445d328fa8aabd06c1110e6a4a35e706c
import com.rtaylor02.wordz.Score;
import com.rtaylor02.wordz.Word;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author Rodney Taylor (u228616)
 */
class WordTest {
<<<<<<< HEAD
    /*
=======
    /**
>>>>>>> 9b5dcab445d328fa8aabd06c1110e6a4a35e706c
     * GIVEN a single character word
     * WHEN an incorrect guess to the word is presented
     * THEN score value of INCORRECT should be given
     */
    @Test
<<<<<<< HEAD
    void shouldScoreINCORRECT_whenAnIncorrectWordIsEntered() {
        // ARRANGE
        Word word = new Word("A");
        
        // ACT
        Score actualScore = word.guess(new Word("Z"));
        
        // ASSERT
        assertThat(actualScore).isEqualTo(Score.INCORRECT);
=======
    void oneIncorrectLetter() {
        // ARRANGE
        var word = new Word("A");
        var score = word.guess("Z");

        // ACT
        assertScoreForGuess(score, Letter.INCORRECT);
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
        assertScoreForGuess(score, Letter.CORRECT);
    }

    /**
     * GIVEN a two character word
     * WHEN a guess word contains 1 incorrect letter and 1 positionally incorrect letter
     * THEN score value of INCORRECT, PART_CORRECT should be given
     */
    @Test
    void secondLetterIncorrectPosition() {
        // ARRANGE
        var word = new Word("AR");
        var score = word.guess("ZA");

        // ACT - ASSERT
        assertScoreForGuess(score, Letter.INCORRECT, Letter.PART_CORRECT);
    }

    /**
     * GIVEN a 3 character word
     * WHEN a guess word contains all possible scenarios: INCORRECT, CORRECT, and PART_CORRECT
     * THEN score value should reflect accordingly
     */
    @Test
    void allScoreCombinations() {
        // ARRANGE
        var word = new Word("ARI");
        var score = word.guess("ZAI");

        // ACT - ASSERT
        assertScoreForGuess(score, Letter.INCORRECT, Letter.PART_CORRECT, Letter.CORRECT);
    }

    private void assertScoreForGuess(Score score, Letter... expectedScores) {
        for (int position = 0; position < expectedScores.length; position++) {
            assertThat(score.letter(position)).isEqualTo(expectedScores[position]);
        }
>>>>>>> 9b5dcab445d328fa8aabd06c1110e6a4a35e706c
    }
}
