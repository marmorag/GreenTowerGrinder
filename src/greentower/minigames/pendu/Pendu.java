package greentower.minigames.pendu;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Random;

import greentower.core.MiniGame;
import greentower.display.Output;

/**
 * @author Guillaume
 *
 */
public class Pendu extends MiniGame{

	/**
	 * Error number of current game
	 */
	private int nbErreur;

	/**
	 * Move number of current game
	 */
	private int nbCoups;

	/**
	 * Random word chosen
	 */
	private String motATrouver;

	/**
	 * motATrouver copy but letters are replaced by _
	 * until player has not found the correct letter
	 */
	private String motAAfficher;

	/**
	 * Interfaces use to ease display
	 */
	private Out displayTool;

	/**
	 * Interfaces use to ease input
	 */
	private Input inputTool;

	/**
	 *	motATrouver takes value of word at line nbAleatoire in listeMot.txt
	 *	Initialize motAAfficher with "_"
	 * @param display
	 * @param input
	 */
<<<<<<< HEAD
	public Pendu(Output display, Input input)
=======
	public Pendu(Out display, Input input)
>>>>>>> branch 'master' of https://gitlab.iut-valence.fr/florent.viogne/projetTutoreS2Groupe1.4.git
	{
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://gitlab.iut-valence.fr/florent.viogne/projetTutoreS2Groupe1.4.git
		Random r = new Random();
		int nbAleatoire = r.nextInt(835); // Replace 835 by the line number of listeMot.txt ?
		int i = 0;

		this.nbErreur = 0;
		this.nbCoups = 0;
		this.displayTool = display;
		this.inputTool = input;
		// Put the next two stage
		//this.nextStage[0]= ;
		//this.nextStage[1]= ;

		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/greentower/pendu/listeMot.txt")));
			String ligne;

			while ((ligne=br.readLine())!=null && i < nbAleatoire){
				i++;
			}

			this.motATrouver = ligne;
			this.motAAfficher = this.motATrouver.replaceAll(".", "_");

			br.close();
		}
		catch (Exception FileReadException){
			System.out.println(FileReadException.toString());
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
		CharSequence lettre = ""+lettreEntree;

		if(this.motATrouver.contains(lettre))
		{
			this.majMotAAfficher(lettreEntree);
			this.nbCoups++;
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Update display word (motAAfficher) in function of letters found
	 * @param lettreEntree
	 */
	private void majMotAAfficher(char lettreEntree)
	{
		char[] tempArray = new char[this.motAAfficher.length()];
		int i;

		for(i = 0;i < this.motATrouver.length();i++)
		{
			tempArray[i] = this.motAAfficher.charAt(i);
		}

		this.motAAfficher = "";

		for(i = 0;i < this.motATrouver.length();i++)
		{
			if(this.motATrouver.charAt(i) == lettreEntree)
			{
				tempArray[i] = this.motATrouver.charAt(i);
			}
			this.motAAfficher = this.motAAfficher + tempArray[i];
		}
	}


	/**
	 * @return true if all "_" have been replaced (all letters are found) in motAAfficher
	 * false if not
	 */
	private boolean finDuPendu()
	{
		return(!this.motAAfficher.contains("_"));
	}

	/**
	 * Main procedure which launch miniGame
	 * @return Stage return one of the two stage contained
	 */
	public int playStage(Output display)
	{
		char lettreEntree;

		while(!this.finDuPendu() && this.nbCoups <= this.motATrouver.length()+5)
		{
			this.displayTool.afficherPendu(this.nbErreur,this.motAAfficher);
			//System.out.println(motATrouver);

			this.displayTool.demanderCaractere();
			lettreEntree = this.inputTool.saisirCaractere();

			if(!this.verifierLettre(lettreEntree))
			{
				this.displayTool.erreurLettre();
				try
				{
					Thread.sleep(1500);
				}
				catch (InterruptedException e)
				{
					//NO PROBLEM
				}
				this.nbErreur++;
			}
		}
		if(this.finDuPendu())
		{
			this.displayTool.notifyWin(this.nbCoups, this.motATrouver);
			return 0;
		}
		else
		{
			this.displayTool.notifyLoose(this.motATrouver);
			return 1;
		}
	}

}
