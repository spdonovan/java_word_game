package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GetsInitialRemainingAttemptsTest {
  @Test public void testGetsRemainingAttempt() {
  WordChooser word = new WordChooser();
  Game game = new Game(word);
  assertEquals(game.remainingAttempts(), 10);
}
} 
