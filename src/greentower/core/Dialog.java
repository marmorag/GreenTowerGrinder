package greentower.core;

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
	DIALOG_STAGE1(new String [] {"Bonjour jeune graine. Je suis Sativa, gardien de cette tour et protecteur de son trésor . Aujourd’hui,  je vais te guider à travers ton dangereux périple. Pour commencer, entre ton nom."}),

	/**
	 * Stage 2's dialog
	 */
	DIALOG_STAGE2(new String[] {"Bravo ! Comme tu peux le voir, tu es monté d’un étage ! Le premier d’une longue série. Je vais maintenant t’expliquer les règles qui régissent cette tour. C’est une tour magique qui évolue en fonction des choix des aventuriers. Ses chemins te conduiront à la gloire ou à la désolation. Chaque niveau comprend une épreuve et tu devras triompher de toutes celles-ci pour avancer ! Compris ? "}),

	/**
	 * Stage 3's dialog
	 */
	DIALOG_STAGE3(new String[] {"Commençons de suite si tu le veux bien. Je vais te poser une énigme et de ta réponse dépendra la suite de ta quête . Je suis en tête de file mais à bout de nerf. Qui suis-je ?"}),

	/**
	 * Stage 4's dialog
	 */
	DIALOG_STAGE4(new String[] {"Bravo ! Mais maintenant que j’ai testé ton intelligence, je vais mesurer ta chance. Car il faut bien avouer que dans la vie la chance occupe une grande place."}), // PARTIE LESS OR MORE

	/**
	 * Stage 5's dialog
	 */
	DIALOG_STAGE5(new String[] {"Désolé mais c'était la mauvaise réponse. Mais je ne peux uniquement juger ton intelligence sur une énigme. C’est pourquoi nous allons passer à la pratique."}), // PARIE DE TIC TAC TOE

	/**
	 * Stage 6's dialog
	 */
	DIALOG_STAGE6(new String[] {"Serais-tu l’élu ? Alliant intelligence et chance afin de vaincre les forces du mal ? Je me dois de vérifier. Réponds à cette énigme ! Combien y a-t-il de carrés en tout ? "}),

	/**
	 * Stage 7's dialog
	 */
	DIALOG_STAGE7(new String[] {"Tu manques de chance et je ne peux te blamer. Tu n’es certe pas l’élu mais cela ne t’empêchera pas de pouvoir monter au sommet. Le chemin sera juste plus difficile. En parlant de difficulté, connais-tu le rush hour ? Viens donc faire une partie !"}), // PARTIE RUSH HOUR

	/**
	 * Stage 8's dialog
	 */
	DIALOG_STAGE8(new String[] {"Bien bien. Parfois on dit qu’il faut savoir tout recommencer pour mieux repartir. Retourne donc au début de la tour et cette fois-ci, n'échoue pas ! "}),

	/**
	 * Stage 9's dialog
	 */
	DIALOG_STAGE9(new String[] {"Phénoménal ! Tu es le meilleur aventurier que je n'ai jamais rencontré ! Prends donc ce passage secret, il emmène directement en haut de la tour ou bien laisse le temps faire les choses et continue normalement ton ascension ! "}),

	/**
	 * Stage 10's dialog
	 */
	DIALOG_STAGE10(new String[] {"Oh … On dirait que je me suis emporté dans des conclusions hâtives ! Tu n’es pas l’élu, mais tu peux tout de même me surprendre et réussir. "}),

	/**
	 * Stage 11's dialog
	 */
	DIALOG_STAGE11(new String[] {"Bravo ! Tu nous as sortis d’un sacré embouteillage ! D’ailleurs sais tu comment éviter les embouteillages ?"}),

	/**
	 * Stage 12's dialog
	 */
	DIALOG_STAGE12(new String[] {"Il faut se méfier des chemins trop simples ! Voici ta punition !"}),

	/**
	 * Stage 13's dialog
	 */
	DIALOG_STAGE13(new String[] {"C’est très bien . Maintenant assied-toi et prend un thé."}), // PARTIE OTHELLO

	/**
	 * Stage 14's dialog
	 */
	DIALOG_STAGE14(new String[] {"Non il faut rouler à vitesse constante ! Faisons une partie de Shifumi pour décider de ton sort ! "}), // PARTIE SHIFUMI

	/**
	 * Stage 15's dialog
	 */
	DIALOG_STAGE15(new String[] {"Quel jeu relaxant ! ZzzzzZzzzzZZzzzzzzZZZzzzZzzzZzzzzZZzzzZzzzzZZZZzzzzZzz …. Que faire ?"}),

	/**
	 * Stage 16's dialog
	 */
	DIALOG_STAGE16(new String[] {"Il ne faut pas confondre vitesse et précipitation mon jeune ami ! Je suis un homme , je suis une femme . Je ne suis ni un homme ni une femme. Qui suis-je ?"}),

	/**
	 * Stage 17's dialog
	 */
	DIALOG_STAGE17(new String[] {"Oui pardon ! Heureusement que tu m’as réveillé car sinon nous aurions été dans de beaux draps ! Continuons ?"}),

	/**
	 * Stage 18's dialog
	 */
	DIALOG_STAGE18(new String[] {"Vous vous endormez et sentez du mouvement durant votre sommeil."}),

	/**
	 * Stage 19's dialog
	 */
	DIALOG_STAGE19(new String[] {"Bien . Comme tu as gagné je vais te laisser une chance ! Mais attention car plus nous montons au sommet de la tour et plus la tour me somme d’être intransigeant !"}),

	/**
	 * Stage 20's dialog
	 */
	DIALOG_STAGE20(new String[] {"Voici la chute de l’empereur"}),

	/**
	 * Stage 21's dialog
	 */
	DIALOG_STAGE21(new String[] {"Ce n’est malheureusement pas la bonne réponse. Vous êtes le maillon faible."}),

	/**
	 * Stage 22's dialog
	 */
	DIALOG_STAGE22(new String[] {"Garde courage, l'épreuve continue !"}),

	/**
	 * Stage 23's dialog
	 */
	DIALOG_STAGE23(new String[] {"Une porte bloque le chemin. C’est un étage de croisement. Qu’importe les chemins que tu as empruntés, si tu as fait preuve de suffisamment de volonté, tous mènent à cet étage. La porte restera verrouillée tant que nous n’aurons pas trouvé le code qui change régulièrement."}); // PARTIE DE MASTERMIND


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
		String result = null;
		for(int index = 0; index < this.dialog.length; index++)
			result += this.dialog[index] + "\n";
		return result;
	}

}
