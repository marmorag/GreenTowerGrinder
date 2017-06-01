package greentower.minigames.lessormore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	 * Reader for input
	 */
	private BufferedReader br;

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
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * return if player win or not
	 *
	 * @return {boolean} true if the game is won and false if not
	 * @throws IOException 
	 */
	public int playStage(Output display) throws IOException
	{
		display.showStageIntroduction(ListOfStages.getStageIndex(this));
		display.showDialog(this.dialog);
		display.showGame();
		boolean result;

		display.showText(String.valueOf(this.base));
		String userChoice;
		display.showPrompt(); userChoice = this.br.readLine();
		userChoice = userChoice.toUpperCase();


		if(userChoice.equals("MORE")){
			if(this.randomcard<this.base)
				result = MiniGame.RESULT_LOOSE;
			else
				result = MiniGame.RESULT_VICTORY;
		}
		else if(userChoice.equals("LESS"))
		{
			if(this.randomcard<this.base)
				result =  MiniGame.RESULT_VICTORY;
			else
				result = MiniGame.RESULT_LOOSE;
		}
		else
			throw new IOException();

		if(result)
		{
			display.showText("BRAVO!");
			display.showStageEnd(ListOfStages.getStageIndex(this));
			return MiniGame.RESULT_VICTORY;
		}
		else
		{
			display.showText("Dommage :(");
			display.showStageEnd(ListOfStages.getStageIndex(this));
			return MiniGame.RESULT_LOOSE;
		}

	}
}


		display.showText("RULES");
		display.showText("Tu vas devoir devoir deviné si le prochain nombre entre 1 et 10 sera plus grand ou plus petit que celui affiché");
		display.showText("MORE: plus grand");
		display.showText("LESS: plus petit");
		int result;
		display.showMiniGameResult(result);
		display.showStageEnd(ListOfStages.getStageIndex(this));
		
		return result;
		if(result)
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
