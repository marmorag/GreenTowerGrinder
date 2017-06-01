package greentower.IO;

import greentower.core.Dialog;import greentower.minigames.shifumi.Sign;
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
	}		@Override	public void showError(String str){		System.err.println(str);	}
	@Override
	public void showAnswers(String[] answers) {
		for(int i = 0; i < answers.length; i++)
			System.out.println(answers[i]);
	}		@Override	public void win(){		System.out.println("Bravo!");	}		@Override	public void loose(){		System.out.println("Dommage");	}	@Override	public void showStageIntroduction(int stageIndex) 	{		System.out.println("***************************************************");		System.out.println("------------- ENTREE DANS L'ETAGE N°" + (stageIndex + 1) + " -------------");		System.out.println("***************************************************");	}	@Override	public void showStageEnd(int stageIndex) 	{		System.out.println("***************************************************");		System.out.println("------------- SORTIE DANS L'ETAGE N°" + (stageIndex + 1) + " -------------");		System.out.println("***************************************************" + OutputConsole.gotN(10));		}		/**	 * Got a string with given number of '\n'	 * @param nb	 * 			Number of wanted '\n' 	 * @return	 * 			String with nb '\n'	 */	public static String gotN(int nb)	{		String result = "";		for(int i = 0; i < nb; i++)			result +="\n";		return result;	}
	//PENDU
	@Override
	public void notifyWin(int nbCoups, String motATrouver) {
		this.showText("Felicitations vous avez réussi en : "+ nbCoups +"coups\n");		this.showText("Le mot était :"+motATrouver+"\n");
	}
	@Override
	public void erreurLettre() {
		this.showError("\nLa lettre n'est pas contenu dans le mot!\n");		
	}
	@Override
	public void notifyLoose(String motATrouver) {
		this.showText("Dommage vous avez perdu");		this.showText("Le mot �tait :"+motATrouver+"\n");
	}
	@Override
	public void demanderCaractere() {		this.showText("\nVotre lettre :");
	}
	@Override
	public void afficherPendu(int nbErreur, String motAAfficher) {
		// VOID FOR NON USED METHOD AT THIS STAGE
	}	public void gambling(){			}		public void HeadsOrTails(){			}		public void LessOrMore(){			}		public void MasterMind(){			}		public void Othello(){			}		public void ShiFuMi(){			}		public void Suite(){			}		public void TicTacToe(){			}
	}

	@Override
	public void showGame() {
		// TODO Auto*generated method stub
		
	}	@Override	public void showStageIntroduction(int stageIndex) 	{		System.out.println("***************************************************");		System.out.println("------------- ENTREE DANS L'ETAGE N°" + (stageIndex + 1) + " -------------");		System.out.println("***************************************************");	}	@Override	public void showStageEnd(int stageIndex) 	{		System.out.println(OutputConsole.gotN(3) + "***************************************************");		System.out.println("------------- SORTIE DANS L'ETAGE N°" + (stageIndex + 1) + " -------------");		System.out.println("***************************************************" + OutputConsole.gotN(10));		}		/**	 * Got a string with given number of '\n'	 * @param nb	 * 			Number of wanted '\n' 	 * @return	 * 			String with nb '\n'	 */	public static String gotN(int nb)	{		String result = "";		for(int i = 0; i < nb; i++)			result +="\n";		return result;	}	@Override	public void showMiniGameResult(int result) 	{		System.out.println(OutputConsole.gotN(2));		if (result == MiniGame.RESULT_VICTORY)		{			System.out.println("Féliciations tu as gagné le mini-jeu.");		}		else		{			System.out.println("Dommage, tu as perdu");		}				System.out.println("Rendez-vous au prochain étage");	}	@Override	public void showPrompt() 	{		System.out.print("\n> ");	}


	

}
