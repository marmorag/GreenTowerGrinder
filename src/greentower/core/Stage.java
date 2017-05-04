package greentower.core;

/**
 * This interface enables to launch a stage (MiniGame or Choice, whatever)
 *
 * @author Florent
 *
 */
public abstract class Stage
{
	private boolean stageIsFinal = false;

	/**
	 * Play the current stage (MiniGame or Choice, whatever)
	 */
	public abstract Stage playStage();

	public boolean getFinalStage(){
		return this.stageIsFinal;
	}
}
