package game;

public class Game {
  private static final char HIDECHAR = '_';
  private String original;

  public Game(String original) {
    this.original = original;
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

}

