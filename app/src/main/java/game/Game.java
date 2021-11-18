package game;

import java.util.ArrayList;

public class Game {
  private static final char HIDECHAR = '_';
  private String original;
  private ArrayList<Character> guessedLetters = new ArrayList<Character>();
  public int attempts = 10;

  public Game(WordChooser mockedChooser) {
    this.original = mockedChooser.getRandomWordFromDictionary();
  }

  public String getWordToGuess() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < this.original.length(); i++) {
      Character currentletter = original.charAt(i);
      if (i == 0) sb.append(currentletter);
      else
      if (guessedLetters.indexOf(currentletter) != -1)
      sb.append(currentletter);
      else
      sb.append(HIDECHAR);
    }
  return sb.toString();
  }

  public int remainingAttempts() {
    return attempts;
  }

  public boolean guessletter(Character letter) {
    if (this.original.indexOf(letter) != -1) {
    guessedLetters.add(letter);
    return true;
    } else {
    attempts--;
    return false;
    }
  }





}

