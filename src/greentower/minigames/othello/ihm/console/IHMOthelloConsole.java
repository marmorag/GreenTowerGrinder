package greentower.minigames.othello.ihm.console;

import greentower.minigames.othello.core.Board;
import greentower.minigames.othello.core.Color;
import greentower.minigames.othello.core.Position;
import greentower.minigames.othello.ihm.IHMOthello;

/**
 * This class implements IHMOthello. That's a console display of Othello
 * @author florent.viogne
 *
 */
public class IHMOthelloConsole implements IHMOthello
{
	/**
	 * IHMOthelloConsole's constructor
	 */
	public IHMOthelloConsole()
	{

	}

	@Override
	public void displayTheWinner(Color winnerColor)
	{
		if(winnerColor == Color.EMPTY)
			System.out.println("THERE IS NO WINNER // TIE");
		else
			System.out.println("THE WINNER OF THE GAME IS " + winnerColor + " PLAYER");

	}

	@Override
	public void displayBoard(Board theBoard)
	{
		System.out.println(theBoard);
	}

	@Override
	public void displayStartOfGame()
	{
		System.out.println("***************************************************");
		System.out.println("-------------- START OF OTHELLO GAME --------------");
		System.out.println("***************************************************\n");
	}

	@Override
	public void displayEndOfGame()
	{
		System.out.println("\n***************************************************");
		System.out.println("--------------- END OF OTHELLO GAME ---------------");
		System.out.println("***************************************************");
	}

	@Override
	public void displayGameResults(Board theBoard)
	{
		System.out.println("White player have " + theBoard.numberOfPawns(Color.WHITE) + "pawns");
		System.out.println("Black player have " + theBoard.numberOfPawns(Color.BLACK) + "pawns");
	}

	@Override
	public void displayPosition(Position thePosition)
	{
		System.out.println(" The position asked is" + thePosition + "\n");
	}

	@Override
	public void displayInvitationForPosition(Color currentPlayerColor)
	{
		System.out.println("Please enter a position where to place a " + currentPlayerColor + " pawn. "
				+ "Expected format : line-column (ex: 5-3)");
	}

	@Override
	public void displayStartOfRound(Color currentPlayerColor, int numberOfRound)
	{
		System.out.println(" >> START OF ROUND N°" + numberOfRound + " // " + currentPlayerColor + " player has to play" + "\n");

	}

	@Override
	public void displayEndOfRound(int numberOfRound)
	{
		System.out.println(" >> END OF ROUND N°" + numberOfRound);
		System.out.println("---------------------------------------------");
	}

	@Override
	public void displayActionNotValid(Position askedPosition, Color currentPlayerColor)
	{
		System.out.println("Impossible to put a " + currentPlayerColor + " pawn at the position " + askedPosition);

	}

	@Override
	public void displayResult(int numberOfPawns, Color pawnColor)
	{
		System.out.println("" + pawnColor + " player have " + numberOfPawns + " pawns.");

	}
}
