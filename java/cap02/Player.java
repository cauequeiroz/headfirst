class Player {
	String name;
	int number;

	void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("["+name+"] Guess: " + number);
	}
}