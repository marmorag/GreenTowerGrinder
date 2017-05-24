package greentower.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import greentower.core.Dialog;
import greentower.core.Stage;

/**
 * This class represents a choice
 * @author Florent
 *
 */
public class Choice extends Stage
{

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Dialog before the choice
	 */
	private final Dialog dialog;

	/**
	 * Answers to the dialog
	 */
	private final String[] answers; // Ça sera un dictionnaire à la fin

	/**
	 * Index of the answer of the player
	 */
	private int indexPlayerAnswer;


	/**
	 * Choice's constructor with given dialog, choices and next stages
	 * @param initialDialog
	 * 			Dialog of the choice
	 * @param initialAnswers
	 * @param initialNextStages
	 */
	public Choice(Dialog initialDialog, String[] initialAnswers, Stage[] initialNextStages)
	{
		this.dialog = initialDialog;
		this.answers = initialAnswers;
		this.nextStages = initialNextStages;
		this.indexPlayerAnswer = -1;
	}

	@Override
	public String toString()
	{
		String result = "Choice [\n" + this.dialog.toString() + ", Answers = ";
		for(int index = 0; index < this.answers.length; index++)
			result += this.answers[index] + ',';
		return result += "]";
	}

	/**
	 * Get the next stage depending on the answer
	 * @return the next stage
	 */
	public Stage getNextStages()
	{
		return this.nextStages[this.indexPlayerAnswer];
	}

	@Override
	public Stage playStage()
	{
		try
		{
			this.setIndexPlayerAnswer(Integer.parseInt(this.br.readLine()));
		}
		catch (NumberFormatException | IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.nextStages[this.getIndexPlayerAnswer() - 1].playStage();
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

