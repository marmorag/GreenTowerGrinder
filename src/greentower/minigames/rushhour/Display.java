package greentower.minigames.rushhour;

/**
 * Interface for displaying content
 *
 * @author gavinr
 */
public interface Display
{
	/**
	 * Display the gameboard
	 * @param board
	 */
	@SuppressWarnings("javadoc")
	public void showBoard(GameBoard board);

	/**
	 * Display errors if a wrong direction is entered
	 */
	public void wrongDirection();

	/**
	 * Display win message
	 */
	void win(int level);
}
