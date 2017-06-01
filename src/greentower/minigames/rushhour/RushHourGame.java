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
	
	/**
	 * Way to get info from player
	 */
	private Input input;

	/**
	 * Left the game
	 */
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
		this.board = new GameBoard();
		this.display = display;
		this.input = input;
	}

	public RushHourGame(ConsolePlayer consolePlayer, int level2, GraphicDisplay graphicDisplay)
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * Game's launching
	 * While the player has not win, he can move cars
	 * At each movement, display updated grid
	 */
	public int playStage() throws Exception
	{
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
					this.display.showError("Mauvaise Direction");
			}
			catch(Exception e)
			{
				this.display.showError("mauvaise voiture");
			}
		}
		this.display.showMiniGameResult(0);
		return 0;
	}

}
