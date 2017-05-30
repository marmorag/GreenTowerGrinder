package greentower.minigames.headsOrTails;

import java.util.Random;
import java.util.Scanner;
import greentower.core.MiniGame;
import greentower.display.Display;

/**
 * @author
 *
 */
public class HeadsOrTails extends MiniGame {

	/**
	 *
	 */
	private Scanner sc;

	/**
	 *
	 */
	public HeadsOrTails()
	{
	}

	public int playStage(Display display){
		int player=-1;
		while(player!=0 || player!=1){
			System.out.println("Veuillez entrer 0 pour pile et 1 pour face : ");
			this.sc = new Scanner(System.in);
			String userChoice = this.sc.nextLine();
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
