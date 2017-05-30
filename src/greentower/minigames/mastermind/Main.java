package greentower.minigames.mastermind;
import java.util.Scanner;
/**
 * The MasterMind Game's application
 *
 * @author delomeza
 *
 */
public class Main {

	/**
	 * The MasterMind Game's launcher
	 * @param args
	 */
	public static void main(String[] args) {



		System.out.println("Entrez : \n1 pour le mode PLAYER VS IA \n2 pour le mode IA VS IA \n3 pour quitter"); //$NON-NLS-1$
		Scanner sc = new Scanner(System.in);
		int res = sc.nextInt();

		switch(res)
		{

		case 1 :
			MasterMindGame GameWithPlayer = new MasterMind();
			try
			{
				GameWithPlayer.play();
				break;
			}
			catch(NotAColorException e)
			{
				System.err.println("! ERREUR ! \nVEILLEZ A BIEN SAISIR DES COULEURS\nUsage : <COLOR> <COLOR> <COLOR> <COLOR> "); //$NON-NLS-1$
				MasterMindGame.DisplayColor();
				break;
			}
			catch(FalseLengthException e)
			{
				System.err.println("! ERREUR ! \nUsage : 4 Lettres \nExemple : RRRR"); //$NON-NLS-1$
				break;
			}

		case 2 :
			MasterMindGame GameRandom = new MasterMindGameIAVSIA();
			try
			{
				GameRandom.play();
				break;
			}
			catch(NotAColorException e)
			{
				//void
			}
			catch(FalseLengthException e)
			{
				//void
			}

		case 3 :
			break;
		}

	}
}