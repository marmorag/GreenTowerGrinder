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

	// Used only in Pendu game, implementation in other games should be void
	public void notifyWin(int nbCoups, String motATrouver);
	public void erreurLettre();
	public void notifyLoose(String motATrouver);
	public void demanderCaractere();
	public void afficherPendu(int nbErreur, String motAAfficher);

}
