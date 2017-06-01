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
		public void win();	public void loose();
	
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
	/**	 * @param nbErreur	 * @param motAAfficher	 */	public void afficherPendu(int nbErreur, String motAAfficher);	/**	 * Show the introduction message of the given stage index	 * @param stageIndex	 * 			Stage's index	 */	public void showStageIntroduction(int stageIndex);	/**	 * Show the end message of the given stage index	 * @param stageIndex	 * 			Stage's index	 */	public void showStageEnd(int stageIndex);	public void gambling();	public void HeadsOrTails();		public void LessOrMore();		public void MasterMind();		public void Othello();		public void ShiFuMi();		public void Suite();		public void TicTacToe();
}
