package com.rtaylor02.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

/**
 * @author Rodney Taylor (u228616)
 */
@ExtendWith(MockitoExtension.class)
public class NewGameTest {
    /**
     * User story:
     * As a player I want to start a new game so that I have a new word to guess
     *
     * To do list:
     * 1) Select a word at random from the available words to guess
     * 2) Store the selected word so that scores for guesses can be calculated
     * 3) Record that the player may now make an initial guess
     */
    
    @Mock
    private GameRepository gameRepository;
    
    @InjectMocks
    private Wordz wordz;
    
    /**
     * GIVEN a player
     * WHEN the player starts a new game
     * THEN the game records the player
     * AND the game resets player's attempts
     * AND the game has the correct word
     */
    @Test
    void startsNewGame() {
        var wordz = new Wordz(gameRepository);
        var player = new Player();
        
        wordz.newGame(player);
        
        var game = getGameInRepository();
        assertThat(game.getWord()).isEqualTo("ARISE");
        assertThat(game.getAttemptNumber()).isZero();
        assertThat(game.getPlayer()).isSameAs(player);
    }
    
    private Game getGameInRepository() {
        var gameArg = ArgumentCaptor.forClass(Game.class);
        verify(gameRepository).create(gameArg.capture());
        var game = gameArg.getValue();
        return game;
    }
    
    /*
     * GIVEN a word repository
     * WHEN a user starts a new game
     * THEN a new random word is selected from the repository
     */
    @Test
    public void selectsRandomWord() {
        // ARRANGE
//        String expected = value;
        
        // ACT
//        String actual = systemUnderTest.method1(args);
        
        // ASSERT
        Game game = getGameInRepository();
        assertThat(game.getWord()).isEqualTo("ABCDE");
    }
}
