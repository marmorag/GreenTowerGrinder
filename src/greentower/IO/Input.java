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
