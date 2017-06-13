package greentower.stage.minigames.shifumi;

/**
 * All shifumi sign
 * @author Axelle
 */
public enum Sign{
	/**
	 * Rock sign
	 */
	ROCK,
	/**
	 * Paper sign
	 */
	PAPER,
	/**
	 * Scissors sign
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
