package greentower.core;

import java.io.IOException;

import greentower.IO.Output;

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
	 * Way to display 
	 */
	private Output display;

	/**
	 * Default constructor
	 * @param player who launched the game
	 * @param display
	 */
	public Game(Player player, Output display)
	{
		this.numberOfRounds = 0;
		this.player = player;
		this.currentStage = ListOfStages.getStageAt(0);
		this.display = display;
	}

	/**
	 * Enables player to play the game
	 */
	public void play()
	{
		while(this.currentStage.getFinalStage() == false)
		{
			try 
			{
				int result = this.currentStage.playStage(this.display);
				this.currentStage = Tower.getNextStage(Tower.getStageIndex(this.currentStage), result);
				//this.currentStage = Tower.getNextStage(Tower.getStageIndex(this.currentStage), this.currentStage.playStage(this.display));
				this.numberOfRounds++;
			} catch (IOException e) {
				System.out.println("Problème avec l'entrée");
				System.out.println("Veuillez recommencer");
			} catch (Exception e)
			{
				e.printStackTrace();
				System.out.println("Un problème est survenu, veuillez recommencer");
				System.out.println("Toutes nos excuses");
			}
		}
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
