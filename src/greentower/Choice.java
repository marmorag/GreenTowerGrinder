package greentower;

/**
 * This class represents a choice
 * @author Florent
 *
 */
public class Choice 
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
	}

	@Override
	public String toString() 
	{
		String result = "Choice [Dialog = " + this.dialog.toString() + ", Answers = ";
		for(int index = 0; index < 4; index++)
			result += this.answers[index] + "\n";
		result += "]";
}
