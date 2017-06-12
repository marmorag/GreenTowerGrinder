package greentower.stage.choice;import greentower.IO.Input;import greentower.IO.Output;import greentower.stage.Stage;/** *  * This class represents a choice *  * @author Florent */public class Choice extends Stage{	/**	 * Answers to the dialog	 */	private final String answers;	/**	 * Index of the answer of the player	 */	private int indexPlayerAnswer;		/**	 * Choice's constructor with given dialog, choices and next stages	 * @param initialDialog	 *            Dialog of the choice	 * @param initialAnswers	 * @param stageIndex	 * 	 */	public Choice(String initialDialog, String initialAnswers, int stageIndex)	{		this.index = stageIndex;		this.dialog = initialDialog;		this.answers = initialAnswers;		this.indexPlayerAnswer = -1;		this.stageIsFinal = false;	}	/**	 * Choice's constructor with given dialog, choices and next stages	 * @param initialDialog	 *            Dialog of the choice	 * @param initialAnswers	 * @param stageIndex	 * @param initialStageIsFinal	 */	public Choice(String initialDialog, String initialAnswers, int stageIndex, boolean initialStageIsFinal)	{		this.index = stageIndex;		this.dialog = initialDialog;		this.answers = initialAnswers;		this.indexPlayerAnswer = -1;		this.stageIsFinal = initialStageIsFinal;				System.out.println("answer :"+this.answers);		System.out.println("dialog :"+this.dialog);	}	@Override	public String toString()	{		return "Choice [\n" + this.dialog.toString() + ", Answers = "+this.answers+"]";	}	@Override	public int playStage(Output display, Input input)	{		display.showStageIntroduction(this.index);		display.showDialog(this.dialog);		display.showAnswers(this.answers);		this.setIndexPlayerAnswer(input.inputInt());				switch (this.answers.split("\n").length)		{			case 2:			{				while(this.indexPlayerAnswer != 0 && this.indexPlayerAnswer != 1)				{					display.showError("Incorrect entry\n>");					this.setIndexPlayerAnswer(input.inputInt());				}				break;			}			case 4:			{				while(this.indexPlayerAnswer != 0 && this.indexPlayerAnswer != 1 && this.indexPlayerAnswer != 2 && this.indexPlayerAnswer != 3)				{					display.showError("Incorrect entry\n>");					this.setIndexPlayerAnswer(input.inputInt());				}				break;			}			default:			{				while(this.indexPlayerAnswer != 0)				{					display.showError("Incorrect entry\n>");					this.setIndexPlayerAnswer(input.inputInt());				}				break;			}		}				display.showStageEnd(this.index);		return this.indexPlayerAnswer;	}	/**	 * Return index of the answer of the Player	 * @return the indexPlayerAnswer	 */	public int getIndexPlayerAnswer()	{		return this.indexPlayerAnswer;	}	/**	 * Set index of the answser of the Player	 * @param indexPlayerAnswer	 *            the indexPlayerAnswer to set	 */	public void setIndexPlayerAnswer(int indexPlayerAnswer)	{		this.indexPlayerAnswer = indexPlayerAnswer;	}}