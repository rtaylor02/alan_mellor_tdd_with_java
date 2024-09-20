package com.rtaylor02.wordz;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Rodney Taylor (u228616)
 */
public class Word {
    private final String correctWord;
    
    public Word(String a) {
        // Safely copy value of a
        String temp = new String(a);
        correctWord = temp;
    }
    
    public Score guess(Word guessedWord) {
        return Score.INCORRECT;
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
