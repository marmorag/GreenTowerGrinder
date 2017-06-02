package greentower.stage.minigames.shifumi;

/**
 * All shifumi sign
 */
public enum Sign {
	/**
	 *
	 */
	ROCK,
	/**
	 *
	 */
	PAPER,
	/**
	 *
	 */
	SCISSORS;

	/**
	 * Return random sign among enum
	 * @return {Sign} random sign among enum
	 */
	public static Sign getRandom()
	{
		return values()[(int) (Math.random() * values().length-1)];
	}

}
