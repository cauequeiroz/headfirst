class GuessGame {
	Player ct;
	Player terror;

	void start() {
		// Create players
		ct = new Player();
		ct.name = "Caue";

		terror = new Player();
		terror.name = "Hugo";

		// Thinking in a number
		int computerNumber = (int) (Math.random() * 10);
		System.out.println("[Server] Thinking in a number (" + computerNumber + ")");

		boolean ctIsRight;
		boolean terrorIsRight;

		while(true) {
			ct.guess();
			terror.guess();

			ctIsRight = ct.number == computerNumber;
			terrorIsRight = terror.number == computerNumber;

			if ( ctIsRight || terrorIsRight ) {
				System.out.println("Ct is right? " + ctIsRight);
				System.out.println("Terror is right? " + terrorIsRight);
				break;
			} else {
				System.out.println("Nobody guess it right :(");
			}
		}
	}
}