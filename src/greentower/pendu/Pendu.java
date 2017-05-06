package greentower.pendu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

import greentower.core.MiniGame;
import greentower.core.Stage;

/**
 * @author Guillaume
 *
 */
public class Pendu extends MiniGame{

	/**
	 * Allow us to generate random number
	 */
	Random r = new Random();

	/**
	 * Random number to choose a word
	 */
	private int nbAleatoire;

	/**
	 * Letter number of motATrouver (motATrouver.length)
	 */
	private int nbLettre;

	/**
	 * Error number of current game
	 */
	private int nbErreur;

	/**
	 * Move number of current game
	 */
	private int nbCoups;

	/**
	 * Random word choosen
	 */
	private String motATrouver;

	/**
	 * motATrouver copy but letters are replaced by _
	 * until player has not found the correct letter
	 */
	private String motAAfficher;


	/**
	 *	motATrouver takes value of word at line nbAleatoire in listeMot.txt
	 *	Initialize motAAfficher with "_" and nbLettre in function
	 */
	public Pendu(int id)
	{
		super(id);
		nbAleatoire = r.nextInt(835); // Replace 835 by the line number of listeMot.txt ?
		int i = 0;
		this.nbErreur = 0;
		this.nbCoups = 0;


		try{
			InputStream flux=new FileInputStream("src/greentower/pendu/listeMot.txt");
			InputStreamReader lecture=new InputStreamReader(flux);
			BufferedReader buff=new BufferedReader(lecture);
			String ligne;

			while ((ligne=buff.readLine())!=null && i < nbAleatoire){
				i++;
			}

			this.motATrouver = ligne;
			this.nbLettre = motATrouver.length();
			this.motAAfficher = motATrouver.replaceAll(".", "_");

			buff.close();
		}
		catch (Exception ERREUR_FICHIER){
			System.out.println(ERREUR_FICHIER.toString());
		}
	}


	/**
	 * @param lettreEntree Letter entered by the player
	 *	@return true if letter is in word, false if not
	 *	Can be replace by String.contains()
	 *	Update motAAfficher if letter is contained
	 */
	private boolean verifierLettre(char lettreEntree)
	{
		int i;
		boolean isIn = false;

		for(i=0;i < nbLettre;i++)
		{
			if(lettreEntree == this.motATrouver.charAt(i))
			{
				isIn = true;
				break;
			}
		}

		if(isIn)
			this.majMotAAfficher(lettreEntree);

		this.nbCoups++;
		return isIn;
	}

	/**
	 * Update display word (motAAfficher) in function of letters found
	 */
	private void majMotAAfficher(char lettreEntree)
	{
		char[] tempArray = new char[26];
		int i;

		for(i = 0;i < nbLettre;i++)
		{
			tempArray[i] = motAAfficher.charAt(i);
		}

		motAAfficher = "";

		for(i = 0;i < nbLettre;i++)
		{
			if(motATrouver.charAt(i) == lettreEntree)
			{
				tempArray[i] = motATrouver.charAt(i);
			}
			motAAfficher = motAAfficher + tempArray[i];
		}
	}

	/**
	 * Display hanged in ASCII art according to current number of errors
	 * Display motAAfficher updated according to letters found
	 */
	private void afficherPendu()
	{
		//this.effacerEcran();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

		switch(this.nbErreur){

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

	/**
	 * @return true if all "_" have been replaced (all letters are found) in motAAfficher
	 * false if not
	 */
	private boolean finDuPendu()
	{
		return(!motAAfficher.contains("_"));
	}

	/**
	 * Main procedure which launch miniGame
	 */
	public Stage playStage()
	{
		Scanner scan = new Scanner(System.in);
		char lettreEntree;

		while(!this.finDuPendu() && nbCoups <= nbLettre+5)
		{
			this.afficherPendu();
			//System.out.println(motATrouver);
			System.out.println("\nVotre lettre :");
			lettreEntree = scan.next().charAt(0);

			if(!this.verifierLettre(lettreEntree))
			{
				System.out.println("\nLa lettre n'est pas contenu dans le mot!\n");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {}
				this.nbErreur++;
			}
		}
		if(this.finDuPendu())
		{
			System.out.println("Felicitations vous avez réussi en : "+ this.nbCoups +"coups\n");
			return this.nextStages[0];
		}
		else
		{
			System.out.println("Dommage vous avez perdu");
			return this.nextStages[1];
		}

		scan.close();
	}

}
