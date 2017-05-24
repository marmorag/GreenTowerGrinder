package greentower.core;

import greentower.minigames.tictactoe.TicTacToe;

/**
 * This class represents Mini Game' basement
 *
 * @author Axelle
 *
 */
public abstract class MiniGame extends Stage
{
	/**
	 * Mini Game's contructor
	 */
	protected MiniGame()
	{
	}

	/**
	 * Allows to play game
	 */
	public Stage playStage(){
		return new TicTacToe(1); //For example
	}
}
