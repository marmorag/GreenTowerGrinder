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
		userChoice = this.br.readLine();
		userChoice = userChoice.toUpperCase();


		if(userChoice.equals("MORE")){
			if(this.randomcard<this.base)
				result = false;
			else
				result = true;
		}
		else if(userChoice.equals("LESS")){
			if(this.randomcard<this.base)
				result = true;
			else
				result = false;
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
