package greentower.core;

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
	private boolean stageIsFinal = false;

	/**
	 * Play the current stage (MiniGame or Choice, whatever)
	 */
	public abstract Stage playStage();

	/**
	 * Indicates if the stage is the last one or not
	 * @return 	true if the stage is the last one
	 * 			false if it is not the last one
	 */
	public boolean getFinalStage(){
		return this.stageIsFinal;
	}
}
