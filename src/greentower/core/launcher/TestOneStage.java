package greentower.core.launcher;

import greentower.IO.InputConsole;
import greentower.IO.OutputConsole;
import greentower.core.scenario.Scenario;

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
			int stageResult = Scenario.getStageAt(22).playStage(new OutputConsole(), new InputConsole());
			Scenario.getStageAt(Scenario.getNextStages(Scenario.getStageAt(22).getIndex(), stageResult).playStage(new OutputConsole(), new InputConsole()));
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
