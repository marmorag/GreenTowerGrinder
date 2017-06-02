package greentower.IO;

import greentower.stage.minigames.rushhour.Direction;
import greentower.stage.minigames.rushhour.GameBoard;

/**
 * Interface for all entries
 * @author
 *
 */
public interface Input 
{	
	/**
	 * Value when in int's input is invalid
	 */
	public static final int INVALID_INT_INPUT = -1;
	
	/**
	 * Value when in int's input is invalid
	 */
	public static final char INVALID_CHAR_INPUT = '\0';
	
	/**
	 * Get a character by the player
	 * @return Inputed character 
	 */
	public char inputChar();

	/**
	 * Get an integer from the player
	 * @return Inputed integer
	 */
	public int inputInt();

	/**
	 * Get a String from the player
	 * @return String
	 */
	public String inputString();
	
	/**
	 * Used for the RushHour, Get  a car from the board
	 * @param board the current board
	 * @return the car number
	 */
	public int getCar(GameBoard board);
	
	/**
	 * Used for the RushHour, Get a Direction
	 * @return The direction
	 */
	public Direction getDirection();
	
	/**
	 * Used for the RushHour, get an integer to move the car
	 * @return Int number of cases the car is moved
	 */
	public int getMove();
	
	
}
