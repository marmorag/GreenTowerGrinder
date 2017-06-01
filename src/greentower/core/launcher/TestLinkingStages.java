package greentower.core.launcher;

import greentower.IO.InputConsole;
import greentower.IO.OutputConsole;
import greentower.core.ListOfStages;
import greentower.core.Stage;

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
			Stage currentStage = ListOfStages.getStageAt(1);
			while(true)
			{
				int result = currentStage.playStage(new OutputConsole(), new InputConsole());
				currentStage = ListOfStages.getNextStages(ListOfStages.getStageIndex(currentStage), result);
			}
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
