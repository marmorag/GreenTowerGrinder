package greentower.core;

/**
 * This class contains all stages and the linking of stages
 * @author
 *
 */
public class Tower
{
	/**
	 * All stages
	 */
	private static Stage[] stages;

	/**
	 * Table with next two stages
	 */
	private static int[][] nextStages;

	/**
	 * Get the next stage's index with given current stage and given stage result
	 * @param currentStage
	 * 			The current stage
	 * @param stageResult
	 * 			The stage result
	 * @return
	 * 			Index of the new stage
	 */
	public static Stage getNextStage(int currentStage, int stageResult)
	{
		return Tower.stages[nextStages[currentStage][stageResult]];
	}

	/**
	 * Get the table of stages
	 * @return
	 * 			The table of stages
	 */
	public static Stage[] getStages()
	{
		return Tower.stages;
	}
	
	/**
	 * Get the stage at a given index
	 * @param index 
	 * 			Stage's index
	 * @return
	 * 			The table of stages
	 */
	public static Stage getStageAt(int index)
	{
		return Tower.stages[index];
	}

	/**
	 * Get the index in this.stages of a given stage
	 * @param currentStage
	 * @return
	 * 			Stage's index
	 */
	public static int getStageIndex(Stage currentStage) 
	{
		int result = 0;
		while(true)
		{
			if (ListOfStages.stages[result] == currentStage)
				break;
			result++;
		}
		return result;
	}
}
