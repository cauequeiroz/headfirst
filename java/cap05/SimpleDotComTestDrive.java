class SimpleDotComTestDrive {
  public static void main(String[] args) {
    int[] locations = {1, 2, 3};

    SimpleDotCom dotCom = new SimpleDotCom();
    dotCom.setLocationCells(locations);

    // Hit test
    String userGuess = "3";
    String analysis = dotCom.checkYourself(userGuess);

    String result = "Failed";

    if (analysis.equals("hit")) {
      result = "Passed";
    }

    System.out.println("Should hit a dotCom cell - " + result);

    // Miss test
    userGuess = "4";
    analysis = dotCom.checkYourself(userGuess);
    result = "Failed";

    if (analysis.equals("miss")) {
      result = "Passed";
    }

    System.out.println("Should miss when dont hit a dotCom cell - " + result);

    // Kill test
    userGuess = "2";
    dotCom.checkYourself(userGuess);

    userGuess = "1";
    analysis = dotCom.checkYourself(userGuess);
    result = "Failed";

    if (analysis.equals("kill")) {
      result = "Passed";
    }

    System.out.println("Should kill when hit all dotCom cells - " + result);


  }
}
