package greentower.stage.minigames.mastermind;

/**
 *Represents the color of pawns
 *
 * @author delomeza
 */
public enum Color {

	/**
	 * Red Pawns
	 */
	RED('R'),
	/**
	 * Green Pawns
	 */
	GREEN('G'),
	/**
	 * Blue Pawns
	 */
	BLUE('B'),
	/**
	 * Orange Pawns
	 */
	ORANGE('O'),
	/**
	 * Magenta Pawns
	 */
	MAGENTA('M'),
	/**
	 * Pink Pawns
	 */
	PINK('P');

/**
 * Attribute
 */
	private char id;

/**
 *Creates a color with a given id
 * @param id letter associated with the color (1st param of the enum)
 */
	private Color(char id)
	{
		this.id=id;
	}

/**
 * The method return a Random Pawn Color
 * @return Color return a random color
 */
public static Color getRandom()
	{
		return values()[(int) (Math.random() * values().length)];
	}


/**
 * Permits to link the player entries with the enum
 * @param id
 * @return the color associated to the id dialed
 */
public static Color getColor(char id)
{
	for(Color type : Color.values())
		if(type.id==id)
			return type;

	return null;
}

}
