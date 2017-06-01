package greentower.IO;

import greentower.core.Dialog;import greentower.core.MiniGame;

/**
 * Implementation of Output to display in console mode
 * @author gavinr
 * 
 */
public class OutputConsole implements Output{

	@Override
	public void showDialog(Dialog dialog) {
		System.out.println(dialog);
	}
	
	@Override
	public void showText(String str) {
		System.out.println(str);
		
	}
	
	@Override
	public void showAnswers(String[] answers) {
		for(int i = 0; i < answers.length; i++)
		{
			System.out.println(answers[i]);
		}
		
	}
	
	
	/* ******************************* THE FOLLOWING METHODS SHOULDN'T BE IMPLEMENTED ******************************* */
	
	
	@Override
	public void notifyWin(int nbCoups, String motATrouver) {
		// VOID FOR NON USED METHOD AT THIS STAGE
	}

	@Override
	public void erreurLettre() {
		// VOID FOR NON USED METHOD AT THIS STAGE
	}

	@Override
	public void notifyLoose(String motATrouver) {
		// VOID FOR NON USED METHOD AT THIS STAGE
	}

	@Override
	public void demanderCaractere() {
		// VOID FOR NON USED METHOD AT THIS STAGE
	}

	@Override
	public void afficherPendu(int nbErreur, String motAAfficher) {
		// VOID FOR NON USED METHOD AT THIS STAGE
	}

	@Override
	public void showGame() {
		// TODO Auto*generated method stub
		
	}	@Override	public void showStageIntroduction(int stageIndex) 	{		System.out.println("***************************************************");		System.out.println("------------- ENTREE DANS L'ETAGE N°" + (stageIndex + 1) + " -------------");		System.out.println("***************************************************");	}	@Override	public void showStageEnd(int stageIndex) 	{		System.out.println(OutputConsole.gotN(3) + "***************************************************");		System.out.println("------------- SORTIE DANS L'ETAGE N°" + (stageIndex + 1) + " -------------");		System.out.println("***************************************************" + OutputConsole.gotN(10));		}		/**	 * Got a string with given number of '\n'	 * @param nb	 * 			Number of wanted '\n' 	 * @return	 * 			String with nb '\n'	 */	public static String gotN(int nb)	{		String result = "";		for(int i = 0; i < nb; i++)			result +="\n";		return result;	}	@Override	public void showMiniGameResult(int result) 	{		System.out.println(OutputConsole.gotN(2));		if (result == MiniGame.RESULT_VICTORY)		{			System.out.println("Féliciations tu as gagné le mini-jeu.");		}		else		{			System.out.println("Dommage, tu as perdu");		}				System.out.println("Rendez-vous au prochain étage");	}	@Override	public void showPrompt() 	{		System.out.print("\n> ");	}


	

}
