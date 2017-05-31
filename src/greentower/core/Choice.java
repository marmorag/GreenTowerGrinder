package greentower.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import greentower.IO.Output;
import greentower.core.Dialog;
import greentower.core.Stage;

/**
 * This class represents a choice
 * @author Florent
 *
 */
public class Choice extends Stage
{
	/**
	 *	Used to read data entry
	 */
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Dialog before the choice
	 */
	private final Dialog dialog;

	/**
	 * Answers to the dialog
	 */
	private final Answers answers; // Ça sera un dictionnaire à la fin

	/**
	 * Index of the answer of the player
	 */
	private int indexPlayerAnswer;


	/**
	 * Choice's constructor with given dialog, choices and next stages
	 * @param initialDialog
	 * 			Dialog of the choice
	 * @param initialAnswers
	 */
	public Choice(Dialog initialDialog, Answers initialAnswers, int stageIndex)
	{
		this.index = stageIndex;
		this.dialog = initialDialog;
		this.answers = initialAnswers;
		this.indexPlayerAnswer = -1;
		this.stageIsFinal = false;
	}

	/**
	 * Choice's constructor with given dialog, choices and next stages
	 * @param initialDialog
	 * 			Dialog of the choice
	 * @param initialAnswers
	 * @param initialStageIsFinal
	 */
	public Choice(Dialog initialDialog, Answers initialAnswers, boolean initialStageIsFinal,int stageIndex)
	{
		this.index = stageIndex;
		this.dialog = initialDialog;
		this.answers = initialAnswers;
		this.indexPlayerAnswer = -1;
		this.stageIsFinal = initialStageIsFinal;
	}

	@Override
	public String toString()
	{
		String result = "Choice [\n" + this.dialog.toString() + ", Answers = ";
		for(int index = 0; index < this.answers.getAnswers().length; index++)
			result += this.answers.getAnswerAt(index) + ',';
		return result += "]";
	}

	@Override
	public int playStage(Output display)
	{
		display.showDialog(this.dialog);
		display.showAnswers(this.answers.getAnswers());
		
		try
		{
			this.setIndexPlayerAnswer(Integer.parseInt(this.br.readLine()));
		}
		catch (NumberFormatException | IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.indexPlayerAnswer;
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

