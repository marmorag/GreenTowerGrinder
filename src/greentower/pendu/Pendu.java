package greentower.pendu;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Random;

import greentower.core.MiniGame;
import greentower.core.Stage;

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
	private Output displayTool;

	/**
	 * Interfaces use to ease input
	 */
	private Input inputTool;

	/**
	 *	motATrouver takes value of word at line nbAleatoire in listeMot.txt
	 *	Initialize motAAfficher with "_"
	 * @param id
	 * @param display
	 * @param input
	 */
	public Pendu(int id, Output display, Input input)
	{
		super(id);

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
			this.motAAfficher = motATrouver.replaceAll(".", "_");

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
		char[] tempArray = new char[motAAfficher.length()];
		int i;

		for(i = 0;i < motATrouver.length();i++)
		{
			tempArray[i] = motAAfficher.charAt(i);
		}

		motAAfficher = "";

		for(i = 0;i < motATrouver.length();i++)
		{
			if(motATrouver.charAt(i) == lettreEntree)
			{
				tempArray[i] = motATrouver.charAt(i);
			}
			motAAfficher = motAAfficher + tempArray[i];
		}
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
	 * @return Stage return one of the two stage contained
	 */
	public Stage playStage()
	{
		char lettreEntree;

		while(!this.finDuPendu() && nbCoups <= motATrouver.length()+5)
		{
			this.displayTool.afficherPendu(this.nbErreur,this.motAAfficher);
			//System.out.println(motATrouver);

			this.displayTool.demanderCaractere();
			lettreEntree = this.inputTool.saisirCaractere();

			if(!this.verifierLettre(lettreEntree))
			{
				this.displayTool.erreurLettre();
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {}
				this.nbErreur++;
			}
		}
		if(this.finDuPendu())
		{
			this.displayTool.notifyWin(this.nbCoups, this.motATrouver);
			return this.nextStages[0];
		}
		else
		{
			this.displayTool.notifyLoose(this.motATrouver);
			return this.nextStages[1];
		}
	}

}
