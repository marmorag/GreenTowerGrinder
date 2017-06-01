package greentower.minigames.suite;

import greentower.IO.Output;
import greentower.core.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
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
	 * 
	 */
	private BufferedReader br;
	
	/**
	 * Initialize random first number and operations
	 * Then deduce others numbers
	 * @param dialog
	 * @param stageIndex 
	 */
	public Suite(Dialog dialog, int stageIndex)
	{
		super(dialog, stageIndex);
		this.br = new BufferedReader(new InputStreamReader(System.in));
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
	public int playStage(Output display) throws NumberFormatException, IOException
	{
		display.showStageIntroduction(ListOfStages.getStageIndex(this));
		display.showGame();
		display.showDialog(this.dialog);
		display.showText(this.toString());
		if(Integer.parseInt(this.br.readLine()) == this.nb5)
		{
			display.showText("Bravo");
			display.showStageEnd(ListOfStages.getStageIndex(this));
			return 0;
		}
		else
		{
			display.showText("Dommage");
			display.showStageEnd(ListOfStages.getStageIndex(this));
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Suite [" + this.nb1 + " " + this.nb2 + " " + this.nb3 + " " + this.nb4 + " ?]";
	}


}
