package greentower.stage.minigames.rushhour;

import greentower.IO.Input;
import greentower.IO.Output;
import greentower.stage.choice.Dialog;
import greentower.stage.minigames.MiniGame;

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
	 * 
	 */
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
	
	/**
	 * @param dialog
	 * @param indexOfStage
	 */
	public RushHourGame(Dialog dialog, int indexOfStage)
	{
		super(dialog, indexOfStage);
		this.board = new GameBoard();
	}

	/**
	 * Game's launching
	 * While the player has not win, he can move cars
	 * At each movement, display updated grid
	 * @return 
	 * @throws Exception 
	 */
	public int playStage(Output display, Input input) throws Exception
	{
		while(this.board.isFinish() == false)
		{
			//TODO timer to loose
			display.showRushHourBoard(this.board);
			display.showText("Entrez le numéro de la voiture:");
			int numCar = input.getCar(this.board);
			display.showText("Entrez une direction:");
			display.showText("LEFT; RIGHT; UP; DOWN"); 
			Direction direction = input.getDirection();
			display.showText("Entrez le nombre de cases:");
			int offset = input.getMove();
			try
			{
				if(this.board.moveCar(numCar, direction, offset) == false)
					display.showError("Mauvaise Direction");
			}
			catch(Exception e)
			{
				display.showError("mauvaise voiture");
			}
		}
		display.showMiniGameResult(0);
		return 0;
	}

	@Override
	public void init() 
	{
		this.board = new GameBoard();
	}

}
