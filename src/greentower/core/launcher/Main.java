package greentower.core.launcher;

import greentower.IO.OutputConsole;
import greentower.core.Game;
import greentower.core.Player;
import greentower.core.Tower;

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
		@SuppressWarnings("unused")
		Tower tower = new Tower(ListOfStages.stages, ListOfStages.nextStages);
		new Game(new Player("Coucou"), new OutputConsole()).play();

	}
}
