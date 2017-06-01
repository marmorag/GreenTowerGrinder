package greentower.IO;

import greentower.core.Answers;import greentower.core.Dialog;import greentower.minigames.othello.core.Board;import greentower.minigames.rushhour.GameBoard;import greentower.minigames.shifumi.Sign;

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
	public void showText(String str);	/**	 * Display the message error 	 * @param str	 */	public void showError(String str);
	/**
	 * Display the given String array
	 * @param answers
	 */
	public void showAnswers(Answers answers);

	// Used only in Pendu game, implementation in other games should be void
	/**	 * @param nbCoups	 * @param motATrouver	 */	public void notifyWin(int nbCoups, String motATrouver);
	/**	 * 	 */	public void erreurLettre();
	/**	 * @param motATrouver	 */	public void notifyLoose(String motATrouver);
	/**	 * 	 */	public void demanderCaractere();
	/**	 * @param nbErreur	 * @param motAAfficher	 */	public void showPendu(int nbErreur, String motAAfficher);	/**	 * Show the introduction message of the given stage index	 * @param stageIndex	 * 			Stage's index	 */	public void showStageIntroduction(int stageIndex);	/**	 * Show the end message of the given stage index	 * @param stageIndex	 * 			Stage's index	 */	public void showStageEnd(int stageIndex);	/**	 * @param grid	 */	public void gambling(int[] grid);	/**	 * @param face	 */	public void HeadsOrTails(int face);		/**	 * @param number	 */	public void LessOrMore(int number);		/**	 * 	 */	public void MasterMind();		/**	 * 	 */	public void Othello();		/**	 * @param player	 * @param random	 */	public void ShiFuMi(Sign player, Sign random);		/**	 * @param nb1	 * @param nb2	 * @param nb3	 * @param nb4	 */	public void Suite(int nb1, int nb2, int nb3, int nb4);		/**	 * @param grid	 */	public void TicTacToe(int[][] grid);	/**	 * @param result	 */	void showMiniGameResult(int result);	/**	 * 	 */	void showPrompt();	/**	 * @param board	 */	void showRushHourBoard(GameBoard board);
}
