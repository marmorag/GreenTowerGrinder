package greentower.minigames.headsOrTails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import greentower.IO.Output;
import greentower.IO.OutputConsole;
import greentower.core.Dialog;
import greentower.core.ListOfStages;
import greentower.core.MiniGame;

/**
 * @author
 *
 */
public class HeadsOrTails extends MiniGame {

	/**
	 *	Reader for input
	 */
	private BufferedReader br;

	/**
	 * HeadsOrTail's constructor
	 * @param dialog
	 * @param stageIndex 
	 */
	public HeadsOrTails(Dialog dialog, int stageIndex)
	{
		super(dialog, stageIndex);
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public int playStage(Output display) throws IOException
	{
		display.showStageIntroduction(ListOfStages.getStageIndex(this));
		display.HeadsOrTails();
		display.showDialog(this.dialog);
		
		int player=-1;
		while(player!=0 || player!=1){
			display.showText("Veuillez entrer 0 pour pile et 1 pour face : ");
			String userChoice;
			userChoice = this.br.readLine();
			player = Integer.parseInt(userChoice);
			OutputConsole.gotN(1);
		}
		if((int) new Random().nextInt(2) == player)
		{
			display.win();
			display.showStageEnd(ListOfStages.getStageIndex(this));
			return MiniGame.RESULT_VICTORY;
		}
		display.loose();
		display.showStageEnd(ListOfStages.getStageIndex(this));
		return MiniGame.RESULT_LOOSE;
	}
}
