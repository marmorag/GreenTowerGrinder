package greentower.minigames.othello.player.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import greentower.minigames.othello.core.Position;
import greentower.minigames.othello.core.exceptions.InvalidStringToPositionException;
import greentower.minigames.othello.player.Player;

/**
 * This class enables a othello's player to make action
 *
 * @author florent.viogne
 *
 */
public class ConsolePlayer implements Player
{
	/**
	 * Default constructor
	 */
	public ConsolePlayer()
	{

	}

	/**
	 * Input Stream
	 */
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Enable physic player to ask a position
	 * @return
	 * 			The asked position
	 */
	public Position askForPosition()
	{
		String str = "";

		try
		{
			str = this.br.readLine();
		}
		catch (IOException e)
		{
			System.err.println("IOException in askForPosition");
		}

		try
		{
			return Position.parsePosition(str);
		}
		catch (InvalidStringToPositionException e)
		{
			System.out.println("Invalid input. Expected format : line-column (ex: 5-3)");
			return this.askForPosition();
		}
	}
}
