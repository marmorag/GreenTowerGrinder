package greentower.core.scenario;

import greentower.stage.Stage;
import greentower.stage.choice.Answers;
import greentower.stage.choice.Choice;
import greentower.stage.choice.Dialog;
import greentower.stage.minigames.lessormore.LessOrMore;
import greentower.stage.minigames.mastermind.MasterMind;
import greentower.stage.minigames.othello.core.OthelloGame;
import greentower.stage.minigames.rushhour.RushHourGame;
import greentower.stage.minigames.shifumi.Shifumi;
import greentower.stage.minigames.tictactoe.TicTacToe;

/**
 * @author viognef
 *
 */
public class Scenario
{
	/**
	 * Table of all stages
	 */
	public static final Stage[] stages = new Stage[]
	{
			//TODO ADD gamblingmachine, headsortail, pendu and suite
		/* STAGE_1 */ new Choice(Dialog.DIALOG_STAGE1, Answers.ANSWERS_STAGE1, 0),
		/* STAGE_2 */ new Choice(Dialog.DIALOG_STAGE2, Answers.ANSWERS_STAGE2, 1),
		/* STAGE_3 */ new Choice(Dialog.DIALOG_STAGE3, Answers.ANSWERS_STAGE3, 2),
		/* STAGE_4 */ new LessOrMore(Dialog.DIALOG_STAGE4, 3),
		/* STAGE_5 */ new TicTacToe(Dialog.DIALOG_STAGE5, 4),
		
		/* STAGE_6 */ new Choice(Dialog.DIALOG_STAGE6, Answers.ANSWERS_STAGE6, 5),
		/* STAGE_7 */ new RushHourGame(Dialog.DIALOG_STAGE7, 6),
		/* STAGE_8 */ new Choice(Dialog.DIALOG_STAGE8, Answers.ANSWERS_STAGE8, 7),
		/* STAGE_9 */ new Choice(Dialog.DIALOG_STAGE9, Answers.ANSWERS_STAGE9, 8),
		/* STAGE_10 */ new Choice(Dialog.DIALOG_STAGE10, Answers.ANSWERS_STAGE10, 9),

		/* STAGE_11 */ new Choice(Dialog.DIALOG_STAGE11, Answers.ANSWERS_STAGE11, 10),
		/* STAGE_12 */ new Choice(Dialog.DIALOG_STAGE12, Answers.ANSWERS_STAGE12, 11),
		/* STAGE_13 */ new OthelloGame(Dialog.DIALOG_STAGE13, 12),
		/* STAGE_14 */ new Shifumi(Dialog.DIALOG_STAGE14, 13),
		/* STAGE_15 */ new Choice(Dialog.DIALOG_STAGE15, Answers.ANSWERS_STAGE15, 14),
		
		/* STAGE_16 */ new Choice(Dialog.DIALOG_STAGE16, Answers.ANSWERS_STAGE16, 15),
		/* STAGE_17 */ new Choice(Dialog.DIALOG_STAGE17, Answers.ANSWERS_STAGE17, 16),
		/* STAGE_18 */ new Choice(Dialog.DIALOG_STAGE18, Answers.ANSWERS_STAGE18, 17),
		/* STAGE_19 */ new Choice(Dialog.DIALOG_STAGE19, Answers.ANSWERS_STAGE19, 18),
		/* STAGE_20 */ new Choice(Dialog.DIALOG_STAGE20, Answers.ANSWERS_STAGE20, 19),
		
		/* STAGE_21 */ new Choice(Dialog.DIALOG_STAGE21, Answers.ANSWERS_STAGE21, 20),
		/* STAGE_22 */ new MasterMind(Dialog.DIALOG_STAGE22, 21),
		/* STAGE_23 */ new Choice(Dialog.DIALOG_STAGE23, Answers.ANSWERS_STAGE23, 22),
		/* STAGE_24 */ new Choice(Dialog.DIALOG_STAGE24, Answers.ANSWERS_STAGE24, 23, true),
	};

	/**
	 * Get the next stage
	 */
	public static final int[][] nextStages = new int[][]
	{
		/* STAGE_1 */ {2},
		/* STAGE_2 */ {3, 2},
		/* STAGE_3 */ {4, 5},
		/* STAGE_4 */ {6, 7},
		/* STAGE_5 */ {4, 8},

		/* STAGE_6 */ {10, 10, 9, 10},
		/* STAGE_7 */ {11, 8},
		/* STAGE_8 */ {3},
		/* STAGE_9 */ {12, 13},
		/* STAGE_10 */ {13},

		/* STAGE_11 */ {13, 14},
		/* STAGE_12 */ {3},
		/* STAGE_13 */ {15, 16},
		/* STAGE_14 */ {19, 20},
		/* STAGE_25 */ {17, 18},

		/* STAGE_16 */ {21, 22},
		/* STAGE_17 */ {22},
		/* STAGE_18 */ {3},
		/* STAGE_19 */ {22},
		/* STAGE_20 */ {3},
		
		/* STAGE_21 */ {3},
		/* STAGE_22 */ {23, 22},
		/* STAGE_23 */ {24, 23},
	};

	/**
	 * Get the next stage's index with given current stage and given stage result
	 * @param currentStage
	 * 			The current stage
	 * @param stageResult
	 * 			The stage result
	 * @return
	 * 			Index of the new stage
	 */
	public static Stage getNextStages(int currentStage, int stageResult)
	{
		return Scenario.stages[nextStages[currentStage][stageResult] - 1];
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
		return Scenario.stages[index];
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
			if (Scenario.stages[result] == currentStage)
				break;
			result++;
		}
		return result;
	}
}
