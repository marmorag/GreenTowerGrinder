package greentower.stage;

import greentower.IO.Input;
import greentower.IO.Output;
import greentower.stage.choice.Dialog;

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
	protected Input inputTool;

	/**
	 * Interface used to display anything needed
	 */
	protected Output outputTool;

	/**
	 * Index of Stage in ListOfStages
	 */
	protected int index;


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
	
	/**
	 * @return the stageIsFinal
	 */
	public boolean isStageIsFinal() 
	{
		return this.stageIsFinal;
	}

	/**
	 * @return the dialog
	 */
	public Dialog getDialog() 
	{
		return this.dialog;
	}

	/**
	 * @return the index
	 */
	public int getIndex() 
	{
		return this.index;
	}

	// setNextStages (Stage[] nextStages);

	// public Stage[]	 nextStages;
}
