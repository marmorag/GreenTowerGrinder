package greentower.stage.minigames.othello.core;

import greentower.stage.minigames.othello.core.exceptions.InvalidStringToPositionException;

/**
 * This class represents a position in a board with cases designated by line and column.
 * @author viognef
 */
public class Position{
	/**
	 *	All valid coordonates for line and column
	 */
	public static final char[] VALID_COORDONATES = new char[] {'0', '1', '2', '3', '4', '5', '6', '7'};
	/**
	 * The position's line
	 */
	private final int line;

	/**
	 * The position's column
	 */
	private final int column;

	/**
	 * Create a new position with given line and column
	 * @param initialLine
	 * 			The position's line
	 * @param initialColumn
	 * 			The position's column
	 */
	public Position(int initialLine, int initialColumn)
	{
		this.line = initialLine;
		this.column = initialColumn;
	}

	public String toString()
	{
		return "(" + this.line + "," + this.column + ")";
	}

	/**
	 * Get the position's line
	 * @return
	 * 			The position's line
	 */
	public int getLine()
	{
		return this.line;
	}

	/**
	 * Get the position's column
	 * @return
	 * 			The position's column
	 */
	public int getColumn()
	{
		return this.column;
	}

	@Override
	public int hashCode()
	{
		return this.line * this.column + this.line;
	}

	@Override
	public boolean equals(Object anotherObject)
	{
		if(anotherObject == this) return false;
		if(!(anotherObject instanceof Position)) return false;
		Position anotherPosition = (Position) anotherObject;
		if(this.line == anotherPosition.line)
			if(this.column == anotherPosition.column)
				return true;
		return false;
	}

	/**
	 * Enable position to get his neighbour with given direction (up, right, down, left)
	 * @param direction
	 * 			The direction where search the neighbour
	 * @return
	 * 			The neighbour's position
	 */
	public Position getNeighbour(Direction direction)
	{
		return new Position(this.line + direction.getLineDelta(), this.column + direction.getColumnDelta());
	}

	/**
	 * Transform a string to a Position (ex: "3-6" --> Position(3, 6))
	 * Format: "line-column" line and column are only one character
	 * @param s
	 * 			String with position
	 * @return
	 *			Position corresponding to s
	 * @throws InvalidStringToPositionException
	 * 			InvalidStringToPositionException
	 */
	public static Position parsePosition(String s) throws InvalidStringToPositionException
	{
		if (s.length() != 3) throw new InvalidStringToPositionException();

		if (!Position.isAValidCoordonate(s.charAt(0))) throw new InvalidStringToPositionException();
		if (!Position.isAValidCoordonate(s.charAt(2))) throw new InvalidStringToPositionException();
		if (s.charAt(1) != '-') throw new InvalidStringToPositionException();

		return new Position(Character.getNumericValue(s.charAt(0)), Character.getNumericValue(s.charAt(2)));
	}

	/**
	 * Check if a given character is in VALID_COORDONATES {'0', '1', '2', '3', '4', '5', '6', '7'}
	 * @param initialCharacter
	 * 			The character to check
	 * @return
	 * 			TRUE if initialCharacter in VALID_COORDONATES, FALSE if not
	 */
	public static boolean isAValidCoordonate(char initialCharacter)
	{
		for (int chiffre : Position.VALID_COORDONATES)
			if (initialCharacter == chiffre)
				return true;
		return false;
	}
}
