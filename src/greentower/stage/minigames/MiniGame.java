package greentower.stage.minigames;

import greentower.IO.Input;
import greentower.IO.Output;
import greentower.stage.Stage;

/**
 * This class represents Mini Game' basement
 *
 * @author Axelle
 *
 */
public abstract class MiniGame extends Stage
{
	/**
	 * Represents the int returns by a mini-game when user win
	 */
	public static final int RESULT_VICTORY = 0;
	
	/**
	 * Represents the int returns by a mini-game when user loses
	 */
	public static final int RESULT_LOOSE = 1;
	
	/**
	 * Mini Game's contructor
	 * @param dialog
	 * @param stageIndex 
	 */
	protected MiniGame(String dialog, int stageIndex)
	{
		this.index = stageIndex;
		this.dialog = dialog;
		this.stageIsFinal = false;
	}
	
	/**
	 * Mini Game's contructor
	 * @param dialog
	 * @param stageIndex 
	 * @param initialStageIsFinal 
	 */
	protected MiniGame(String dialog, int stageIndex, boolean initialStageIsFinal)
	{
		this.index = stageIndex;
		this.dialog = dialog;
		this.stageIsFinal = initialStageIsFinal;
	}
	
	
	/**
	 * Allows to play game
	 * @return
	 * 			Index of next stage
	 * @throws Exception 
	 */
	public int playStage(Output display, Input input) throws Exception{
		return 0; //For example

	}
	
	/**
	 * Initialize the mini-game
	 */
	public abstract void init();
}
