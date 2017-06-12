package greentower.stage.minigames.suite;

import java.io.IOException;
import java.util.Random;

import greentower.IO.Input;
import greentower.IO.InputConsole;
import greentower.IO.Output;
import greentower.IO.OutputConsole;
import greentower.core.scenario.Scenario;
import greentower.stage.choice.Dialog;
import greentower.stage.minigames.MiniGame;
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
		this.op1 = r.nextInt(6);
		this.op2 = r.nextInt(6);
		this.nb1 = r.nextInt(6);
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
		//display.showStageIntroduction(Scenario.getStageIndex(this));
		//display.showDialog(this.dialog);
		display.Suite(this.nb1, this.nb2, this.nb3, this.nb4);
		
		int result;
		int in = input.inputInt();
		if(in == this.nb5)
			result = MiniGame.RESULT_VICTORY;
		else
			result = MiniGame.RESULT_LOOSE;
		
		display.showMiniGameResult(result);
		display.showStageEnd(Scenario.getStageIndex(this));
		return result;
	}

	@Override
	public void init() 
	{
		Random r = new Random();
		this.op1 = r.nextInt(6);
		this.op2 = r.nextInt(6);
		this.nb1 = r.nextInt(6);
		this.nb2 = this.nb1 * this.op1 + this.op2;
		this.nb3 = this.nb2 * this.op1 + this.op2;
		this.nb4 = this.nb3 * this.op1 + this.op2;
		this.nb5 = this.nb4 * this.op1 + this.op2;
	}
	
}

