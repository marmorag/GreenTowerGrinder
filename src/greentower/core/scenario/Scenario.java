package greentower.core.scenario;

import greentower.stage.Stage;

/**
 * @author florent.viogne
 *
 */
public class Scenario
{
	
	/**
	 * List of stages of the scenario
	 */
	private final Stage[] stages;
	
	/**
	 * The matrix of next stages
	 */
	private final int[][] nextStages;
	
	/**
	 * Array containing stages' dialog
	 */
	private final String[] dialogs;

	/**
	 * Array containing choices's answers	
	 */
	private final String[] answers;
	
	/**
	 * Create a new scenario
	 * @param initialStages
	 * 			Scenario's stages
	 * @param initialNextStages
	 * 			Matrix of next stages
	 * @param initialDialogs
	 * 			Stages' dialogs
	 * @param initialAnswers	
	 * 			Choices' answers
	 */
	public Scenario(Stage[] initialStages, int[][] initialNextStages, String[] initialDialogs, String[] initialAnswers)
	{
		this.stages = initialStages;
		this.nextStages = initialNextStages;
		this.dialogs = initialDialogs;
		this.answers = initialAnswers;
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
	public Stage getNextStages(int currentStage, int stageResult)
	{
		return this.stages[this.nextStages[currentStage][stageResult] - 1];
	}
	
	/**
	 * Get the stage at a given index
	 * @param index 
	 * 			Stage's index
	 * @return
	 * 			The table of stages
	 */
	public Stage getStageAt(int index)
	{
		return this.stages[index];
	}

	/**
	 * Get the index in this.stages of a given stage
	 * @param currentStage
	 * @return
	 * 			Stage's index
	 */
	public int getStageIndex(Stage currentStage) 
	{
		int result = 0;
		while(true)
		{
			if (this.stages[result] == currentStage)
				break;
			result++;
		}
		return result;
	}
	
	/**
	 * @return the stages
	 */
	public Stage[] getStages() 
	{
		return this.stages;
	}

	/**
	 * @return the nextStages
	 */
	public int[][] getNextStages() 
	{
		return this.nextStages;
	}

	/**
	 * @return the dialogs
	 */
	public String[] getDialogs() 
	{
		return this.dialogs;
	}

	/**
	 * @return the answers
	 */
	public String[] getAnswers() 
	{
		return this.answers;
	}

}
