package greentower.minigames.gamblingmachine;

import greentower.core.Dialog;
import greentower.core.MiniGame;
import greentower.display.Output;

/**
 * @author Florent & Rémi
 */
public class GamblingMachine extends MiniGame{

	/**
	 * @param dialog
	 *
	 */
<<<<<<< HEAD
	public GamblingMachine()
=======
	public GamblingMachine(Dialog dialog)
>>>>>>> branch 'master' of https://gitlab.iut-valence.fr/florent.viogne/projetTutoreS2Groupe1.4.git
	{
<<<<<<< HEAD
=======
		super(dialog);
>>>>>>> branch 'master' of https://gitlab.iut-valence.fr/florent.viogne/projetTutoreS2Groupe1.4.git
	}

	/**
	 * Generate 3 random number between 0 and 2
	 * The player win if all 3 numbers and equals
	 * @return true if player wins false if not
	 */
	public int playStage(Output display){

		display.showText(this.dialog);

		boolean result;
		int[] grid = new int[3];
		grid[0] = (int)(Math.random() * (3-0)) + 0;
		grid[1] = (int)(Math.random() * (3-0)) + 0;
		grid[2] = (int)(Math.random() * (3-0)) + 0;

		if(grid[0] == grid[1] && grid[1] == grid[2]){
			System.out.println(grid[0]+"|"+grid[1]+"|"+grid[2]);
			result = true;
		}else{
			System.out.println(grid[0]+"|"+grid[1]+"|"+grid[2]);
			result = false;
		}

		if(result)
		{
			System.out.println("JACKPOT");
			return 0;
		}
		else
		{
			System.out.println("FAIL");
			return 1;
		}
	}
}
