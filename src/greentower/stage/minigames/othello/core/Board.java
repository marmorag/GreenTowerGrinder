package greentower.stage.minigames.othello.core;

/**
 * A board of othello. 8x8 grid. Cells are all the same
 * @author florent.viogne
 */
public class Board{
	
	/**
	 * Grid's size. Value is 8.
	 */
	public static final int MAX_COORDINATE = 8;

	/**
	 * Minimum coordinate. Value is 0.
	 */
	public static final int MIN_COORDINATE = 0;

	/**
	 * @formatter:off
	 * Board's grid. 8x8 grid. Each element of the grid is a Color
	 * 		 0   1   2   3   4   5   6   7
	 *     +---+---+---+---+---+---+---+---+
	 *  0  |   |   |   |   |   |   |   |   |
	 *     +---+---+---+---+---+---+---+---+
	 *  1  |   |   |   |   |   |   |   |   |	In first hooks is the line number,
	 *     +---+---+---+---+---+---+---+---+	in second, the column number.
	 *  2  |   |   |   |   | X |   |   |   |	Example: grid[line][column]
	 *     +---+---+---+---+---+---+---+---+
	 *  3  |   |   |   |   |   |   |   |   |	To designate the case with the cross,
	 *     +---+---+---+---+---+---+---+---+	you must use grid[2][4]
	 *  4  |   |   |   |   |   |   |   |   |
	 *     +---+---+---+---+---+---+---+---+
	 *  5  |   |   |   |   |   |   |   |   |
	 *     +---+---+---+---+---+---+---+---+
	 *  6  |   |   |   |   |   |   |   |   |
	 *     +---+---+---+---+---+---+---+---+
	 *  7  |   |   |   |   |   |   |   |   |
	 *     +---+---+---+---+---+---+---+---+
	 * @formatter:on
	 */
	private Color[][] cellColors;

	/**
	 * Create a new board in initial configuration.
	 * Initial configuration: http://www.ffothello.org/images/jeu/regles/figure-1.jpg
	 */
	public Board()
	{
		this.cellColors = new Color[Board.MAX_COORDINATE][Board.MAX_COORDINATE];
		// Grid's initialization to empty grid
		for(int line = 0; line < Board.MAX_COORDINATE; line++)
			for(int column = 0; column < Board.MAX_COORDINATE; column++)
				this.cellColors[line][column] = Color.EMPTY;

		// Initial configuration
		this.cellColors[3][3] = Color.WHITE;
		this.cellColors[4][3] = Color.BLACK;
		this.cellColors[3][4] = Color.BLACK;
		this.cellColors[4][4] = Color.WHITE;
	}

	/**
	 * Returns the color of an asked case
	 * @param askedPosition
	 * 			The position we want to know the color
	 * @return
	 * 			Value (color) of the case
	 */
	public Color getCaseColor(Position askedPosition)
	{
		return this.cellColors[askedPosition.getLine()][askedPosition.getColumn()];
	}

	/**
	 * Give the number of pawn on the board with given pawn's color
	 * @param pawnColor
	 * 			The pawn's color
	 * @return
	 * 			Number of pawns of the given color
	 */
	public int numberOfPawns(Color pawnColor)
	{
		int result = 0;
		for(int line = 0; line < Board.MAX_COORDINATE; line++)
			for(int column = 0; column < Board.MAX_COORDINATE; column++)
				if(this.getCaseColor(new Position(line, column)) == pawnColor)
					result++;
		return result;
	}


	public String toString()
	{
		int line, column;
		String result = "";

		result += "   ";
		for(column = 0; column < Board.MAX_COORDINATE; column++)
			result +=  "  " + Integer.toString(column) + " ";
		result += "\n";

		for(line = 0; line < Board.MAX_COORDINATE; line++)
		{
			result += "   ";
			for(int i = 0; i < Board.MAX_COORDINATE; i++)
				result += "+---";
			result += "+\n";

			result += " " + Integer.toString(line) + " ";
			for(column = 0; column < Board.MAX_COORDINATE; column++)
			{
				result += "| " + this.cellColors[line][column].toChar() + " ";
			}
			result += "|\n";
		}

		result += "   ";
		for(int i = 0; i < Board.MAX_COORDINATE; i++)
			result += "+---";
		result += "+\n";

		return result;
	}

	/**
	 * Check if an game action is valid or not
	 * @param askedPosition
	 * 			The position to check
	 * @param pawnColor
	 * 			Pawn's color
	 * @return
	 * 			True if action s valid, false if not
	 */
	public boolean actionIsValid(Position askedPosition, Color pawnColor)
	{
		if (!positionIsInTheBoard(askedPosition)) return false;

		if (this.getNumberOfEnclavePawns(askedPosition, Direction.NORTH, pawnColor) > 0) return true;
		if (this.getNumberOfEnclavePawns(askedPosition, Direction.SOUTH, pawnColor) > 0) return true;
		if (this.getNumberOfEnclavePawns(askedPosition, Direction.EAST, pawnColor) > 0) return true;
		if (this.getNumberOfEnclavePawns(askedPosition, Direction.WEST, pawnColor) > 0) return true;
		if (this.getNumberOfEnclavePawns(askedPosition, Direction.NORTHEAST, pawnColor) > 0) return true;
		if (this.getNumberOfEnclavePawns(askedPosition, Direction.NORTHWEST, pawnColor) > 0) return true;
		if (this.getNumberOfEnclavePawns(askedPosition, Direction.SOUTHEAST, pawnColor) > 0) return true;
		if (this.getNumberOfEnclavePawns(askedPosition, Direction.SOUTHWEST, pawnColor) > 0) return true;

		return false;
	}
	
	/**
	 * Test if a given position is valid. The line must be between 0 and 7, the column too.
	 * @param askedPosition
	 * 			The position to test
	 * @return
	 * 			true if position is valid, false if not
	 */
	public static boolean positionIsInTheBoard(Position askedPosition)
	{
		if(askedPosition.getColumn() >= Board.MAX_COORDINATE) return false;
		if(askedPosition.getColumn() < Board.MIN_COORDINATE) return false;
		if(askedPosition.getLine() >= Board.MAX_COORDINATE) return false;
		if(askedPosition.getLine() < Board.MIN_COORDINATE) return false;
		return true;
	}

	/**
	 * Give an array with number of enclave pawns in each direction
	 * @param askedPosition
	 * 			Pawn's position
	 * @param pawnColor
	 * 			Pawn's color
	 * @return
	 * 			Array with number of enclave pawns in each direction
	 */
	public int[] getNumberOfEnclavePawnsInAllDirections(Position askedPosition, Color pawnColor)
	{
		int[] result = new int[8];
		for (int index = 0; index < 8; index++)
			result[index] = this.getNumberOfEnclavePawns(askedPosition, Direction.values()[index] , pawnColor);
		return result;
	}

	/**
	 * Give the number of pawns who can be enclave in given direction if we place a pawn here
	 * @param askedPosition
	 * 			Position where to place the pawn
	 * @param askedDirection
	 * 			Direction where to check
	 * @param pawnColor
	 * 			The pawn's color
	 * @return
	 * 			The number of enclave pawns if we place a pawn here
	 */
	public int getNumberOfEnclavePawns(Position askedPosition, Direction askedDirection, Color pawnColor)
	{
		int result = 0;
		Position currentPosition = askedPosition;
		if (this.getCaseColor(currentPosition) != Color.EMPTY) return 0;
		while(true)
		{
			currentPosition = currentPosition.getNeighbour(askedDirection);
			if (!positionIsInTheBoard(currentPosition)) return 0;

			if (this.getCaseColor(currentPosition) == pawnColor) return result;
			if (this.getCaseColor(currentPosition) == Color.EMPTY) return 0;
			result++;
		}
	}
	/**
	 * Enable the board to place a new pawn on the grid with given color and given position
	 * @param pawnColor
	 * 			The given pawn's color
	 * @param askedPosition
	 * 			The given pawn's position
	 */
	public void placeAPawn(Color pawnColor, Position askedPosition)
	{
		this.switchPawnColor(pawnColor, askedPosition, Direction.NORTH);
		this.switchPawnColor(pawnColor, askedPosition, Direction.NORTHWEST);
		this.switchPawnColor(pawnColor, askedPosition, Direction.NORTHEAST);
		this.switchPawnColor(pawnColor, askedPosition, Direction.SOUTH);
		this.switchPawnColor(pawnColor, askedPosition, Direction.SOUTHWEST);
		this.switchPawnColor(pawnColor, askedPosition, Direction.SOUTHEAST);
		this.switchPawnColor(pawnColor, askedPosition, Direction.EAST);
		this.switchPawnColor(pawnColor, askedPosition, Direction.WEST);

		//this.switchPawnColor(askedPosition, this.getNumberOfEnclavePawnsInAllDirections(askedPosition, pawnColor));

		this.cellColors[askedPosition.getLine()][askedPosition.getColumn()] = pawnColor;
	}

	/**
	 * Switch pawn's color when a pawn has been placed in a given direction
	 *
	 * @param pawnColor
	 * 			Pawn's color
	 * @param pawnPosition
	 * 			Placed pawn's position
	 * @param askedDirection
	 * 			Direction where to switch pawn's color
	 */
	public void switchPawnColor(Color pawnColor, Position pawnPosition, Direction askedDirection)
	{
		Position currentPosition = pawnPosition;
		if(this.getNumberOfEnclavePawns(pawnPosition, askedDirection, pawnColor) > 0)
		{
			while(true)
			{
				currentPosition = currentPosition.getNeighbour(askedDirection);
				if (!Board.positionIsInTheBoard(currentPosition)) break;
				if (this.getCaseColor(currentPosition) == Color.EMPTY) break;
				if (this.getCaseColor(currentPosition) == pawnColor) break;
				this.cellColors[currentPosition.getLine()][currentPosition.getColumn()] = pawnColor;
			}
		}
	}

	/**
	 * Switch pawn's color when a pawn has been placed in all directions
	 *
	 * @param pawnPosition
	 * 			Placed pawn's position
	 * @param enclavePawnsInAllDirection
	 * 			Number of enclave pawns in each direction
	 */
	public void switchPawnColor(Position pawnPosition, int[] enclavePawnsInAllDirection)
	{
		Position currentPosition = pawnPosition;
		for(int index = 0; index < enclavePawnsInAllDirection.length; index++)
		{
			for(int j = 0; j < enclavePawnsInAllDirection[index]; j++)
			{
				this.cellColors[currentPosition.getLine()][currentPosition.getColumn()] = this.getCaseColor(pawnPosition);
				currentPosition = currentPosition.getNeighbour(Direction.values()[index]);
			}
		}
	}
}
