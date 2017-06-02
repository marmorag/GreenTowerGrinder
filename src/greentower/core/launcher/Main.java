package greentower.core.launcher;

import java.io.PrintStream;

import greentower.IO.OutputConsole;
import greentower.core.Game;
import greentower.core.Player;
import greentower.ihm.Console;

/**
 * Main class of the game.
 * Entry point of the application.
 * @author Florent
 *
 */
public class Main
{
	/**
	 * Entry point
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Game v1.0
		PrintStream out = new PrintStream( new Console( Console.console ) );

		System.setOut( out );


		System.setErr( out );


		System.out.println("****** BIENVENUE DANS THE GREEN TOWER GRINDER ******");
		new Game(new Player("Coucou"), new OutputConsole(), false).play();
	}
}
