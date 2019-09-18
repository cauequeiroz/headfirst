class SimpleDotComGame {
  public static void main(String[] args) {
    int numberOfGuesses = 0;
    int startingPoint = (int) (Math.random() * 5);
    int[] locations = {startingPoint, startingPoint + 1, startingPoint + 2};
    
    SimpleDotCom dotCom = new SimpleDotCom();
    dotCom.setLocationCells(locations);
   
    boolean isAlive = true;

    while(isAlive) {
      GameHelper gameHelper = new GameHelper();
      String userGuess = gameHelper.getUserInput("enter a number:");
      String analysis = dotCom.checkYourself(userGuess);

      numberOfGuesses++;

      if (analysis.equals("kill")) {
        isAlive = false;
      }
    }
    
    System.out.println("You took " + numberOfGuesses + " to kill the SimpleDotCom.");
  }
}
