package greentower.minigames.shifumi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import greentower.IO.Output;
import greentower.core.Dialog;
import greentower.core.ListOfStages;
import greentower.core.MiniGame;

/**
 *
 * @authors Gavin Rémi & Barama Rayan
 */
public class Shifumi extends MiniGame{

	/**
	 * Reader for input
	 */
	private BufferedReader br;

	/**
	 * Shifumi's constructor
	 * @param dialog
	 * @param stageIndex 
	 */
	public Shifumi(Dialog dialog, int stageIndex)
	{
		super(dialog, stageIndex);
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * Return if player win or not
	 * @return true if player win and false if not
	 * @throws IOException 
	 */
	public int playStage(Output display) throws IOException
	{
		display.showStageIntroduction(ListOfStages.getStageIndex(this));
		display.showDialog(this.dialog);

		display.showPrompt();
		String sign = this.br.readLine();

		int result;
		//transform string -> Sign
		Sign playersign = Sign.valueOf(sign);
		Sign random = Sign.getRandom();
		
		display.ShiFuMi(playersign, random);

		//Test all possibilities of shifumi
		if(playersign == Sign.PAPER)
			if(random == Sign.ROCK)
				result = MiniGame.RESULT_VICTORY;
			else
				result = MiniGame.RESULT_LOOSE;
		
		else if(playersign == Sign.ROCK)
			if(random == Sign.PAPER)
				result = MiniGame.RESULT_LOOSE;
			else
				result = MiniGame.RESULT_VICTORY;
		
		else
			if(random == Sign.ROCK)
				result = MiniGame.RESULT_LOOSE;
			else
				result = MiniGame.RESULT_VICTORY;
		
		display.showMiniGameResult(result);
		display.showStageEnd(ListOfStages.getStageIndex(this));
		return result;
	}

}
