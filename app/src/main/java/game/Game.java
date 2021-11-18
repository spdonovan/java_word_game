package game;


public class Game {
  private static final char HIDECHAR = '_';
  private String original;
  private int attempts = 10;

  public Game(WordChooser mockedChooser) {
    this.original = mockedChooser.getRandomWordFromDictionary();
  }

  public String getWordToGuess() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < this.original.length(); i++) {
      Character currentletter = original.charAt(0);
      if (i == 0) sb.append(currentletter);
      else
      sb.append(HIDECHAR);
    }
  return sb.toString();
  }

  public int remainingAttempts() {
    return attempts;
  }

  public boolean guessletter(Character letter) {
    if (original.indexOf(letter) >= 0)
    return true;
    else
    attempts = attempts -1;
    return false;
  }





}

