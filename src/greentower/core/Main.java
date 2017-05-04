package greentower.core;

import greentower.core.Game;

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
		new Game(new Player("Coucou")).play();
	}

}
