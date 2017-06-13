package greentower.stage.minigames.rushhour;

import greentower.IO.Input;
import greentower.IO.Output;
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
	 * @param dialog
	 * @param indexOfStage
	 */
	public RushHourGame(String dialog, int indexOfStage)
	{
		super(dialog, indexOfStage);
		this.board = new GameBoard();
	}

	@Override
	public int playStage(Output display, Input input) throws Exception
	{
		this.inputTool = input;
		this.outputTool = display;
		display.showStageIntroduction(this.index);
		display.showDialog(this.dialog);
		Long t = System.currentTimeMillis();
		while(this.board.isFinish() == false)
		{
			if(System.currentTimeMillis()-t>120000)
			{
				display.showMiniGameResult(1);
				return 1;
			}
			display.showRushHourBoard(this.board);
			display.showText("Entrez le numéro de la voiture:\n");
			int numCar = input.getCar(this.board);
			display.showText("Entrez une direction:");
			display.showText("LEFT; RIGHT; UP; DOWN\n"); 
			Direction direction = input.getDirection();
			display.showText("Entrez le nombre de cases:\n");
			int offset = input.getMove();
			try
			{
				if(this.board.moveCar(numCar, direction, offset) == false)
					display.showError("Mauvaise Direction\n");
			}
			catch(Exception e)
			{
				display.showError("mauvaise voiture\n");
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
