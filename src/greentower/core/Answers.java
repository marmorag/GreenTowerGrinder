package greentower.core;

/**
 * This class represents a dialog
 *
 * @author Florent
 *
 */
public enum Answers {

	/**
	 * Stage 1's ANSWERS
	 */
	ANSWERS_STAGE1(new String [] {""}),

	/**
	 * Stage 2's ANSWERS
	 */
	ANSWERS_STAGE2(new String[] {""}),

	/**
	 * Stage 3's ANSWERS
	 */
	ANSWERS_STAGE3(new String[] {""}),

	/**
	 * Stage 4's ANSWERS
	 */
	ANSWERS_STAGE4(new String[] {""}),

	/**
	 * Stage 5's ANSWERS
	 */
	ANSWERS_STAGE5(new String[] {""}),

	/**
	 * Stage 6's ANSWERS
	 */
	ANSWERS_STAGE6(new String[] {""}),

	/**
	 * Stage 7's ANSWERS
	 */
	ANSWERS_STAGE7(new String[] {""}),

	/**
	 * Stage 8's ANSWERS
	 */
	ANSWERS_STAGE8(new String[] {""}),

	/**
	 * Stage 9's ANSWERS
	 */
	ANSWERS_STAGE9(new String[] {""}),

	/**
	 * Stage 10's ANSWERS
	 */
	ANSWERS_STAGE10(new String[] {""}),

	/**
	 * Stage 11's ANSWERS
	 */
	ANSWERS_STAGE11(new String[] {""}),

	/**
	 * Stage 12's ANSWERS
	 */
	ANSWERS_STAGE12(new String[] {""}),

	/**
	 * Stage 13's ANSWERS
	 */
	ANSWERS_STAGE13(new String[] {""}),

	/**
	 * Stage 14's ANSWERS
	 */
	ANSWERS_STAGE14(new String[] {""}),

	/**
	 * Stage 15's ANSWERS
	 */
	ANSWERS_STAGE15(new String[] {""}),

	/**
	 * Stage 16's ANSWERS
	 */
	ANSWERS_STAGE16(new String[] {""}),

	/**
	 * Stage 17's ANSWERS
	 */
	ANSWERS_STAGE17(new String[] {""}),

	/**
	 * Stage 18's ANSWERS
	 */
	ANSWERS_STAGE18(new String[] {""}),

	/**
	 * Stage 19's ANSWERS
	 */
	ANSWERS_STAGE19(new String[] {""}),

	/**
	 * Stage 20's ANSWERS
	 */
	ANSWERS_STAGE20(new String[] {""}),

	/**
	 * Stage 21's ANSWERS
	 */
	ANSWERS_STAGE21(new String[] {""}),

	/**
	 * Stage 22's ANSWERS
	 */
	ANSWERS_STAGE22(new String[] {""}),

	/**
	 * Stage 23's ANSWERS
	 */
	ANSWERS_STAGE23(new String[] {""});


	/**
	 * Possible answers to make the choice
	 */
	private String[] answers;

	/**
	 * Creates a dialog
	 * @param initialDialog
	 * 			Text of the dialog
	 */
	private Answers(String[] initialDialog)
	{
		this.answers =initialDialog;
	}

	/**
	 *
	 */
	public String toString()
	{
		String result = null;
		for(int index = 0; index < this.answers.length; index++)
			result += this.answers[index] + "\n";
		return result;
	}

	/**
	 * Enable to return the answer at a given index
	 * @return
	 * 			String at the given index
	 */
	public String[] getAsnwers()
	{
		return this.answers;
	}


	/**
	 * Enable to return the answer at a given index
	 * @param index
	 * 			Answer's index
	 * @return
	 * 			String at the given index
	 */
	public String getAsnwerAt(int index)
	{
		return this.answers[index];
	}

}
