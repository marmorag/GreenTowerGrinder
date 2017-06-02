package greentower.stage.choice;

/**
 * This class represents a dialog
 *
 * @author Florent
 *
 */
public enum Dialog {

	/**
	 * Stage 1's dialog
	 */
	DIALOG_STAGE1(new String [] {"Bonjour jeune graine.", "Je suis Sativa, gardien de cette tour et protecteur de son tr�sor.", "Aujourd�hui, je vais te guider � travers ton dangereux p�riple.", "Appuie sur '0' et ensuite 'Entrée' pour continer"}),

	/**
	 * Stage 2's dialog
	 */
	DIALOG_STAGE2(new String[] {"Bravo !", "Comme tu peux le voir, tu es mont� d'un �tage !", "Le premier d'une longue s�rie.", "Je vais maintenant t'expliquer les r�gles qui r�gissent cette tour.", "C'est une tour magique qui �volue en fonction des choix des aventuriers.", "Ses chemins te conduiront � la gloire ou � la d�solation.", "Chaque niveau comprend une �preuve et tu devras triompher de toutes celles-ci pour avancer !", "Compris ? "}),

	/**
	 * Stage 3's dialog
	 */
	DIALOG_STAGE3(new String[] {"Commen�ons de suite si tu le veux bien.", "Je vais te poser une �nigme et de ta r�ponse d�pendra la suite de ta qu�te.", "Je suis en t�te de file mais � bout de nerf.", "Qui suis-je ?"}),

	/**
	 * Stage 4's dialog
	 */
	DIALOG_STAGE4(new String[] {"Bravo !", "Mais maintenant que j'ai test� ton intelligence, je vais mesurer ta chance.", "Car il faut bien avouer que dans la vie la chance occupe une grande place."}), // PARTIE LESS OR MORE

	/**
	 * Stage 5's dialog
	 */
	DIALOG_STAGE5(new String[] {"D�sol� mais c'�tait la mauvaise r�ponse.", "Mais je ne peux uniquement juger ton intelligence sur une �nigme.", "C'est pourquoi nous allons passer � la pratique."}), // PARIE DE TIC TAC TOE

	/**
	 * Stage 6's dialog
	 */
	DIALOG_STAGE6(new String[] {"Serais-tu l'�lu ?", "Alliant intelligence et chance afin de vaincre les forces du mal ?", "Je me dois de v�rifier.", "R�ponds � cette �nigme !", "Combien y a-t-il de carr�s en tout, dans une grille 4x4 ?",
			"\n",
			"+---+---+---+---+",
			"|   |   |   |   |",
			"+---+---+---+---+",
			"|   |   |   |   |",
			"+---+---+---+---+",
			"|   |   |   |   |",
			"+---+---+---+---+",
			"|   |   |   |   |",
			"+---+---+---+---+"}),

	/**
	 * Stage 7's dialog
	 */
	DIALOG_STAGE7(new String[] {"Tu manques de chance et je ne peux te blamer.", "Tu n'es certes pas l'�lu mais cela ne t'emp�chera pas de pouvoir monter au sommet.", "Le chemin sera juste plus difficile.", "En parlant de difficult�, connais-tu le rush hour ? Viens donc faire une partie !"}), // PARTIE RUSH HOUR

	/**
	 * Stage 8's dialog
	 */
	DIALOG_STAGE8(new String[] {"Bien bien.", "Parfois on dit qu'il faut savoir tout recommencer pour mieux repartir.", "Retourne donc au d�but de la tour et cette fois-ci, n'�choue pas ! "}),

	/**
	 * Stage 9's dialog
	 */
	DIALOG_STAGE9(new String[] {"Ph�nom�nal !", "Tu es le meilleur aventurier que je n'ai jamais rencontr� !", "Prends donc ce passage secret, il emm�ne directement en haut de la tour ou bien laisse le temps faire les choses et continue normalement ton ascension !"}),

	/**
	 * Stage 10's dialog
	 */
	DIALOG_STAGE10(new String[] {"Oh ! On dirait que je me suis emport� dans des conclusions h�tives !", "Tu n'es pas l'�lu, mais tu peux tout de m�me me surprendre et r�ussir. "}),

	/**
	 * Stage 11's dialog
	 */
	DIALOG_STAGE11(new String[] {"Bravo !", "Tu nous as sortis d'un sacr� embouteillage !", "D'ailleurs, sais-tu comment �viter les embouteillages ?"}),

	/**
	 * Stage 12's dialog
	 */
	DIALOG_STAGE12(new String[] {"Il faut se m�fier des chemins trop simples !", "Voici ta punition !"}),

	/**
	 * Stage 13's dialog
	 */
	DIALOG_STAGE13(new String[] {"C'est tr�s bien.", "Maintenant assied-toi et prend un th�."}), // PARTIE OTHELLO

	/**
	 * Stage 14's dialog
	 */
	DIALOG_STAGE14(new String[] {"Non il faut rouler � vitesse constante !", "Faisons une partie de Shifumi pour d�cider de ton sort !",
			"\n", "RULES", "Choisis un signe:", 
			"ROCK: Pierre", "PAPER: Papier", "SCISSORS: Ciseaux"}), // PARTIE SHIFUMI

	/**
	 * Stage 15's dialog
	 */
	DIALOG_STAGE15(new String[] {"Quel jeu relaxant !", "ZzzzzZzzzzZZzzzzzzZZZzzzZzzzZzzzzZZzzzZzzzzZZZZzzzzZzz.", "Que faire ?"}),

	/**
	 * Stage 16's dialog
	 */
	DIALOG_STAGE16(new String[] {"Il ne faut pas confondre vitesse et pr�cipitation mon jeune ami !", "Je suis un homme , je suis une femme .", "Je ne suis ni un homme ni une femme.", "Qui suis-je ?"}),

	/**
	 * Stage 17's dialog
	 */
	DIALOG_STAGE17(new String[] {"Oui pardon !", "Heureusement que tu m'as r�veill� car sinon nous aurions �t� dans de beaux draps !", "Continuons ?"}),

	/**
	 * Stage 18's dialog
	 */
	DIALOG_STAGE18(new String[] {"Vous vous endormez et sentez du mouvement durant votre sommeil."}),

	/**
	 * Stage 19's dialog
	 */
	DIALOG_STAGE19(new String[] {"Bien, comme tu as gagn� je vais te laisser une chance !", "Mais attention car plus nous montons au sommet de la tour et plus la tour me somme d'�tre intransigeant !"}),

	/**
	 * Stage 20's dialog
	 */
	DIALOG_STAGE20(new String[] {"Voici la chute de l'empereur"}),

	/**
	 * Stage 21's dialog
	 */
	DIALOG_STAGE21(new String[] {"Ce n'est malheureusement pas la bonne r�ponse.", "Vous �tes le maillon faible."}),

	/**
	 * Stage 22's dialog
	 */
	DIALOG_STAGE22(new String[] {"Une porte bloque le chemin.", "C'est un �tage de croisement.", "Qu'importe les chemins que tu as emprunt�s, si tu as fait preuve de suffisamment de volont�, tous m�nent � cet �tage.", "La porte restera verrouill�e tant que nous n'aurons pas trouv� le code � 4 couleurs qui change r�guli�rement."}), // PARTIE DE MASTERMIND
	
	
	/**
	 * Stage 23's dialog
	 */
	DIALOG_STAGE23(new String[] {"VICTOIRE TU AS ATTEINT LE HAUT DE LA TOUR!!"}), 
	
	/**
	 * Final stage. Stage never played
	 */
	DIALOG_STAGE24(new String[] {}); 


	/**
	 * Text to make the choice
	 */
	private String[] dialog;

	/**
	 * Creates a dialog
	 * @param initialDialog
	 * 			Text of the dialog
	 */
	private Dialog(String[] initialDialog)
	{
		this.dialog = initialDialog;
	}

	/**
	 *
	 */
	public String toString()
	{
		String result = "";
		for(int index = 0; index < this.dialog.length; index++)
			result += this.dialog[index] + "\n";
		return result;
	}

}
