package greentower.minigames.mastermind;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import greentower.IO.Output;
import greentower.core.Dialog;

/**
 * Represents a specific MasterMind Game (player mode)
 *
 * @author delomeza
 *
 */
public class MasterMind /*extends MiniGame*/{

	/**
	 * @param dialog Dialog to display at the beginning of the game
	 */
	protected MasterMind(Dialog dialog) {
		//super(dialog);
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
	 * Check if the current string match the expected format
	 * @param str Current string to test
	 * @return true if the given string contains the correct letter false else
	 */
	public static boolean stringChecker(String str)
	{		
		for(int i=0;i<4;i++)
		{
			char carac = str.charAt(i);

			if(carac!='R'& carac!='G' & carac!='B' & carac!='O'& carac!='M'& carac!='P')
			{
				return false;
			}
		}
		return true;
	}

	
	/**
	 * OVERRIDE
	 * Permit to play the game with a player
	 * @param out 
	 * @return The index of the nextStage to play (Logical link between Stage)
	 */
	public int playStage(Output out){
		//TODO Exception
			// Create checkers to check the player's propositions
			Checker tmp = code.check(code);

			// Create an initial proposition (not considered)
			this.proposition = new Combination();

			// Scanner initialization
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			// Counts the tries
			int tries = 0;

			while(true)
			{
				System.out.println("Essai n° : "+tries+", Maximum :"+DEFAULT_TRIES); //$NON-NLS-1$
				System.out.println("Liste des couleur : "+Color.BLUE+" "+Color.GREEN+" "+Color.MAGENTA+" "+Color.ORANGE+" "+Color.PINK+" "+Color.RED+"\n");
				System.out.println("Veuillez saisir votre proposition :"); //$NON-NLS-1$
				String str;
				try {
					str = br.readLine().toUpperCase();
				} catch (IOException e) {
					// MAY NOT HAPPEND 
					str = "";
				}

			
				while(str.length() !=4 || !stringChecker(str))
				{
					System.out.println("Veuillez saisir votre proposition correct (GGGG):"); //$NON-NLS-1$
					try {
						str = br.readLine().toUpperCase();
					} catch (IOException e) {
						// MAY NOT HAPPEND
						str = "";
					}
				}
				
				for(int i=0;i<4;i++)	
				{
					Color value = Color.getColor(str.charAt(i));
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
