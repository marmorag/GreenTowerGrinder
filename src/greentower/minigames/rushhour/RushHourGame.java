package greentower.minigames.rushhour;
/**
 *
 * Represent a game of RushHour
 *
 * @author gavinr
 *
 */
@SuppressWarnings("unused")
public class RushHourGame
{

	/**
	 * state of the game
	 */
	private static final int READY = 1;

	/**
	 * state of the game
	 */
	private static final int LAUNCHED = 2;

	/**
	 * game state (READY/LAUNCHED)
	 */
	private int state;

	/**
	 * The game board
	 */
	private GameBoard board;

	/**
	 * The game player
	 */
	private Player player;

	private int level;

	/**
	 * Way to display the game
	 */
	private Display display;

	public static void exit(){
		System.exit(0);
	}

	/**
	 * create a game with a default player and a game board level configuration
	 *
	 * @param namevof the player
	 * @param level of the game
	 */
	public RushHourGame(Player player, int level, Display display)
	{
		this.state = READY;
		this.player = player;
		this.board = new GameBoard(level);
		this.display = display;
		this.level = level;
	}

	/**
	 * Game's launching
	 * While the player has not win, he can move cars
	 * At each movement, display updated grid
	 */
	public void play()
	{
		this.state = LAUNCHED;
		while(this.board.isFinish() == false)
		{
			this.display.showBoard(this.board);
			int numCar = this.player.getCar(this.board);
			Direction direction = this.player.getDirection();
			int offset = this.player.getMove();
			try
			{
				if(this.board.moveCar(numCar, direction, offset) == false)
					this.display.wrongDirection();
			}
			catch(Exception e)
			{
				System.out.println("mauvaise voiture");
			}
		}
		this.display.win(this.level);
	}

}
