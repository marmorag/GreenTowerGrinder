package greentower.minigames.headsOrTails;

import java.util.Random;
import java.util.Scanner;

import greentower.core.Dialog;
import greentower.core.MiniGame;
import greentower.display.Output;

/**
 * @author
 *
 */
public class HeadsOrTails extends MiniGame {

<<<<<<< HEAD
	public HeadsOrTails()
=======
	/**
	 *
	 */
	private Scanner sc;

	/**
	 * @param dialog
	 *
	 */
	public HeadsOrTails(Dialog dialog)
>>>>>>> branch 'master' of https://gitlab.iut-valence.fr/florent.viogne/projetTutoreS2Groupe1.4.git
	{
<<<<<<< HEAD

=======
		super(dialog);
>>>>>>> branch 'master' of https://gitlab.iut-valence.fr/florent.viogne/projetTutoreS2Groupe1.4.git
	}

	public int playStage(Output display){
		display.showText(dialog);
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
