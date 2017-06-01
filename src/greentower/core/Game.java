package greentower.core;

import greentower.IO.Input;
import greentower.IO.InputConsole;
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
	 * Tool used to get anything from the player
	 */
	private Input input;
	
	/**
	 * True if the game is executed in graphical mode, false else
	 */
	@SuppressWarnings("unused")
	private boolean isGraphical;

	/**
	 * Default constructor
	 * @param player who launched the game
	 * @param display
	 * @param isGraphical 
	 */
	public Game(Player player, Output display, boolean isGraphical)
	{
		this.input = new InputConsole();
		this.isGraphical = isGraphical;
		this.numberOfRounds = 0;
		this.player = player;
		this.currentStage = ListOfStages.getStageAt(1);
		this.display = display;
	}

	/**
	 * Enables player to play the game
	 */
	public void play()
	{
		try
		{
			while(this.currentStage.getFinalStage() == false)
			{	
				 try
				 { 
					 int result = this.currentStage.playStage(this.display, this.input);
					 this.currentStage = ListOfStages.getNextStages(ListOfStages.getStageIndex(this.currentStage), result);
				 } 
				 catch (Exception e)
				 {
					 //EMPTY
				 }
			}
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		while(this.currentStage.getFinalStage() == false)
//		{
//			try 
//			{
//				int result = this.currentStage.playStage(this.display);
//				this.currentStage = Tower.getNextStage(Tower.getStageIndex(this.currentStage), result);
//				//this.currentStage = Tower.getNextStage(Tower.getStageIndex(this.currentStage), this.currentStage.playStage(this.display));
//				this.numberOfRounds++;
//			} catch (IOException e) {
//				System.out.println("Problème avec l'entrée");
//				System.out.println("Veuillez recommencer");
//			} catch (Exception e)
//			{
//				e.printStackTrace();
//				System.out.println("Un problème est survenu, veuillez recommencer");
//				System.out.println("Toutes nos excuses");
//			}
//		}
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
