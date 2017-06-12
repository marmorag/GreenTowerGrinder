package greentower.stage.minigames.headsOrTails;

import java.util.Random;

import greentower.IO.Input;
import greentower.IO.Output;
import greentower.IO.OutputConsole;
import greentower.core.ListOfStages;
import greentower.stage.choice.Dialog;
import greentower.stage.minigames.MiniGame;

/**
 * @author
 *
 */
public class HeadsOrTails extends MiniGame {

	/**
	 * HeadsOrTail's constructor
	 * @param dialog
	 * @param stageIndex 
	 */
	public HeadsOrTails(Dialog dialog, int stageIndex)
	{
		super(dialog, stageIndex);
	}

	/**
	 * Initialiaze a HeadsOrTails game
	 */
	@Override
	public int playStage(Output display, Input input)
	{
		display.showStageIntroduction(ListOfStages.getStageIndex(this));
		display.showDialog(this.dialog);
		
		int player=-1;
		while(player!=0 || player!=1)
		{
			display.showText("Veuillez entrer 0 pour pile et 1 pour face : ");
			player = input.inputInt();
			OutputConsole.gotN(1);
		}
		
		int random = (int) new Random().nextInt(2);
		
		int result;
		if(random == player)
			result = MiniGame.RESULT_VICTORY;
		else 
			result = MiniGame.RESULT_LOOSE;

		display.HeadsOrTails(random);
		display.showMiniGameResult(result);
		display.showStageEnd(ListOfStages.getStageIndex(this));
		return result;
	}

	@Override
	public void init() 
	{
		//EMPTY	
	}
}
