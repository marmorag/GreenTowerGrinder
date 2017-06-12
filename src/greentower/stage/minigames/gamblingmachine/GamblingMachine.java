package greentower.stage.minigames.gamblingmachine;

import greentower.IO.Output;
import greentower.core.scenario.Scenario;
import greentower.stage.choice.Dialog;
import greentower.stage.minigames.MiniGame;


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
	 * @param display 
	 * @return true if player wins false if not
	 */
	public int playStage(Output display)
	{
		display.showStageIntroduction(Scenario.getStageIndex(this));
		display.showDialog(this.dialog);
		
		int result;
		int[] grid = new int[3];
		grid[0] = (int)(Math.random() * (3-0)) + 0;
		grid[1] = (int)(Math.random() * (3-0)) + 0;
		grid[2] = (int)(Math.random() * (3-0)) + 0;

		display.gambling(grid);
		if(grid[0] == grid[1] && grid[1] == grid[2])
			result = MiniGame.RESULT_VICTORY;
		else
			result = MiniGame.RESULT_LOOSE;

		display.showMiniGameResult(result);
		display.showStageEnd(Scenario.getStageIndex(this));
		return result;
	}

	@Override
	public void init() 
	{
		//EMPTY
	}
}
