package greentower.core.launcher;

import greentower.IO.OutputConsole;
import greentower.core.Game;
import greentower.core.ListOfStages;
import greentower.core.Player;
import greentower.core.Stage;
import greentower.core.Tower;

/**
 * Main class of the game.
 * Entry point of the application.
 * @author Florent
 *
 */
public class TestLinkingStages
{
	/**
	 * Entry point
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("****** BIENVENUE DANS THE GREEN TOWER GRINDER ******");
		try
		{
			ListOfStages.getStageAt(0).playStage(new OutputConsole());
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
