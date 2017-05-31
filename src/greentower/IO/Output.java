package greentower.IO;

import greentower.core.Dialog;

/**
 * Interface for all displaying
 * @author 
 *
 */
public interface Output {

	/**
	 * Show question or explanation
	 * @param dialog
	 */
	public void showDialog(Dialog dialog);
	
	/**
	 * Display the given String
	 * @param str
	 */
	public void showText(String str);
	
	/**
	 * Display the game
	 */
	public void showGame();
	
	/**
	 * Display the given String array
	 * @param answers
	 */
	public void showAnswers(String[] answers);

	// Used only in Pendu game, implementation in other games should be void
	/**	 * @param nbCoups	 * @param motATrouver	 */	public void notifyWin(int nbCoups, String motATrouver);
	/**	 * 	 */	public void erreurLettre();
	/**	 * @param motATrouver	 */	public void notifyLoose(String motATrouver);
	/**	 * 	 */	public void demanderCaractere();
	/**	 * @param nbErreur	 * @param motAAfficher	 */	public void afficherPendu(int nbErreur, String motAAfficher);	/**	 * Show the introduction message of the given stage index	 * @param stageIndex	 * 			Stage's index	 */	public void showStageIntroduction(int stageIndex);	/**	 * Show the end message of the given stage index	 * @param stageIndex	 * 			Stage's index	 */	public void showStageEnd(int stageIndex);
}
