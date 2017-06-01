package greentower.IO;

import greentower.minigames.rushhour.Direction;
import greentower.minigames.rushhour.GameBoard;

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
	
	public int getCar(GameBoard board);
	
	public Direction getDirection();
	
	public int getMove();
	
	
}
