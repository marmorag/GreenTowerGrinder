package greentower.core.launcher;import java.io.FileNotFoundException;import greentower.IO.InputConsole;import greentower.IO.OutputConsole;import greentower.core.Game;import greentower.core.exception.InvalidSyntaxInFileException;import greentower.core.scenario.Scenario;import greentower.core.scenario.ScenarioParser;

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
		// Game v1.0		// TODO CAUTION fix to switch statement in choice DISCUSS
		System.out.println("****** BIENVENUE DANS THE GREEN TOWER GRINDER ******");		ScenarioParser scenarioParser;		try		{			scenarioParser = new ScenarioParser("scenario/scenario1.txt");			Scenario scenario = scenarioParser.getScenario();			OutputConsole out = new OutputConsole();						System.out.println("ici");			new Game("Coucou",scenario , out, new InputConsole()).play();			} catch (FileNotFoundException e)		{			// TODO Auto-generated catch block			e.printStackTrace();		} catch (InvalidSyntaxInFileException e)		{			// TODO Auto-generated catch block			e.printStackTrace();		}					
	}
}
