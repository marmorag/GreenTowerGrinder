package greentower.stage.choice;

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
	ANSWERS_STAGE3(new String[] {"La réponse F", "Une boule de nerf en avance"}),

	/**
	 * Stage 4's ANSWERS
	 */
	ANSWERS_STAGE4(new String[] {""}), // LESSORMORE

	/**
	 * Stage 5's ANSWERS
	 */
	ANSWERS_STAGE5(new String[] {""}), // TICTACTOE

	/**
	 * Stage 6's ANSWERS
	 */
	ANSWERS_STAGE6(new String[] {"1","16","30","46"}),

	/**
	 * Stage 7's ANSWERS
	 */
	ANSWERS_STAGE7(new String[] {""}), // RUSH HOUR

	/**
	 * Stage 8's ANSWERS
	 */
	ANSWERS_STAGE8(new String[] {"D'accord."}),

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
	ANSWERS_STAGE11(new String[] {"En roulant tous à vitesse constante", "En roulant tous à droite"}),

	/**
	 * Stage 12's ANSWERS
	 */
	ANSWERS_STAGE12(new String[] {"Continuer"}),

	/**
	 * Stage 13's ANSWERS
	 */
	ANSWERS_STAGE13(new String[] {""}), // OTHELLO

	/**
	 * Stage 14's ANSWERS
	 */
	ANSWERS_STAGE14(new String[] {""}), // SHIFUMI

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
	ANSWERS_STAGE18(new String[] {"Continuer"}),

	/**
	 * Stage 19's ANSWERS
	 */
	ANSWERS_STAGE19(new String[] {"Continuer"}),

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
	ANSWERS_STAGE23(new String[] {"Continuer"}), // WIN OR LOOSE

	/**
	 * Final stage' answers. Stage's answers never used
	 */
	ANSWERS_STAGE24(new String [] {}); 

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
		String result = "";
		for(int index = 0; index < this.answers.length; index++)
			result += index + ": " + this.answers[index] + "\n";
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
