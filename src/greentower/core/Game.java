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
	private int numberOfRounds;
	private Player player;
	private Stage currentStage;

	/**
	 * Default constructor
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
		while(currentStage.getFinalStage() == false)
		{
			currentStage.playStage();
			numberOfRounds++;
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
