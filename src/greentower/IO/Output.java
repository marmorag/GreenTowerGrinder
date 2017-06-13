package greentower.IO;

import greentower.stage.minigames.mastermind.Checker;
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
	/**
	 * Notify the player if he wins	 * @param nbTurns	 * @param wordToFind	 */
	public void notifyWin(int nbTurns, String wordToFind);
	/**	 * Notify the player if he entries a wrong letter	 */	public void letterError();
	/**	 * @param wordToFind	 */
	public void notifyLoose(String wordToFind);
	/**	 * Notify player that he has to enter a character	 */	public void getChar();	/**	 * Show the introduction message of the given stage index	 * @param stageIndex	 * 			Stage's index	 */	public void showStageIntroduction(int stageIndex);
		/**	 * Show the end message of the given stage index	 * @param stageIndex	 * 			Stage's index	 */	public void showStageEnd(int stageIndex);	/**
	 * Display a gambling machine game	 * @param grid	 */	public void gambling(int[] grid);	/**
	 * Display a Heads Or Tails game	 * @param face	 */	public void HeadsOrTails(int face);		/**
	 * Display a Less Or More game	 * @param number	 */	public void LessOrMore(int number);		/**	 * Display a mastermind game	 */	public void MasterMind();		/**	 * Display a Othello game	 */	public void Othello();		/**
	 * Display a Shi Fu Mi game	 * @param player	 * @param random	 */	public void ShiFuMi(Sign player, Sign random);		/**
	 * Display a Suite game	 * @param nb1	 * @param nb2	 * @param nb3	 * @param nb4	 */	public void Suite(int nb1, int nb2, int nb3, int nb4);		/**
	 * Display a Tic Tac Toe game	 * @param grid	 */	public void TicTacToe(int[][] grid);	/**
	 * Display the result of the game	 * @param result	 */	void showMiniGameResult(int result);	/**	 * Display a prompt (">")	 */	void showPrompt();		/**
	 * Display RushHourGame board	 * @param board	 */	public void showRushHourBoard(GameBoard board);	/**
	 * Display a hangman game	 * @param errorNumber	 * @param wordToDisplay	 */	public void showHangman(int errorNumber, String wordToDisplay);
}
