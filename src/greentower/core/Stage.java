package greentower.core;

import greentower.IO.Input;
import greentower.IO.Output;

/**
 * This interface enables to launch a stage (MiniGame or Choice, whatever)
 *
 * @author Florent
 *
 */
public abstract class Stage
{
	/**
	 * stageIsFinal is true when the the stage is the last one
	 */
	protected boolean stageIsFinal = false;

	/**
	 *  Dialog to say
	 */
	protected Dialog dialog;

	/**
	 * Interface used to input anything needed
	 */
	public Input inputTool;

	/**
	 * Interface used to display anything needed
	 */
	public Output outputTool;
	
	/**
	 * Index of Stage in ListOfStages
	 */
	public int index;
	

	/**
	 * Play the current stage (MiniGame or Choice, whatever)
	 * @param display
	 * @param input 
	 * @return
	 * 			Stage result
	 * @throws Exception 
	 */
	public abstract int playStage(Output display, Input input) throws Exception;

	/**
	 * Indicates if the stage is the last one or not
	 * @return 	true if the stage is the last one
	 * 			false if it is not the last one
	 */
	public boolean getFinalStage()
	{
		return this.stageIsFinal;
	}
}
