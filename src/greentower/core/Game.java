package greentower.core;

import greentower.IO.Input;
import greentower.IO.InputConsole;
import greentower.IO.Output;
import greentower.IO.OutputConsole;
import greentower.IO.OutputGraphicChoice;
import greentower.minigames.lessormore.OutputGraphicLessOrMore;
import greentower.minigames.tictactoe.OutputGraphicTicTacToe;

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
			int indexOfCurrentStages = 1;
			while(this.currentStage.getFinalStage() == false)
			{
				
				if(this.isGraphical)
					this.display = updateDisplayMode(indexOfCurrentStages);
				else
					this.display = updateDisplayMode(-1);
				
				int result = this.currentStage.playStage(this.display, this.input);
				this.currentStage = ListOfStages.getNextStages(ListOfStages.getStageIndex(this.currentStage), result);
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
	 * Update the current display mode, parameter -1 return a OutputConsole
	 * @param indexOfCurrentStages
	 * @return return
	 */
	private static Output updateDisplayMode(int indexOfCurrentStages)
	{
		switch (indexOfCurrentStages)
		{
		case -1:
			return new OutputConsole();
		case 3 :
			return new OutputGraphicLessOrMore();
		case 4:
			return new OutputGraphicTicTacToe();
		case 7:
			return new OutputGraphicLessOrMore();
			// TODO add implementation of RushHour
		case 13:
			return new OutputGraphicLessOrMore();
			// TODO add implementation of Othello
		case 22:
			return new OutputGraphicLessOrMore();
			// TODO add implementation of MasterMind
		default:
			return new OutputGraphicChoice();
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
