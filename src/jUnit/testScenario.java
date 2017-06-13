package jUnit;

import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import org.junit.Test;
import greentower.core.exception.InvalidSyntaxInFileException;
import greentower.core.scenario.Scenario;
import greentower.core.scenario.ScenarioParser;

/**
 * @author Axelle Delomez
 *
 */
public class testScenario {

	/**
	 * @throws InvalidSyntaxInFileException
	 * @throws FileNotFoundException
	 *
	 */
	@Test
	public static void TestgetNextStages() throws FileNotFoundException, InvalidSyntaxInFileException {
		//fail("Not yet implemented");
		ScenarioParser scenarioParser = new ScenarioParser("scenario/scenario1.txt"); //$NON-NLS-1$
		Scenario scenario = scenarioParser.getScenario();
		int currentStage;
		int lastResult;
		int res;

		//test n°1 : test de l'étage 15
		currentStage = 15;


		//cas 1
		lastResult = 0;
		res = 17;

		assertEquals("L'étage 15 abouti au 17 si la réponse est 0",scenario.getNextStages(currentStage, lastResult),scenario.getStageAt(res)); //$NON-NLS-1$

		//cas 2
		lastResult = 1;
		res = 18;

		assertEquals("L'étage 15 abouti au 18 si la réponse est 1",scenario.getNextStages(currentStage, lastResult),scenario.getStageAt(res)); //$NON-NLS-1$






	}

}
