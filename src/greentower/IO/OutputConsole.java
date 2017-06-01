package greentower.IO;

import greentower.core.Answers;import greentower.core.Dialog;import greentower.minigames.shifumi.Sign;
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
	public void showAnswers(Answers answers) {
			System.out.println(answers);
	}	@Override	public void showStageIntroduction(int stageIndex) 	{		System.out.println("***************************************************");		System.out.println("------------- ENTREE DANS L'ETAGE N°" + (stageIndex + 1) + " -------------");		System.out.println("***************************************************");	}	@Override	public void showStageEnd(int stageIndex) 	{		System.out.println("***************************************************");		System.out.println("------------- SORTIE DANS L'ETAGE N°" + (stageIndex + 1) + " -------------");		System.out.println("***************************************************" + OutputConsole.gotN(10));		}		@Override	public void showMiniGameResult(int result) 	{		System.out.println(OutputConsole.gotN(2));		if (result == MiniGame.RESULT_VICTORY)		{			System.out.println("Féliciations tu as gagné le mini-jeu.");		}		else		{			System.out.println("Dommage, tu as perdu");		}				System.out.println("Rendez-vous au prochain étage");	}	@Override	public void showPrompt() 	{		System.out.print("\n> ");	}	/**	 * Got a string with given number of '\n'	 * @param nb	 * 			Number of wanted '\n' 	 * @return	 * 			String with nb '\n'	 */	public static String gotN(int nb)	{		String result = "";		for(int i = 0; i < nb; i++)			result +="\n";		return result;	}
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
	public void afficherPendu(int nbErreur, String motAAfficher) {		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");		switch(nbErreur){			case 0 :				System.out.println("\n\n\n\n\n\n\n\n");				break;			case 1 :				System.out.println("\n\n\n\n\n\n\n\n      ============\n");				break;			case 2 :				System.out.println("\n         ||\n         ||\n         ||\n         ||\n         ||\n" +						"        /||\n       //||\n      ============\n");				break;			case 3 :				System.out.println("         ,==============\n"+"         ||\n"+"         ||\n"+"         ||\n"+"         ||\n"+"         ||\n"						+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 4 :				System.out.println("         ,==========Y===\n"+"         ||         |\n"+"         ||         |\n"+"         ||\n"+						"         ||\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 5 :				System.out.println("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||\n"+						"         ||\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 6 :				System.out.println("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+						"         ||\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 7 :				System.out.println("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+						"         ||         |\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 8 :				System.out.println("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+						"         ||        /|\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 9 :				System.out.println("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+						"         ||        /|\\\n"+"         ||        / \n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			case 10 :				System.out.println("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+						"         ||        /|\\\n"+"         ||        /|\n"+"        /||\n"+"       //||\n"+"      ============\n");				break;			default :				System.out.println("ERREUR_AFFICHAGE_PENDU");				break;		}		System.out.println("Le mot a trouver :"+motAAfficher+"\n");
	}	@Override	public void gambling(int[] grid) {		this.showText(grid[0]+"|"+grid[1]+"|"+grid[2]);			}	@Override	public void HeadsOrTails(int face) {		if(face == 0){ //PILE			this.showText("(P)");			this.showText("(F)");			this.showText("(P)");			this.showText("(F)");			this.showText("(P)");			this.showText("(F)");			this.showText("(P)");			this.showText("(F)");			this.showText("(P)");		}else{			this.showText("(F)");			this.showText("(P)");			this.showText("(F)");			this.showText("(P)");			this.showText("(F)");			this.showText("(P)");			this.showText("(F)");			this.showText("(P)");			this.showText("(F)");		}			}	@Override	public void LessOrMore(int number) 	{		this.showText("RULES");		this.showText("Tu vas devoir devoir deviné si le prochain nombre entre 1 et 10 sera plus grand ou plus petit que celui affiché");		this.showText("MORE: plus grand");		this.showText("LESS: plus petit");		this.showText("Le nombre est : "+number);	}	@Override	public void ShiFuMi(Sign player, Sign random) {		this.showText(String.valueOf(player)+" VS "+String.valueOf(random));	}	@Override	public void Suite(int nb1, int nb2, int nb3, int nb4) {		this.showText("Arriverez-vous à trouver la suite ?");		this.showText(String.valueOf(nb1)+" "+String.valueOf(nb2)+" "+String.valueOf(nb3)+" "+String.valueOf(nb4)+" ?");	}	@Override	public void TicTacToe(int[][] grid) {		this.showText(grid[0][0]+"|"+grid[0][1]+"|"+grid[0][2]);		this.showText(grid[1][0]+"|"+grid[1][1]+"|"+grid[1][2]);		this.showText(grid[2][0]+"|"+grid[2][1]+"|"+grid[2][2]);	}	@Override	public void MasterMind() {		// TODO Auto-generated method stub			}	@Override	public void Othello() {		// TODO Auto-generated method stub			}
}
