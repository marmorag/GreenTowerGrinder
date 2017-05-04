package greentower.core;

import greentower.core.Dialog;
import greentower.core.Stage;

/**
 * This class represents a choice
 * @author Florent
 *
 */
public class Choice implements Stage
{

	/**
	 * Dialog before the choice
	 */
	private final Dialog dialog;

	/**
	 * Answers to the dialog
	 */
	private final String[] answers; // Ca sera un dictionnaire à la fin

	/**
	 * Index of the answer of the player
	 */
	private int indexPlayerAnswer;

	/**
	 * Stage to go according to the answer
	 */
	private final Stage[] answerToStage;

	/**
	 * Choice's constructor with given dialog, choices and next stages
	 * @param initialDialog
	 * 			Dialog of the choice
	 * @param initialAnswers
	 * @param initialAnswerToStage
	 */
	public Choice(Dialog initialDialog, String[] initialAnswers, Stage[] initialAnswerToStage)
	{
		this.dialog = initialDialog;
		this.answers = initialAnswers;
		this.answerToStage = initialAnswerToStage;
		this.indexPlayerAnswer = -1;
	}

	@Override
	public String toString()
	{
		String result = "Choice [Dialog = " + this.dialog.toString() + ", Answers = ";
		for(int index = 0; index < 4; index++)
			result += this.answers[index] + "\n";
		return result += "]";
	}

	/**
	 * Get the next stage depending on the answer
	 * @return
	 */
	public Stage getNextStage()
	{
		return this.answerToStage[this.indexPlayerAnswer];
	}

	@Override
	public void playStage()
	{

	}

	/**
	 * @return the indexPlayerAnswer
	 */
	public int getIndexPlayerAnswer()
	{
		return this.indexPlayerAnswer;
	}

	/**
	 * @param indexPlayerAnswer the indexPlayerAnswer to set
	 */
	public void setIndexPlayerAnswer(int indexPlayerAnswer)
	{
		this.indexPlayerAnswer = indexPlayerAnswer;
	}

}

