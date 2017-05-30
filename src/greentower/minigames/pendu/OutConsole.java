package greentower.minigames.pendu;
/**
 * 
 * @author Guillaume
 *
 */
public class OutConsole implements Out {

	/**
	 * Display hanged in ASCII art according to current number of errors
	 * Display motAAfficher updated according to letters found
	 */
	@Override
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
	
	@Override
	public void demanderCaractere() {
		System.out.println("\nVotre lettre :");
	}
	
	@Override
	public void erreurLettre() {
		System.out.println("\nLa lettre n'est pas contenu dans le mot!\n");		
	}
	
	@Override
	public void notifyWin(int nbCoups, String motATrouver) {
		System.out.println("Felicitations vous avez réussi en : "+ nbCoups +"coups\n");
		System.out.println("Le mot �tait :"+motATrouver+"\n");
	}
	
	@Override
	public void notifyLoose(String motATrouver) {
		System.out.println("Dommage vous avez perdu");
		System.out.println("Le mot �tait :"+motATrouver+"\n");
	}
	
}
