package greentower.minigames.rushhour;

import greentower.IO.Input;
import greentower.IO.Output;
import greentower.core.Dialog;
import greentower.core.MiniGame;

/**
 *
 * Represent a game of RushHour
 *
 * @author gavinr
 *
 */
@SuppressWarnings("unused")
public class RushHourGame extends MiniGame
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
	private Output display;

	public static void exit(){
		System.exit(0);
	}

	/**
	 * create a game with a default player and a game board level configuration
	 * @param display 
	 * @param input 
	 * @param dialog 
	 * @param indexOfStage 
	 */
	//public RushHourGame(Player player, int level, Display display)
	public RushHourGame(Output display, Input input, Dialog dialog, int indexOfStage)
	{
		super(display, input, dialog, indexOfStage);
		this.state = READY;
		this.board = new GameBoard(1);
		this.display = display;
		this.level = 1;
	}

	/**
	 * Game's launching
	 * While the player has not win, he can move cars
	 * At each movement, display updated grid
	 */
	public int playStage(Output display, Input input) throws Exception
	{
		this.state = LAUNCHED;
		while(this.board.isFinish() == false)
		{
			// implementer un timer pour la defaite
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
		return 0;
	}

}
