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
	private Tower tower;
	private int numberOfRounds;
	private Player player;
	private Stage currentStage;

	/**
	 * Default constructor
	 */
	public Game(String playerName)
	{
		this.tower = new Tower();
		this.numberOfRounds = 0;
		this.player = new Player(playerName);
		this.currentStage = new TicTacToe(); // First Stage
	}

	/**
	 * Enables player to play the game
	 */
	public void play()
	{
		while(currentStage.getFinalStage() == false)
		{
			currentStage.playStage();
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

	/**
	 * Enables to change the current stage
	 */
	public void changeStage()
	{
		//TODO
	}
}
