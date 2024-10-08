package com.rtaylor02.domain;

/**
 * @author Rodney Taylor (u228616)
 */
public class Wordz {
    
    private final GameRepository gameRepository;
    
    public Wordz(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
    
    public void newGame(Player player) {
        var game = new Game(player, "ARISE", 0);
        gameRepository.create(game);
    }
}
