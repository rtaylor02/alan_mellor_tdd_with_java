package com.rtaylor02.domain;

/**
 * @author Rodney Taylor (u228616)
 */
public class Game {
    private final Player player;
    private final String word;
    private int attempt;
    
    public Game(Player player, String word, int attempt) {
        this.player = player;
        this.word = word;
        this.attempt = attempt;
    }
    
    public String getWord() {
        return word;
    }
    
    public int getAttemptNumber() {
        return attempt;
    }
    
    public Player getPlayer() {
        return player;
    }
}
