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
	ANSWERS_STAGE2(new String[] {"0: Oui","1: Non"}),

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
	ANSWERS_STAGE6(new String[] {"0: 1","1: 16","2: 30","3: 46"}),

	/**
	 * Stage 7's ANSWERS
	 */
	ANSWERS_STAGE7(new String[] {""}), // VICTOIRE OU DEFAITE

	/**
	 * Stage 8's ANSWERS
	 */
	ANSWERS_STAGE8(new String[] {"0: D'accord.."}),

	/**
	 * Stage 9's ANSWERS
	 */
	ANSWERS_STAGE9(new String[] {"0: J'accepte","1: Je refuse"}),

	/**
	 * Stage 10's ANSWERS
	 */
	ANSWERS_STAGE10(new String[] {"0: Continuer"}),

	/**
	 * Stage 11's ANSWERS
	 */
	ANSWERS_STAGE11(new String[] {"0: En roulant tous à vitesse constante", "1: En roulant tous à droite"}),

	/**
	 * Stage 12's ANSWERS
	 */
	ANSWERS_STAGE12(new String[] {"0: Continuer"}),

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
	ANSWERS_STAGE15(new String[] {"0: Réveiller le gardien","1: Faire une sieste à ses côtés"}),

	/**
	 * Stage 16's ANSWERS
	 */
	ANSWERS_STAGE16(new String[] {"0: Un bébé","1: Une ombre"}),

	/**
	 * Stage 17's ANSWERS
	 */
	ANSWERS_STAGE17(new String[] {"0: Continuer"}),

	/**
	 * Stage 18's ANSWERS
	 */
	ANSWERS_STAGE18(new String[] {"0: Merci !"}),

	/**
	 * Stage 19's ANSWERS
	 */
	ANSWERS_STAGE19(new String[] {""}),

	/**
	 * Stage 20's ANSWERS
	 */
	ANSWERS_STAGE20(new String[] {"0: Continuer"}),

	/**
	 * Stage 21's ANSWERS
	 */
	ANSWERS_STAGE21(new String[] {"0: Continuer"}),

	/**
	 * Stage 22's ANSWERS
	 */
	ANSWERS_STAGE22(new String[] {"0: Continuer"}),

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
	 * @param initialAnswers
	 * 			Answers to dialog
	 */
	private Answers(String[] initialAnswers)
	{
		this.answers = initialAnswers;
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
	public String[] getAnswers()
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
	public String getAnswerAt(int index)
	{
		return this.answers[index];
	}

}
