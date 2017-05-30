package greentower.core;

/**
 * This class contains all stages and the linking of stages
 * @author
 *
 */
public class Tower
{
	/**
	 *
	 */
	private Stage[] stages;

	/**
	 *
	 */
	private int[][] nextStages;

	/**
	 * Stage constructor with given Stage and given nextStages
	 * @param initialStages
	 * 			Stages to play
	 * @param initialNextStages
	 * 			Accessible stages after this stage
	 */
	private Tower(Stage[] initialStages, int[][] initialNextStages)
	{
		this.stages = initialStages;
		this.nextStages = initialNextStages;
	}

	/**
	 * Get the next stage's index with given current stage and given stage result
	 * @param currentStage
	 * 			The current stage
	 * @param stageResult
	 * 			The stage result
	 * @return
	 * 			Index of the new stage
	 */
	public int getNextStages(int currentStage, int stageResult)
	{
		return this.nextStages[currentStage][stageResult];
	}

	/**
	 * Get the table of stages
	 * @return
	 * 			The table of stages
	 */
	public Stage[] getStages()
	{
		return this.stages;
	}
}
