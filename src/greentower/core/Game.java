package greentower.core;

import greentower.IO.Input;
import greentower.IO.Output;
import greentower.IO.OutputGraphic;
import greentower.core.scenario.Scenario;
import greentower.stage.Stage;

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
	 * Indicates the stage loaded
	 */
	private Stage currentStage;

	/**
	 * Way to display
	 */
	private Output display;

	/**
	 * Name of the player
	 */
	private String player;
	
	/**
	 * Tool used to get anything from the player
	 */
	private Input input;
	
	private Scenario scenario; 

	//private Scenario scenario;

	/**
	 * Default constructor
	 * @param player who launched the game
	 * @param initialScenario 
	 * @param display
	 * @param input 
	 */
	public Game(Scenario initialScenario, Output display, Input input)
	{
		if(display.getClass() == OutputGraphic.class)
			this.player = ((OutputGraphic)display).mainWindow.getName();
		else
			this.player = input.inputString();
		this.input = input;
		this.numberOfRounds = 0;
		this.display = display;
		this.scenario = initialScenario;
		this.currentStage = this.scenario.getStageAt(0);
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
					 this.currentStage = this.scenario.getNextStages(this.scenario.getStageIndex(this.currentStage), result);
				 }
				 catch (Exception e)
				 {
					 //EMPTY
				 }
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
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
