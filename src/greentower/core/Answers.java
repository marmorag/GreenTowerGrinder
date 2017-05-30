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
	ANSWERS_STAGE2(new String[] {"Oui","Non"}),

	/**
	 * Stage 3's ANSWERS
	 */
	ANSWERS_STAGE3(new String[] {""}),

	/**
	 * Stage 4's ANSWERS
	 */
	ANSWERS_STAGE4(new String[] {""}), // VICTOIRE OU DEFAITE

	/**
	 * Stage 5's ANSWERS
	 */
	ANSWERS_STAGE5(new String[] {""}), // VICTOIRE OU DEFAITE

	/**
	 * Stage 6's ANSWERS
	 */
	ANSWERS_STAGE6(new String[] {"1","16","30","46"}),

	/**
	 * Stage 7's ANSWERS
	 */
	ANSWERS_STAGE7(new String[] {""}), // VICTOIRE OU DEFAITE

	/**
	 * Stage 8's ANSWERS
	 */
	ANSWERS_STAGE8(new String[] {"D'accord.."}),

	/**
	 * Stage 9's ANSWERS
	 */
	ANSWERS_STAGE9(new String[] {"J'accepte","Je refuse"}),

	/**
	 * Stage 10's ANSWERS
	 */
	ANSWERS_STAGE10(new String[] {"Continuer"}),

	/**
	 * Stage 11's ANSWERS
	 */
	ANSWERS_STAGE11(new String[] {"En roulant tous à vitesse constante","En roulant tous à droite"}),

	/**
	 * Stage 12's ANSWERS
	 */
	ANSWERS_STAGE12(new String[] {"Continuer"}),

	/**
	 * Stage 13's ANSWERS
	 */
	ANSWERS_STAGE13(new String[] {""}), // VICTOIRE OU DEFAITE

	/**
	 * Stage 14's ANSWERS
	 */
	ANSWERS_STAGE14(new String[] {""}), // VICTOIRE OU DEFAITE

	/**
	 * Stage 15's ANSWERS
	 */
	ANSWERS_STAGE15(new String[] {"Réveiller le gardien","Faire une sieste à ses côtés"}),

	/**
	 * Stage 16's ANSWERS
	 */
	ANSWERS_STAGE16(new String[] {"Un bébé","Une ombre"}),

	/**
	 * Stage 17's ANSWERS
	 */
	ANSWERS_STAGE17(new String[] {"Continuer"}),

	/**
	 * Stage 18's ANSWERS
	 */
	ANSWERS_STAGE18(new String[] {"Merci !"}),

	/**
	 * Stage 19's ANSWERS
	 */
	ANSWERS_STAGE19(new String[] {""}),

	/**
	 * Stage 20's ANSWERS
	 */
	ANSWERS_STAGE20(new String[] {"Continuer"}),

	/**
	 * Stage 21's ANSWERS
	 */
	ANSWERS_STAGE21(new String[] {"Continuer"}),

	/**
	 * Stage 22's ANSWERS
	 */
	ANSWERS_STAGE22(new String[] {"Continuer"}),

	/**
	 * Stage 23's ANSWERS
	 */
	ANSWERS_STAGE23(new String[] {""}); // VICTOIRE OU DEFAITE


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
