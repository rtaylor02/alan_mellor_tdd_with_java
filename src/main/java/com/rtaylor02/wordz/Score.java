package com.rtaylor02.wordz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rodney Taylor (u228616)
 */
public class Score {
    private final String correct;
    private byte position;
    private final List<Letter> results;

    public Score(String correct) {
        this.correct = correct;
        this.results = new ArrayList<>(correct.length());
    }

    public Letter letter(int position) {
        return results.get(position);
    }

    public void assess(String attempt) {
        for (char c : attempt.toCharArray()) {
            results.add(scoreFor(c));
            position++;
        }
    }

    private Letter scoreFor(char c) {
        if (isCorrectLetter(c)) {
            return Letter.CORRECT;
        } else if (occursInWord(c)) {
            return Letter.PART_CORRECT;
        }
        return Letter.INCORRECT;
    }

    private boolean occursInWord(char c) {
        return correct.contains(String.valueOf(c));
    }

    private boolean isCorrectLetter(char currentLetter) {
        return correct.charAt(position) == currentLetter;
    }
}
