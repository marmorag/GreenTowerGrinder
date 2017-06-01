package greentower.minigames.suite;

import java.io.IOException;
import java.util.Random;
import greentower.IO.Input;
import greentower.IO.Output;
import greentower.core.Dialog;
import greentower.core.ListOfStages;
import greentower.core.MiniGame;
/**
 * Find the fifth number
 * @author Rémi
 *
 */
public class Suite extends MiniGame{

	/**
	 * Numbers
	 */
	@SuppressWarnings("javadoc")
	private int nb1,nb2,nb3,nb4,nb5;
	/**
	 * Operations
	 */
	@SuppressWarnings("javadoc")
	private int op1,op2;
	
	/**
	 * Initialize random first number and operations
	 * Then deduce others numbers
	 * @param dialog
	 * @param stageIndex 
	 */
	public Suite(Dialog dialog, int stageIndex)
	{
		super(dialog, stageIndex);
		Random r = new Random();
		this.op1 = r.nextInt(11);
		this.op2 = r.nextInt(11);
		this.nb1 = r.nextInt(11);
		this.nb2 = this.nb1 * this.op1 + this.op2;
		this.nb3 = this.nb2 * this.op1 + this.op2;
		this.nb4 = this.nb3 * this.op1 + this.op2;
		this.nb5 = this.nb4 * this.op1 + this.op2;
	}

	/**
	 * Display 4 first number and let player enter his result
	 * @return {boolean} if the player win or not
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public int playStage(Output display, Input input) throws NumberFormatException, IOException
	{
		display.showStageIntroduction(ListOfStages.getStageIndex(this));
		display.showDialog(this.dialog);
		display.Suite(this.nb1, this.nb2, this.nb3, this.nb4);
		display.showText("\n>>");
		if(input.inputInt() == this.nb5)
		{
			display.win();
			display.showStageEnd(ListOfStages.getStageIndex(this));
			return MiniGame.RESULT_VICTORY;
		}
		else
		{
			display.loose();
			display.showStageEnd(ListOfStages.getStageIndex(this));
			return MiniGame.RESULT_LOOSE;
		}
	}
}
