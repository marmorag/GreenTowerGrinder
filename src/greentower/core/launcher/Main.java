package greentower.core.launcher;

import greentower.core.Game;
import greentower.core.Player;
import greentower.display.OutputConsole;

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
		System.out.println("****** BIENVENUE DANS THE GREEN TOWER GRINDER ******");
		new Game(new Player("Coucou"), new OutputConsole()).play();
	}

}
