package greentower.minigames.mastermind;
import java.util.Scanner;

import greentower.IO.Output;
import greentower.core.Dialog;
import greentower.core.MiniGame;

/**
 * Represents a specific MasterMind Game (player mode)
 *
 * @author delomeza
 *
 */
public class MasterMind extends MiniGame{

	protected MasterMind(Dialog dialog) {
		super(dialog);
		// TODO Auto-generated constructor stub
	}

	/**
	 * We can only try 12 combinations to find the solution
	 */
	public final static int DEFAULT_TRIES = 12;


	/**
	 * Counts the number of tries (max = 12)
	 */
	public int counter;


	/**
	 * The result that the player has to find
	 */
	protected Combination code= new Combination();


	/**
	 * The combination that the player give to find the solution
	 */
	public Combination proposition;

	/**
	 * Displays the way to dial the combination
	 */
	public static void DisplayColor()
	{
		System.out.println(" R : Red \n G : Green \n B : Blue \n M : Magenta \n O : Orange \n P : Pink"); //$NON-NLS-1$
	}

	/**
	 * Organizes the game
	 * @throws FalseLengthException
	 * @throws NotAColorException
	 */

	
	/**
	 * OVERRIDE
	 * Permit to play the game with a player
	 */
	public int playStage(Output out) /*throws NotAColorException,FalseLengthException*/ {
		//TODO Exception
			// Create checkers to check the player's propositions
			Checker tmp = code.check(code);

			// Create an initial proposition (not considered)
			this.proposition = new Combination();

			// Scanner initialization
			Scanner sc = new Scanner(System.in);

			// Counts the tries
			int tries = 0;

			while(true)
			{
				System.out.println("Essai n° (max 12): "+tries); //$NON-NLS-1$
				System.out.println();
				System.out.println("Veuillez saisir votre proposition:"); //$NON-NLS-1$
				String str=sc.nextLine().toUpperCase();

				if(str.length()!=4)
				{
					throw new FalseLengthException();
				}

				for(int i=0;i<4;i++)
				{
					char carac = str.charAt(i);

					if(carac!='R'& carac!='G' & carac!='B' & carac!='O'& carac!='M'& carac!='P')
					{
						throw new NotAColorException();
					}

					Color value = Color.getColor(carac);
					this.proposition.combination[i]=value;

				}

				if(this.code.check(this.proposition).equals(tmp))
				{
					tries++;
					System.out.println();
					System.out.println("! BRAVO ! \nVous avez gagné en "+tries+" coup(s)");
					return 1;
				}
				else if(tries==DEFAULT_TRIES)
				{
					System.out.println("Dommage vous avez perdu :/");
					return 0;
				}
				else
				{
					tries++;
					System.out.println(this.code.check(this.proposition));
				}
			}
	}
}
