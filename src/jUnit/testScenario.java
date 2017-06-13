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
 * Tests the class /GreenTowerGrinder/src/greentower/core/scenario/Scenario.java
 *
 */
public class testScenario {

	/**
	 * @throws InvalidSyntaxInFileException
	 * @throws FileNotFoundException
	 *
	 */
	@Test
	public void TestgetNextStages() throws FileNotFoundException, InvalidSyntaxInFileException {

		ScenarioParser scenarioParser = new ScenarioParser("scenario/scenario1.txt"); //$NON-NLS-1$
		Scenario scenario = scenarioParser.getScenario();
		int currentStage;
		int lastResult;
		int res;

		
		//test n°2
		currentStage = 2;
		//cas 1
		lastResult = 0;
		res = 3;
		assertEquals("L'étage 2 abouti au 3 si la réponse est 0",scenario.getNextStages(currentStage, lastResult),scenario.getStageAt(res)); //$NON-NLS-1$
		assertEquals("",scenario.getNextStages(currentStage, lastResult).getIndex(),res);
		//cas 2
		lastResult = 1;
		res = 4;
		assertEquals("L'étage 2 abouti au 4 si la réponse est 1",scenario.getNextStages(currentStage, lastResult),scenario.getStageAt(res)); //$NON-NLS-1$
		assertEquals("",scenario.getNextStages(currentStage, lastResult).getIndex(),res);
		
		
		//test n°3
		currentStage = 3;
		//cas 1 
		lastResult = 0;
		res = 5;
		assertEquals("L'étage 3 abouti au 5 si la réponse est 1",scenario.getNextStages(currentStage, lastResult),scenario.getStageAt(res)); //$NON-NLS-1$
		assertEquals("",scenario.getNextStages(currentStage, lastResult).getIndex(),res);
		//cas 2
		lastResult = 1;
		res = 6;
		assertEquals("L'étage 3 abouti au 6 si la réponse est 1",scenario.getNextStages(currentStage, lastResult),scenario.getStageAt(res)); //$NON-NLS-1$
		assertEquals("",scenario.getStageIndex(scenario.getNextStages(currentStage, lastResult)),res);
		
		
		//test n°9
		currentStage = 9;
		//cas 1
		lastResult = 0;
		res = 12;
		assertEquals("L'étage 9 abouti au 12 si la réponse est 0",scenario.getNextStages(currentStage, lastResult),scenario.getStageAt(res)); //$NON-NLS-1$
		assertEquals("",scenario.getNextStages(currentStage, lastResult).getIndex(),res);
		
		
		//test n°15 : test de l'étage 15
		currentStage = 15;
		//cas 1
		lastResult = 0;
		res = 20;
		assertEquals("L'étage 15 abouti au 17 si la réponse est 0",scenario.getNextStages(currentStage, lastResult),scenario.getStageAt(res)); //$NON-NLS-1$
		assertEquals("",scenario.getNextStages(currentStage, lastResult).getIndex(),res);
		//cas 2
		lastResult = 1;
		res = 21;
		assertEquals("L'étage 15 abouti au 18 si la réponse est 1",scenario.getNextStages(currentStage, lastResult).getIndex(),res); //$NON-NLS-1$
		assertEquals("",scenario.getNextStages(currentStage, lastResult).getIndex(),res);	

	}

}
