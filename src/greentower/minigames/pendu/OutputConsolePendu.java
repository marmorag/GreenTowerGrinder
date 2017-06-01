package greentower.minigames.pendu;

import greentower.IO.Output;
import greentower.core.Dialog;

/**
 * 
 * @author Guillaume
 *
 */
public class OutputConsolePendu implements Output {

	/**
	 * Display hanged in ASCII art according to current number of errors
	 * Display motAAfficher updated according to letters found
	 */
	public void afficherPendu(int nbErr, String motAAfficher)
	{
		//this.effacerEcran();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

		switch(nbErr){

			case 0 :
				System.out.println("\n\n\n\n\n\n\n\n");
				break;
			case 1 :
				System.out.println("\n\n\n\n\n\n\n\n      ============\n");
				break;
			case 2 :
				System.out.println("\n         ||\n         ||\n         ||\n         ||\n         ||\n" +
						"        /||\n       //||\n      ============\n");

				break;
			case 3 :
				System.out.println("         ,==============\n"+"         ||\n"+"         ||\n"+"         ||\n"+"         ||\n"+"         ||\n"
						+"        /||\n"+"       //||\n"+"      ============\n");
				break;
			case 4 :
				System.out.println("         ,==========Y===\n"+"         ||         |\n"+"         ||         |\n"+"         ||\n"+
						"         ||\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");
				break;
			case 5 :
				System.out.println("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||\n"+
						"         ||\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");
				break;
			case 6 :
				System.out.println("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+
						"         ||\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");
				break;
			case 7 :
				System.out.println("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+
						"         ||         |\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");
				break;
			case 8 :
				System.out.println("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+
						"         ||        /|\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n");
				break;
			case 9 :
				System.out.println("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+
						"         ||        /|\\\n"+"         ||        / \n"+"        /||\n"+"       //||\n"+"      ============\n");
				break;
			case 10 :
				System.out.println("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+
						"         ||        /|\\\n"+"         ||        /|\n"+"        /||\n"+"       //||\n"+"      ============\n");
				break;
			default :
				System.out.println("ERREUR_AFFICHAGE_PENDU");
				break;
		}
		System.out.println("Le mot a trouver :"+motAAfficher+"\n");
	}
	
	public void showDialog(Dialog dialog) {
		System.out.println(dialog);
		
	}
	
	public void demanderCaractere() {
		System.out.println("\nVotre lettre :");
	}
	
	public void erreurLettre() {
		System.out.println("\nLa lettre n'est pas contenu dans le mot!\n");		
	}
	
	public void notifyWin(int nbCoups, String motATrouver) {
		System.out.println("Felicitations vous avez réussi en : "+ nbCoups +"coups\n");
		System.out.println("Le mot �tait :"+motATrouver+"\n");
	}
	
	public void notifyLoose(String motATrouver) {
		System.out.println("Dommage vous avez perdu");
		System.out.println("Le mot �tait :"+motATrouver+"\n");
	}

	@Override
	public void showText(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAnswers(String[] answers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void win() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showStageIntroduction(int stageIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showStageEnd(int stageIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gambling() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void HeadsOrTails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LessOrMore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MasterMind() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Othello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShiFuMi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Suite() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TicTacToe() {
		// TODO Auto-generated method stub
		
	}
	
}
