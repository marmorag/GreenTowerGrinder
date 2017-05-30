package greentower.core;

import greentower.IO.Output;
import greentower.minigames.tictactoe.TicTacToe;

/**
 * This class represents a game of The Green Tower Grinder
 *
 * @author Florent
 *
 */
public class Game
{
	/**
	 * Indicates the round's number
	 */
	private int numberOfRounds;

	/**
	 * Indicates who is playing
	 */
	@SuppressWarnings("unused")
	private Player player;

	/**
	 * Indicates the stage loaded
	 */
	private Stage currentStage;

	/**
	 *
	 */
	private Output display;

	/**
	 * Default constructor
	 * @param player who lauched the game
	 * @param display
	 */
	public Game(Player player, Output display)
	{
		this.numberOfRounds = 0;
		this.player = player;
		this.currentStage = new TicTacToe(Dialog.DIALOG_STAGE1); // First Stage
		this.display = display;
	}

	/**
	 * Enables player to play the game
	 */
	public void play()
	{
		while(this.currentStage.getFinalStage() == false)
		{
			this.currentStage.playStage(this.display);
			this.numberOfRounds++;
		}
		//this.currentStage = this.getNextStages(this.currentStage, this.currentStage.playStage(this.display)
		//Finish game
	}

	/**
	 * Enables player to leave the current game
	 */
	public void leave()
	{
		System.exit(0);
	}

	/**
	 * Get the number of played rounds
	 * @return
	 * 			The number of played rounds
	 */
	public int getNumberOfRounds()
	{
		return this.numberOfRounds;
	}
}
