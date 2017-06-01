package greentower.minigames.tictactoe;

import java.util.Random;
import greentower.IO.Input;
import greentower.IO.Output;
import greentower.core.Dialog;
import greentower.core.ListOfStages;
import greentower.core.MiniGame;

/**
 * MiniGame TicTacToe
 * @author
 */
public class TicTacToe extends MiniGame{
	/**
	 *  Constant for player
	 */
	private final static int PLAYER = 1;
	/**
	 *	Constant for game player
	 */
	private final static int GAME = 0;

	/**
	 * Grid of TicTacToe, contains cross and round
	 */
	private int[][] grid = new int [3][3];
	/**
	 * Winner of the game
	 */
	private int winner;
	
	/**
	 * 
	 */
	private Output display;

	/**
	 * Fill the grid with 0
	 * @param dialog
	 * @param stageIndex 
	 */
	public TicTacToe(Dialog dialog, int stageIndex)
	{
		super(dialog, stageIndex);
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				this.grid[i][j] = 0;
	}

	/**
	 * Player turn : he types the 2 indexes one by one
	 * @param display 
	 * @param input 
	 * @return true if he win and false if not
	 * @throws NumberFormatException 
	 */
	public boolean playerTurn(Output display, Input input) throws NumberFormatException
	{
		if(this.isFull())
		{ 	
			// Test if no one have win
			display.showText("Egalite, veuillez rejouer");
			this.resetGrid();
		}
		int p1=0,p2=0;
		
		while(true)
		{ 
			//Get index by the user
			display.showText("Entrez la ligne de la case voulue");
			display.showText("\n>>");
			p1 = input.inputInt();
			display.showText("Entrez la colonne de la case voulue");
			display.showText("\n>>");
			p2 = input.inputInt();
			if(this.grid[p1][p2] == 0)
			{
				this.grid[p1][p2] = 1;
				break;
			}
			display.showError("Cette case n'est pas vide");
		}
		// Test if player made a column or a row or a diagonal
		if(this.grid[p1][0] == 1 && this.grid[p1][1] == 1 && this.grid[p1][2] == 1)
		{
			this.winner = PLAYER;
			return true;
		}
		if(this.grid[0][p2] == 1 && this.grid[1][p2] == 1 && this.grid[2][p2] == 1)
		{
			this.winner = PLAYER;
			return true;
		}
		if(this.grid[0][0] == 1 && this.grid[1][1] == 1 && this.grid[2][2] ==1)
		{
			this.winner = PLAYER;
			return true;
		}
		if(this.grid[2][0] == 1 && this.grid[1][1] == 1 && this.grid[0][2] == 1)
		{
			this.winner = PLAYER;
			return true;
		}
		return false;
	}

	/**
	 * Bot turn, random numbers are generate to place a sign
	 * @return true if he win and false if not
	 */
	public boolean gameTurn()
	{
		if(this.isFull())
		{ 
			// Test if no one have win
			this.display.showText("Egalite, veuillez rejouer");
			this.resetGrid();
		}
		int p1 = 0,p2 = 0;
		Random r = new Random();
		while(true)
		{ 
			// Get random number between 0 and grid length
			p1 = (int) r.nextInt(3);
			p2 = (int) r.nextInt(3);
			if(this.grid[p1][p2] == 0)
			{
				this.grid[p1][p2] = 2;
				break;
			}
		}
		// Test if player made a column or a row or a diagonal
		if(this.grid[p1][0] == 2 && this.grid[p1][1] == 2 && this.grid[p1][2] == 2)
		{
			this.winner = GAME;
			return true;
		}
		if(this.grid[0][p2] == 2 && this.grid[1][p2] == 2 && this.grid[2][p2] == 2)
		{
			this.winner = GAME;
			return true;
		}
		if(this.grid[0][0] == 2 && this.grid[1][1] == 2 && this.grid[2][2] ==2)
		{
			this.winner = GAME;
			return true;
		}
		if(this.grid[2][0] == 2 && this.grid[1][1] == 2 && this.grid[0][2] == 2)
		{
			this.winner = GAME;
			return true;
		}
		return false;
	}

	/**
	 * Return game winner
	 * @return winner of the game;
	 */
	public int getWinner()
	{
		return this.winner;
	}

	@Override
	/**
	 * Return Game grid fill in with players signs
	 * @return Game grid
	 */
	public String toString()
	{
		return this.grid[0][0]+"|"+this.grid[0][1]+"|"+this.grid[0][2]+"|\n"+
				this.grid[1][0]+"|"+this.grid[1][1]+"|"+this.grid[1][2]+"|\n"+
				this.grid[2][0]+"|"+this.grid[2][1]+"|"+this.grid[2][2]+"|\n";
	}

	/**
	 * Return if grid is full or not
	 * @return true if grid is full
	 */
	public boolean isFull()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(this.grid[i][j] == 0)
				{
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Reset game grid (if have equality in precedent game)
	 */
	public void resetGrid()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				this.grid[i][j] = 0;
			}
		}
	}

	@Override
	public int playStage(Output display, Input input) throws NumberFormatException 
	{
		display.showStageIntroduction(ListOfStages.getStageIndex(this));
		display.showDialog(this.dialog);
		while (!this.isFull())
		{
			display.showText(this.toString());
			if(this.playerTurn(display, input))
				break;
			if(this.gameTurn())
				break;
		}
		
		int result;
		if(this.getWinner() == 1)
			result = MiniGame.RESULT_VICTORY;
		else 
			result = MiniGame.RESULT_LOOSE;
		
		display.showMiniGameResult(result);
		display.showStageEnd(ListOfStages.getStageIndex(this));
		return result;
	}

}
