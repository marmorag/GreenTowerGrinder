package greentower.stage.minigames.othello.player.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import greentower.IO.Output;
import greentower.stage.minigames.othello.core.Position;
import greentower.stage.minigames.othello.core.exceptions.InvalidStringToPositionException;
import greentower.stage.minigames.othello.player.Player;

/**
 * This class enables a othello's player to make action
 *
 * @author florent.viogne
 *
 */
public class ConsolePlayer implements Player
{
	/**
	 * Input Stream
	 */
	private BufferedReader br;
	/**
	 * Default constructor
	 */
	public ConsolePlayer()
	{
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * Enable physic player to ask a position
	 * @param display 
	 * @return
	 * 			The asked position
	 */
	public Position askForPosition(Output display)
	{
		String str = "";

		try
		{
			display.showPrompt();
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
			return this.askForPosition(display);
		}
	}
}
