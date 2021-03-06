package game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class GuessLetterTrueorFalseTest {
  @Test public void testGuessLetterTrue() {
    WordChooser mockedChooser = mock(WordChooser.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
    Game game = new Game(mockedChooser);
    assertTrue(game.guessletter('V'));
  
}
@Test public void testGuessLetterFalse() {
  WordChooser mockedChooser = mock(WordChooser.class);
  when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
  Game game = new Game(mockedChooser);
  assertFalse(game.guessletter('H'));
  assertEquals(game.remainingAttempts(), 9 );
}

@Test public void testGuessLetterTrueAndDisplayLetter() {
  WordChooser mockedChooser = mock(WordChooser.class);
  when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTING");
  Game game = new Game(mockedChooser);
  assertEquals(game.guessletter('S'), true);
  assertEquals(game.getWordToGuess(), "T_S____");
}

@Test public void testGuessLetterFalseAndDisplayLetter() {
  WordChooser mockedChooser = mock(WordChooser.class);
  when(mockedChooser.getRandomWordFromDictionary()).thenReturn("TESTING");
  Game game = new Game(mockedChooser);
  assertFalse(game.guessletter('F'));
  assertEquals(game.getWordToGuess(), "T______");
  assertEquals(game.remainingAttempts(), 9 );
}
}
