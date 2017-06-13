package greentower.stage.minigames.rushhour;
/**
 * Represent a player of the game
 * @author gavinr
 */
public abstract class Player{
	/**
	 * Name of the player
	 */
	private String name;
	
	/**
	 * @param name
	 */
	protected Player(String name)
	{
		this.name = name;
	}
	
	/**
	 * @param board 
	 * @return the car entered by the player
	 */
	public abstract int getCar(GameBoard board);
	
	/**
	 * @return the direction entered by the player
	 */
	public abstract Direction getDirection();
	
	/**
	 * @return the movement entered by the player
	 */
	public abstract int getMove();

	/**
	 * @return
	 * 			The name
	 */
	public String getName() 
	{
		return this.name;
	}
}
