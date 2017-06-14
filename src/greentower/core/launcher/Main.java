package greentower.core.launcher;import java.io.FileNotFoundException;import greentower.IO.InputGraphic;import greentower.IO.OutputGraphic;import greentower.core.Game;import greentower.core.exception.InvalidSyntaxInFileException;import greentower.core.scenario.Scenario;import greentower.core.scenario.ScenarioParser;

/**
 * Main class of the game.
 * Entry point of the application. The game is launched in graphical mode
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
	{		ScenarioParser scenarioParser;		try		{			scenarioParser = new ScenarioParser("/scenario/scenario1.txt");			Scenario scenario = scenarioParser.getScenario();			OutputGraphic out = new OutputGraphic();						Game game = new Game(scenario , out, new InputGraphic(out)) ;			game.play();			} 		catch (FileNotFoundException e)		{			e.printStackTrace();		} 		catch (InvalidSyntaxInFileException e)		{			e.printStackTrace();		}
	}
}
