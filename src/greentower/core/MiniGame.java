package greentower.core;

import greentower.IO.Input;
import greentower.IO.Output;

/**
 * This class represents Mini Game' basement
 *
 * @author Axelle
 *
 */
public abstract class MiniGame extends Stage
{
	/**
	 * Mini Game's contructor
	 * @param dialog
	 * @param stageIndex 
	 */
	protected MiniGame(Dialog dialog, int stageIndex)
	{
		this.index = stageIndex;
		this.dialog = dialog;
	}

	/**
	 * Mini Game's constructor for Pendu
	 * @param outTool
	 * @param inTool
	 * @param dialog
	 * @param stageIndex 
	 */
	protected MiniGame(Output outTool, Input inTool, Dialog dialog, int stageIndex)
	{
		this.index = stageIndex;
		this.dialog = dialog;
		this.inputTool = inTool;
		this.outputTool = outTool;
	}
	
	/**
	 * Allows to play game
	 * @return
	 * 			Index of next stage
	 */
	public int playStage(){
		return 0; //For example

	}
}
