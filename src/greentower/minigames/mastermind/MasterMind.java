package greentower.minigames.mastermind;
import greentower.IO.Input;
import greentower.IO.Output;
import greentower.IO.OutputConsole;
import greentower.core.Dialog;
import greentower.core.ListOfStages;
import greentower.core.MiniGame;

/**
 * Represents a specific MasterMind Game (player mode)
 *
 * @author delomeza
 *
 */
public class MasterMind extends MiniGame
{
	/**
	 * @param dialog Dialog to display at the beginning of the game
	 * @param stageIndex 
	 */
	public MasterMind(Dialog dialog, int stageIndex) 
	{
		super(dialog, stageIndex);
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
		if(str.length()!= 4)
			return false;
		
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
	 * @return The index of the nextStage to play (Logical link between Stage)
	 */
	public int playStage(Output display, Input input)
	{
		display.showStageIntroduction(ListOfStages.getStageIndex(this));
		display.showDialog(this.dialog);
		display.MasterMind();
		
		//TODO Exception
			// Create checkers to check the player's propositions
			Checker tmp = this.code.check(this.code);

			// Create an initial proposition (not considered)
			this.proposition = new Combination();

			// Counts the tries
			int tries = 0;

			int result;
			
			while(true)
			{
				display.showText("Essai n° : "+tries+", Maximum :"+DEFAULT_TRIES); //$NON-NLS-1$
				display.showText("Liste des couleurs : "+Color.BLUE+"(B) " + Color.GREEN + "(G) "+ Color.MAGENTA + "(M) "
				+ Color.ORANGE + "(O) " + Color.PINK + "(P) " + Color.RED + "(R)\n");
				display.showText("Veuillez saisir votre proposition :"); //$NON-NLS-1$
				String str;
				
				str = input.inputString().toUpperCase();

				while(str.length() !=4 || !stringChecker(str))
				{
					System.out.println("Veuillez saisir votre proposition correct (GGGG):"); //$NON-NLS-1$
					str = input.inputString().toUpperCase();
				}
				
				for(int i=0;i<4;i++)	
				{
					Color value = Color.getColor(str.charAt(i));
					this.proposition.combination[i]=value;
				}

				if(this.code.check(this.proposition).equals(tmp)) // VICTOIRE
				{
					result = MiniGame.RESULT_VICTORY;
					tries++;
					break;
				}
				else if(tries==DEFAULT_TRIES) // DEFAITE
				{
					result = MiniGame.RESULT_LOOSE;
					break;
				}
				else // NOUVEAU TOUR
				{
					tries++;
					System.out.println(this.code.check(this.proposition));
				}
			}
			display.showMiniGameResult(result);
		display.showStageEnd(ListOfStages.getStageIndex(this));
		return result;
	}
}
