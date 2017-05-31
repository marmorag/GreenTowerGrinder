package greentower.minigames.headsOrTails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import greentower.IO.Output;
import greentower.core.Dialog;
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
	 */
	public HeadsOrTails(Dialog dialog)
	{
		super(dialog);
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public int playStage(Output display) throws IOException{
		display.showGame();
		display.showDialog(dialog);
		int player=-1;
		while(player!=0 || player!=1){
			System.out.println("Veuillez entrer 0 pour pile et 1 pour face : ");
			String userChoice;
			userChoice = this.br.readLine();
			player = Integer.parseInt(userChoice);
			System.out.println("\n");
		}
		if((int) new Random().nextInt(2) == player)
		{
			System.out.println("Bravo");
			return 0;
		}
		System.out.println("Dommage");
		return 1;
	}
}
