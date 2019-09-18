class SimpleDotCom {
    private int[] locationCells;
    private int numberOfHits = 0;

    public void setLocationCells(int[] cells) {
      locationCells = cells;
    }

    public String checkYourself(String guess) {
      int userGuess = Integer.parseInt(guess);

      String result = "miss";

      for (int cell : locationCells) {
        if (userGuess == cell) {
          result = "hit";
          numberOfHits++;
          break;
        }
      }

      if (numberOfHits == locationCells.length) {
        result = "kill";
      }

      System.out.println(result);

      return result;
    }
}
