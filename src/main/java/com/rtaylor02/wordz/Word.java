package com.rtaylor02.wordz;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Rodney Taylor (u228616)
 */
public class Word {
<<<<<<< HEAD
    private final String correctWord;
    
    public Word(String a) {
        // Safely copy value of a
        String temp = new String(a);
        correctWord = temp;
    }
    
    public Score guess(Word guessedWord) {
        return Score.INCORRECT;
=======
    private final String word;
    
    public Word(String correctWord) {
        this.word = correctWord;
    }
    
    public Score guess(String attempt) {
        var score = new Score(word);
        score.assess(attempt);
        return score;
>>>>>>> 9b5dcab445d328fa8aabd06c1110e6a4a35e706c
    }
    
    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }
    
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
