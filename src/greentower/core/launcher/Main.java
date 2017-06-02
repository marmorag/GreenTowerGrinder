package greentower.core.launcher;

import greentower.IO.OutputGraphic;
import greentower.core.Game;
import greentower.core.Player;

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
		System.out.println("****** BIENVENUE DANS THE GREEN TOWER GRINDER ******");
		new Game(new Player("Coucou"), new OutputGraphic(), true).play();
		//new OutputGraphic();
	}
}
