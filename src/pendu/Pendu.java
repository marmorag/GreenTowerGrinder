import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 * @author guillaume
 *
 */
public class Pendu {
		
	/**
	 * permet de generer un nombre aleatoire pour le choix du mot
	 */
	Random r = new Random();
	
	/**
	 * le nombre aleatoire pour le choix du mot
	 */
	private int nbAleatoire;
	
	/**
	 * le nombre de lettre de motATrouver => motATrouver.length()
	 */
	private int nbLettre;
	
	/**
	 * le nombre de d'erreur de la partie en cours
	 */
	private int nbErreur;
	
	/**
	 * le nombre de coups de la partie en cours
	 */
	private int nbCoups;
	
	/**
	 * le mot choisi aleatoirement a trouver
	 */
	private String motATrouver;
	
	/**
	 * une copie du mot a trouver, toute les lettre sont remplecée par _ puis par leur 
	 * lettre originel lorsqu'elle est trouvée
	 */
	private String motAAfficher;
	
	
	/**
	 * 	constructeur Pendu -> stock dans motATrouver le mot a la ligne nbAlaetoire 
	 * 	du fichier listeMot.txt 
	 *	initialise motAAfficher avec des "_" et nbLettre
	 *
	 */
	public Pendu()
	{
		nbAleatoire = r.nextInt(835);
		int i = 0;
		this.nbErreur = 0;
		this.nbCoups = 0;
		
		
		try{
			InputStream flux=new FileInputStream("/home/guillaume/eclipse-ws/MiniJeux_Pendu/src/listeMot.txt"); 
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
	 * @param lettreEntree la lettre entree par le joueur
	 *	renvoie vrai si la lettre est contenu dans le mot faux sinon, aurais pu etre
	 *	remplacer par la methode String.contains()
	 *	met a jour le motAAfficher si la lettre est contenu
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
	 * met a jour le mot a afficher en fonction des lettres trouvées
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
	 * affiche le pendu en ascii art en fonction du nombre d'erreur actuel
	 * affiche le motAAfficher mis a jour en fonction des lettres trouvées
	 */
	private void afficherPendu()
	{
		this.effacerEcran();
		
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
						"         ||        /|\\n"+"         ||        / \n"+"        /||\n"+"       //||\n"+"      ============\n");
				break;
			case 10 :
				System.out.println("         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+
						"         ||        /|\\n"+"         ||        /|\n"+"        /||\n"+"       //||\n"+"      ============\n");
				break;
			default : 
				System.out.println("ERREUR_AFFICHAGE_PENDU");
				break;
		}
		
		System.out.println("Le mot a trouver :"+motAAfficher+"\n");
		
	}

	/**
	 * renvoie vrai si les "_" ont tous été remplacer (donc toute les lettres trouver) 
	 * dans le mot a afficher false sinon
	 */
	private boolean finDuPendu()
	{
		return(!motAAfficher.contains("_"));
	}
	
	/**
	 * procedure principale lance l'execution du mini-jeu 
	 * 
	 */
	public void lancerPendu()
	{
		Scanner scan = new Scanner(System.in);
		char lettreEntree;
		
		while(!this.finDuPendu() && nbCoups <= nbLettre+5)
		{
			this.afficherPendu();
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
		}			
		else
		{
			System.out.println("Dommage vous avez perdu");
		}
		
		scan.close();	
	}

	/**
	 * methode pour effacer l'ecran de la console
	 */
	private void effacerEcran()
	{
	    if(System.getProperty("os.name" ).startsWith("Windows" ))
			try 
	    	{
				Runtime.getRuntime().exec("cls" );
			} 
	    	catch (IOException ERREUR_CLEAR_WINDOWS)
			{
				ERREUR_CLEAR_WINDOWS.printStackTrace();
			}
		else
			try
	    	{
				Runtime.getRuntime().exec("clear" );
			} 
	    	catch (IOException ERREUR_CLEAR_OTHER) 
	    	{
				ERREUR_CLEAR_OTHER.printStackTrace();
			}
	}
}
