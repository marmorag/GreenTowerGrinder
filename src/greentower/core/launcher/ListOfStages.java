package greentower.core.launcher;

import greentower.core.Answers;
import greentower.core.Choice;
import greentower.core.Dialog;
import greentower.core.Stage;

/**
 * @author viognef
 *
 */
public class ListOfStages
{
	/**
	 * Table of all stages
	 * @return all stage
	 */
	public static final Stage[] stages = new Stage[]
	{
		new Choice(Dialog.DIALOG_STAGE1, Answers.ANSWERS_STAGE1),
		new Choice(Dialog.DIALOG_STAGE2, Answers.ANSWERS_STAGE2),
	};

	/**
	 * Get the next stage
	 * @return table of the next two stages
	 */
	public static final int[][] nextStages = new int[][]
	{
		/* STAGE_1 */ {0, 0},
		/* STAGE_2 */ {0, 0},
		/* STAGE_3 */ {0, 0},
		/* STAGE_4 */ {0, 0},
		/* STAGE_5 */ {0, 0},

		/* STAGE_6 */ {0, 0},
		/* STAGE_7 */ {0, 0},
		/* STAGE_8 */ {0, 0},
		/* STAGE_9 */ {0, 0},
		/* STAGE_10 */ {0, 0},

		/* STAGE_11 */ {0, 0},
		/* STAGE_12 */ {0, 0},
		/* STAGE_13 */ {0, 0},
		/* STAGE_14 */ {0, 0},
		/* STAGE_15 */ {0, 0},

		/* STAGE_16 */ {0, 0},
		/* STAGE_17 */ {0, 0},
		/* STAGE_18 */ {0, 0},
		/* STAGE_19 */ {0, 0},
		/* STAGE_20 */ {0, 0},

		/* STAGE_21 */ {0, 0},
		/* STAGE_22 */ {0, 0},
		/* STAGE_23 */ {0, 0}
	};
}
