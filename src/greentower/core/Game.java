package greentower.core;

import greentower.tictactoe.TicTacToe;

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
	private Player player;

	/**
	 * Indicates the stage loaded
	 */
	private Stage currentStage;

	/**
	 * Default constructor
	 * @param player who lauched the game
	 */
	public Game(Player player)
	{
		this.numberOfRounds = 0;
		this.player = player;
		this.currentStage = new TicTacToe(1); // First Stage
	}

	/**
	 * Enables player to play the game
	 */
	public void play()
	{
		while(this.currentStage.getFinalStage() == false)
		{
			this.currentStage.playStage();
			this.numberOfRounds++;
		}
		//Finish game
	}

	/**
	 * Enables player to leave the current game
	 */
	public void leave()
	{
		System.exit(0);
	}

}
