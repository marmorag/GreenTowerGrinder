package greentower.core.launcher;

import greentower.IO.OutputConsole;
import greentower.core.ListOfStages;

/**
 * Main class of the game.
 * Entry point of the application.
 * @author Florent
 *
 */
public class TestOneStage
{
	/**
	 * Entry point
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("****** BIENVENUE DANS LE TEST ******");
		try
		{
			ListOfStages.getStageAt(12).playStage(new OutputConsole());
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
