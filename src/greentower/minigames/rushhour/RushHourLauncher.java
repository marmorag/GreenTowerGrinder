package greentower.minigames.rushhour;
/**
 *
 * Launcher of the game
 *
 * @author gavinr
 *
 */
public class RushHourLauncher
{
	/**
	 *
	 * Instantiate a new game and launch it
	 *
	 * @param args command-line arguments (unused)
	 *
	 */
	public static void main(String[] args)
	{
		RushHourGame game = new RushHourGame(new ConsolePlayer("Clement"), 2, new ConsoleDisplay());
		//RushHourGame game = new RushHourGame(new ConsolePlayer("Clement"), 1, new GraphicDisplay());
		//game.win();
		game.play();
	}
}
