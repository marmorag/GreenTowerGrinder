package greentower.core;

import greentower.minigames.lessormore.LessOrMore;
import greentower.minigames.othello.core.OthelloGame;
import greentower.minigames.shifumi.Shifumi;
import greentower.minigames.tictactoe.TicTacToe;

/**
 * @author viognef
 *
 */
public class ListOfStages
{
	/**
	 * Table of all stages
	 */
	public static final Stage[] stages = new Stage[]
	{
		/* STAGE_1 */ new Choice(Dialog.DIALOG_STAGE1, Answers.ANSWERS_STAGE1),
		/* STAGE_2 */ new Choice(Dialog.DIALOG_STAGE2, Answers.ANSWERS_STAGE2),
		/* STAGE_3 */ new Choice(Dialog.DIALOG_STAGE2, Answers.ANSWERS_STAGE2),
		/* STAGE_4 */ new LessOrMore(Dialog.DIALOG_STAGE4),
		/* STAGE_5 */ new TicTacToe(Dialog.DIALOG_STAGE5),
		
		/* STAGE_6 */ new Choice(Dialog.DIALOG_STAGE6, Answers.ANSWERS_STAGE6),
		/* STAGE_7 */ //new RushHour(Dialog.DIALOG_STAGE7),
		/* STAGE_8 */ new Choice(Dialog.DIALOG_STAGE8, Answers.ANSWERS_STAGE8),
		/* STAGE_9 */ new Choice(Dialog.DIALOG_STAGE9, Answers.ANSWERS_STAGE9),
		/* STAGE_10 */ new Choice(Dialog.DIALOG_STAGE10, Answers.ANSWERS_STAGE10),

		/* STAGE_11 */ new Choice(Dialog.DIALOG_STAGE11, Answers.ANSWERS_STAGE11),
		/* STAGE_12 */ new Choice(Dialog.DIALOG_STAGE12, Answers.ANSWERS_STAGE12),
		/* STAGE_13 */ new OthelloGame(Dialog.DIALOG_STAGE13),
		/* STAGE_14 */ new Shifumi(Dialog.DIALOG_STAGE14),
		/* STAGE_15 */ new Choice(Dialog.DIALOG_STAGE15, Answers.ANSWERS_STAGE15),
		
		/* STAGE_16 */ new Choice(Dialog.DIALOG_STAGE16, Answers.ANSWERS_STAGE16),
		/* STAGE_17 */ new Choice(Dialog.DIALOG_STAGE17, Answers.ANSWERS_STAGE17),
		/* STAGE_18 */ new Choice(Dialog.DIALOG_STAGE18, Answers.ANSWERS_STAGE18),
		/* STAGE_19 */ new Choice(Dialog.DIALOG_STAGE19, Answers.ANSWERS_STAGE19),
		/* STAGE_20 */ new Choice(Dialog.DIALOG_STAGE20, Answers.ANSWERS_STAGE20),
		
		/* STAGE_21 */ new Choice(Dialog.DIALOG_STAGE21, Answers.ANSWERS_STAGE21),
		///* STAGE_22 */ new MasterMind(Dialog.DIALOG_STAGE22)
	};

	/**
	 * Get the next stage
	 */
	public static final int[][] nextStages = new int[][]
	{
		/* STAGE_1 */ {0, 0},
		/* STAGE_2 */ {0, 0},
		/* STAGE_3 */ {0, 0},
		/* STAGE_4 */ {0, 0},
		/* STAGE_5 */ {0, 0},

		/* STAGE_1 */ {2},
		/* STAGE_2 */ {3, 2},
		/* STAGE_3 */ {4, 5},
		/* STAGE_4 */ {6, 7},
		/* STAGE_5 */ {4, 8},

		/* STAGE_6 */ {10, 9},
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
		return ListOfStages.stages[nextStages[currentStage][stageResult] - 1];
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
		return ListOfStages.stages[index];
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
