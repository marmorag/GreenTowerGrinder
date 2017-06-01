package greentower.IO;

import greentower.core.Dialog;import greentower.minigames.shifumi.Sign;

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
	public void afficherPendu(int nbErreur, String motAAfficher) {		//this.effacerEcran();		OutputConsole.gotN(27);		switch(nbErreur){			case 0 :				OutputConsole.gotN(8);				break;			case 1 :				this.showText("\n\n\n\n\n\n\n\n      ============\n");				break;			case 2 :				this.showText("\n         ||\n         ||\n         ||\n         ||\n         ||\n" +						"        /||\n       //||\n      ============\n");				break;			case 3 :				this.showText("         ,==============\n"+"         ||\n"+"         ||\n"+"         ||\n"+"         ||\n"+"         ||\n"						+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 4 :				this.showText("         ,==========Y===\n"+"         ||         |\n"+"         ||         |\n"+"         ||\n"+						"         ||\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 5 :				this.showText("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||\n"+						"         ||\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 6 :				this.showText("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+						"         ||\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 7 :				this.showText("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+						"         ||         |\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 8 :				this.showText("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+						"         ||        /|\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 9 :				this.showText("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+						"         ||        /|\\\n"+"         ||        / \n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 10 :				this.showText("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+						"         ||        /|\\\n"+"         ||        /|\n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			default :				this.showError("ERREUR_AFFICHAGE_PENDU");				break;		}		this.showText("Le mot a trouver :"+motAAfficher+"\n");
	}	//Gambling machine	public void gambling(int[] grid){		this.showText(grid[0]+"|"+grid[1]+"|"+grid[2]);	}		public void HeadsOrTails(int face){		if(face == 0){ //PILE			this.showText("(P)");			this.showText("(F)");			this.showText("(P)");			this.showText("(F)");			this.showText("(P)");			this.showText("(F)");			this.showText("(P)");		}else{			this.showText("(F)");			this.showText("(P)");			this.showText("(F)");			this.showText("(P)");			this.showText("(F)");			this.showText("(P)");			this.showText("(F)");		}	}		public void LessOrMore(int number){		this.showText(String.valueOf(number));		this.showText("MORE or LESS ?");	}		public void MasterMind(){			}		public void Othello(){			}		public void ShiFuMi(Sign player, Sign random){		this.showText(String.valueOf(player)+" VS "+String.valueOf(random));	}		public void Suite(int nb1, int nb2, int nb3, int nb4){		this.showText("Arriverez-vous à trouver le prochain nombre ?");		this.showText(String.valueOf(nb1)+" "+String.valueOf(nb2)+" "+String.valueOf(nb3)+" "+String.valueOf(nb4)+" ?");		this.showText("Entrez votre réponse :");	}		public void TicTacToe(int[][] grid){		this.showText(grid[0][0]+"|"+grid[0][1]+"|"+grid[0][2]);		this.showText(grid[1][0]+"|"+grid[1][1]+"|"+grid[1][2]);		this.showText(grid[2][0]+"|"+grid[2][1]+"|"+grid[2][2]);	}
}
