package greentower.core.launcher;

import greentower.IO.InputConsole;
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
			ListOfStages.getStageAt(6).playStage(new OutputConsole(), new InputConsole());
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
