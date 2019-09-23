import java.util.ArrayList;

class DotComGame {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numberOfGuesses = 0;

	public static void main(String[] args) {
		DotComGame game = new DotComGame();

		game.setUpGame();
		game.startPlaying();
	}

	private void setUpGame() {
		DotCom facebook = new DotCom();
		facebook.setName("facebook.com");

		DotCom twitter = new DotCom();
		twitter.setName("twitter.com");

		DotCom instagram = new DotCom();
		instagram.setName("instagram.com");

		dotComsList.add(facebook);
		dotComsList.add(twitter);
		dotComsList.add(instagram);

		for (DotCom dotCom : dotComsList) {
			ArrayList<String> locations = helper.placeDotCom(3);
			dotCom.setLocationCells(locations);
		}
	}

	private void startPlaying() {
		while(!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}

		finishGame();
	}

	private void checkUserGuess(String userGuess) {
		numberOfGuesses++;

		String result = "miss";

		for (DotCom dotCom : dotComsList) {
			result = dotCom.checkYourself(userGuess);

			if (result.equals("hit")) {
				break;
			}

			if (result.equals("kill")) {
				dotComsList.remove(dotCom);
				break;
			}
		}

		System.out.println(result);
	}

	private void finishGame() {
		System.out.println("Game over!");

		if (numberOfGuesses < 20) {
			System.out.println("Congratulations, you took only " + numberOfGuesses + "!.");
		} else {
			System.out.println(numberOfGuesses + "? Are you kdding me?");
		}
	}
}
