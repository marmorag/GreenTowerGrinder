
package greentower.minigames.lessormore;

import java.io.IOException;
import greentower.IO.Input;
import greentower.IO.Output;
import greentower.core.Dialog;
import greentower.core.ListOfStages;
import greentower.core.MiniGame;

/**
 * This class represent a Less Or More game
 * @author Rayan Barama
 */
public class LessOrMore extends MiniGame
{
	/**
	 * the first card which is randomly picked
	 */
	private int base;
	/**
	 * the new card which is randomly picked
	 */
	private int randomcard;

	/**
	 * LessOrMore's constructor
	 * @param dialog
	 * @param stageIndex 
	 */
	public LessOrMore(Dialog dialog, int stageIndex)
	{
		super(dialog, stageIndex);
		this.base = (int)(Math.random() * (10-1)) + 1;
		this.randomcard = (int)(Math.random() * (10-1)) + 1;
	}


	/**
	 * return if player win or not
	 *
	 * @return {boolean} true if the game is won and false if not
	 * @throws IOException 
	 */
	public int playStage(Output display, Input input) throws Exception
	{
		display.showStageIntroduction(ListOfStages.getStageIndex(this));
		display.showDialog(this.dialog);
		display.showText("RULES");
		display.showText("Tu vas devoir devoir deviné si le prochain nombre entre 1 et 10 sera plus grand ou plus petit que celui affiché");
		display.showText("MORE: plus grand");
		display.showText("LESS: plus petit");
		int result;
		
		this.base = (int)(Math.random() * (10-1)) + 1;
		this.randomcard = (int)(Math.random() * (10-1)) + 1;

		display.showText(String.valueOf(this.base));
		String userChoice;
		display.showText("\n>>");
		userChoice = input.inputString();

		if(userChoice.equals("MORE") || userChoice.equals("PLUS") || userChoice.equals("+")){
			if(this.randomcard<this.base)
				result = MiniGame.RESULT_LOOSE;
			else
				result = MiniGame.RESULT_VICTORY;
		}
		else if(userChoice.equals("LESS") || userChoice.equals("MOINS") || userChoice.equals("-"))
		{
			if(this.randomcard<this.base)
				result =  MiniGame.RESULT_VICTORY;
			else
				result = MiniGame.RESULT_LOOSE;
		}
		else
			throw new Exception();

		display.showMiniGameResult(result);
		display.showStageEnd(ListOfStages.getStageIndex(this));
		return result;

	}
}
