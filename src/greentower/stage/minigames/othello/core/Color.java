package greentower.stage.minigames.othello.core;

/**
 * This enumeration lists both colors of othello: black and white.
 * There is also a color for empty cases.
 *
 * @author florent.viogne
 *
 */
public enum Color
{
	/**
	 * The black color which is represented with character 'B' in the board
	 */
	BLACK("B", "Black"),

	/**
	 * The white color which is represented with character 'W' in the board
	 */
	WHITE("W", "White"),

	/**
	 * The "empty" color which is represented with character ' ' in the board
	 */
	EMPTY(" ", "");

	/**
	 * Character who represents the color in the board
	 */
	private String charOfTheColor;

	/**
	 * String who represents the color in the board
	 */
	private String stringOfTheColor;

	/**
	 * Create a color and assigned it with the corresponding character
	 * @param initialCharOfTheColor
	 * 			Character corresponding to the color
	 * @param initialStringOfTheColor
	 * 			String corresponding to the color
	 */
	private Color(String initialCharOfTheColor, String initialStringOfTheColor)
	{
		this.charOfTheColor = initialCharOfTheColor;
		this.stringOfTheColor = initialStringOfTheColor;
	}

	/**
	 * Obtain the character associated to the color
	 * @return
	 * 			'B' for BLACK, 'W' for WHITE and ' ' for EMPTY
	 */
	public String toChar()
	{
		return this.charOfTheColor;
	}

	/**
	 * Obtain the character associated to the color
	 * @return
	 * 			'B' for BLACK, 'W' for WHITE and ' ' for EMPTY
	 */
	public String toString()
	{
		return this.stringOfTheColor;
	}
}
