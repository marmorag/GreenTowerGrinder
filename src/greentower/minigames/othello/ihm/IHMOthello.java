package greentower.minigames.othello.ihm;

import greentower.minigames.othello.core.Board;
import greentower.minigames.othello.core.Color;
import greentower.minigames.othello.core.Position;

/**
 * IHM of the othello game
 * @author florent.viogne
 *
 */
public interface IHMOthello
{
	/**
	 * Display a othello game's board
	 * @param theBoard
	 * 			The othello's game board
	 */
	public void displayBoard(Board theBoard);

	/**
	 * Display the othello game's winner
	 * @param winnerColor
	 * 			Winner's color
	 */
	public void displayTheWinner(Color winnerColor);

	/**
	 * Display the introduction of the game
	 */
	public void displayStartOfGame();

	/**
	 * Display the end message of the game
	 */
	public void displayEndOfGame();

	/**
	 * Display the number of pawns of each color
	 * @param theBoard
	 * 			The othello's game board
	 */
	public void displayGameResults(Board theBoard);

	/**
	 * Display a position
	 * @param thePosition
	 * 			The position
	 */
	public void displayPosition(Position thePosition);

	/**
	 * Display the message to the player to say him he can play
	 * @param currentPlayerColor
	 * 			The current player's color
	 */
	public void displayInvitationForPosition(Color currentPlayerColor);

	/**
	 * Display the message when a new round starts with given color and given round number
	 * @param currentPlayerColor
	 * 			The current playr's color
	 * @param numberOfRound
	 * 			Round number
	 */
	public void displayStartOfRound(Color currentPlayerColor, int numberOfRound);

	/**
	 * Display the message when a round ends with given color and given round number
	 * @param numberOfRound
	 * 			Round number
	 */
	public void displayEndOfRound(int numberOfRound);

	/**
	 * Display a error message when user ask for an impossible position
	 * @param askedPosition
	 * 			The asked position
	 * @param currentPlayerColor
	 *			The current player's color
	 */
	public void displayActionNotValid(Position askedPosition, Color currentPlayerColor);

	/**
	 * Display the number of pawns of the given color
	 * @param numberOfPawns
	 * 			The number of pawns with pawnColor
	 * @param pawnColor
	 *			The pawn's color
	 */
	void displayResult(int numberOfPawns, Color pawnColor);

}
