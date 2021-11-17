package game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class GetsWordToGuessWithRandomTest {
  @Test public void testGetsWordToGuess() {
    WordChooser mockedChooser = mock(WordChooser.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
    Game game = new Game(mockedChooser);
    assertEquals(game.getWordToGuess(), "D________");
  }
}
