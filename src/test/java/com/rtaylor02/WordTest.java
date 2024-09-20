package com.rtaylor02;

import com.rtaylor02.wordz.Score;
import com.rtaylor02.wordz.Word;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author Rodney Taylor (u228616)
 */
class WordTest {
    /*
     * GIVEN a game
     * WHEN a single correct letter is entered
     * THEN score value of INCORRECT should be given
     */
    @Test
    void shouldScoreINCORRECT_whenAnIncorrectLetterIsEntered() {
        // ARRANGE
        Word word = new Word("A");
        
        // ACT
        Score actualScore = word.guess(new Word("Z"));
        
        // ASSERT
        assertThat(actualScore).isEqualTo(Score.INCORRECT);
    }
}
