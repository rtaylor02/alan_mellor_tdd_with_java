package com.rtaylor02.wordz;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Rodney Taylor (u228616)
 */
public class Word {
    private final String word;
    
    public Word(String correctWord) {
        this.word = correctWord;
    }
    
    public Score guess(String attempt) {
        var score = new Score(word);
        score.assess(0, attempt);
        return score;
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
