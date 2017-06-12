package greentower.IO;

import greentower.stage.minigames.rushhour.GameBoard;
import greentower.stage.minigames.shifumi.Sign;
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
	public void showDialog(String dialog);
	/**
	 * Display the given String
	 * @param str
	 */
	public void showText(String str);	/**	 * Display the message error 	 * @param str	 */	public void showError(String str);
	/**
	 * Display the given String array
	 * @param answers
	 */

	/**
	 * Display the given answer
	 * @param answers
	 */
	public void showAnswers(String answers);
	// Used only in Pendu game, implementation in other games should be void
	/**	 * @param nbCoups	 * @param motATrouver	 */	public void notifyWin(int nbCoups, String motATrouver);
	/**	 * 	 */	public void letterError();
	/**	 * @param motATrouver	 */	public void notifyLoose(String motATrouver);
	/**	 * 	 */	public void getChar();	/**	 * Show the introduction message of the given stage index	 * @param stageIndex	 * 			Stage's index	 */	public void showStageIntroduction(int stageIndex);	/**	 * Show the end message of the given stage index	 * @param stageIndex	 * 			Stage's index	 */	public void showStageEnd(int stageIndex);	/**	 * @param grid	 */	public void gambling(int[] grid);	/**	 * @param face	 */	public void HeadsOrTails(int face);		/**	 * @param number	 */	public void LessOrMore(int number);		/**	 * 	 */	public void MasterMind();		/**	 * 	 */	public void Othello();		/**	 * @param player	 * @param random	 */	public void ShiFuMi(Sign player, Sign random);		/**	 * @param nb1	 * @param nb2	 * @param nb3	 * @param nb4	 */	public void Suite(int nb1, int nb2, int nb3, int nb4);		/**	 * @param grid	 */	public void TicTacToe(int[][] grid);	/**	 * @param result	 */	void showMiniGameResult(int result);	/**	 * 	 */	void showPrompt();		/**	 * @param board	 */	public void showRushHourBoard(GameBoard board);	/**	 * @param errorNumber	 * @param wordToDisplay	 */	public void showPendu(int errorNumber, String wordToDisplay);
}
