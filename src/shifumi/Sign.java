package shifumi;

public enum Sign {
	ROCK,
	PAPER,
	SCISSORS;

	public static Sign getRandom() {
		return values()[(int) (Math.random() * values().length-1)];
	}
	
}
