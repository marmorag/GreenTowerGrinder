package greentower.core;

/**
 * Player of the game The Green Tower Grinder
 * 
 * @author Florent
 *
 */
public class Player
{
	/**
	 * Player's name
	 */
	private final String name;
	
	/**
	 * Enables to create a player with given name
	 * @param initialName 
	 * 			Player's name
	 */
	public Player(String initialName)
	{
		this.name = initialName;
	}

	/**
	 * Get the player's name
	 * @return
	 * 			Player's name
	 */
	public String getName() 
	{
		return this.name;
	}	
}
