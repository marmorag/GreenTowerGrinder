package greentower.minigames.othello.launcher;

import greentower.minigames.othello.core.OthelloGame;
import greentower.minigames.othello.ihm.IHMOthello;
import greentower.minigames.othello.ihm.console.IHMOthelloConsole;
import greentower.minigames.othello.player.Player;
import greentower.minigames.othello.player.console.ConsolePlayer;

/**
 * Main class. Class to play a othello game.
 *
 * @author florent.viogne
 *
 */
public class MainConsolePlayerConsoleDisplay
{
	/**
	 * Entry point of the application
	 *
	 * @param args
	 * 			Required parameter
	 */
	public static void main(String[] args)
	{
		Player[] players = {new ConsolePlayer(), new ConsolePlayer()};
		IHMOthello IHM = new IHMOthelloConsole();

		new OthelloGame(players, IHM).play();
	}
}
