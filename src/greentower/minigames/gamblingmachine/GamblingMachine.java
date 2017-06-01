package greentower.minigames.gamblingmachine;

import greentower.IO.Output;
import greentower.core.Dialog;
import greentower.core.ListOfStages;
import greentower.core.MiniGame;

/**
 * @author Florent & Rémi
 */
public class GamblingMachine extends MiniGame{

	/**
	 * GamblingMachine's constructor
	 * @param dialog
	 * @param stageIndex 
	 *
	 */
	public GamblingMachine(Dialog dialog, int stageIndex)
	{
		super(dialog, stageIndex);
	}

	/**
	 * Generate 3 random number between 0 and 2
	 * The player win if all 3 numbers and equals
	 * @return true if player wins false if not
	 */
	public int playStage(Output display)
	{
		display.showStageIntroduction(ListOfStages.getStageIndex(this));
		//GRAPHIC display.showGame();
		display.showDialog(this.dialog);
		display.gambling();
		boolean result;
		int[] grid = new int[3];
		grid[0] = (int)(Math.random() * (3-0)) + 0;
		grid[1] = (int)(Math.random() * (3-0)) + 0;
		grid[2] = (int)(Math.random() * (3-0)) + 0;

		if(grid[0] == grid[1] && grid[1] == grid[2])
		{
			display.showText(grid[0]+"|"+grid[1]+"|"+grid[2]);
			result = true;
		}
		else
		{
			display.showText(grid[0]+"|"+grid[1]+"|"+grid[2]);
			result = false;
		}

		if(result)
		{
			display.win();
			display.showStageEnd(ListOfStages.getStageIndex(this));
			return MiniGame.RESULT_VICTORY;
		}
		else
		{
			display.loose();
			display.showStageEnd(ListOfStages.getStageIndex(this));
			return MiniGame.RESULT_LOOSE;
		}
	}
}
