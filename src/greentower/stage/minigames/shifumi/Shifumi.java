package greentower.stage.minigames.shifumi;

import java.io.IOException;

import greentower.IO.Input;
import greentower.IO.Output;
import greentower.stage.minigames.MiniGame;

/**
 *
 * @authors Gavin Rémi & Barama Rayan
 */
public class Shifumi extends MiniGame{

	/**
	 * Shifumi's constructor
	 * @param dialog
	 * @param stageIndex 
	 */
	public Shifumi(String dialog, int stageIndex)
	{
		super(dialog, stageIndex);
	}

	/**
	 * Return if player win or not
	 * @return true if player win and false if not
	 * @throws IOException 
	 */
	public int playStage(Output display, Input input) throws Exception
	{
		display.showStageIntroduction(this.index);
		display.showDialog(this.dialog);

		display.showPrompt(); 
		String sign = input.inputString();

		while(sign != "PAPER" || sign != "ROCK" || sign != "SCISSORS")
		{
			display.showText("Invalid entry");
			sign = input.inputString();
		}
		
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
		display.showStageEnd(this.index);
		return result;
	}

	@Override
	public void init() 
	{
		//EMPTY
	}

}
