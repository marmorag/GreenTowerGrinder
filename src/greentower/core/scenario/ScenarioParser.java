package greentower.core.scenario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import greentower.core.exception.InvalidSyntaxInFileException;
import greentower.stage.Stage;
import greentower.stage.choice.Choice;
import greentower.stage.minigames.lessormore.LessOrMore;
import greentower.stage.minigames.mastermind.MasterMind;
import greentower.stage.minigames.othello.core.OthelloGame;
import greentower.stage.minigames.rushhour.RushHourGame;
import greentower.stage.minigames.shifumi.Shifumi;
import greentower.stage.minigames.tictactoe.TicTacToe;

/**
 * This class is a tool to parse Scenario from file and compose Scenario to file
 * @author Guillaume
 */
public final class ScenarioParser
{

	/**
	 * The buffered reader used to read the file
	 */
	BufferedReader inputTool;
	
	/**
	 * The parsed scenario is build on constructor's call
	 */
	Scenario parsedScenario;
	
	/**
	 * Default constructor, get a path and build the Scenario from it
	 * The syntax of the file should be :
	 * 
	 * <scenario>
	 * n => where n is the number of stage
	 * <dialog>
	 * dialog in simple text, a \n is symbolized by §
	 * </dialog>
	 * <answer>
	 * answer in simple text each answer of the same stage is separate by §
	 * </answer>
	 * <stage>
	 * the name of the stage, could be : choice mastermind othello tictactoe shifumi lessormore rushhour
	 * </stage>
	 * <link>
	 * n§n where n is the stage number, § the separator
	 * </link>
	 * </scenario>
	 * 
	 * @param path The path for the Scenario to parse
	 * @throws FileNotFoundException Is thrown if the given path is incorrect
	 * @throws InvalidSyntaxInFileException 
	 */
	public ScenarioParser(String path) throws FileNotFoundException, InvalidSyntaxInFileException
	{
		this.inputTool = new BufferedReader(new FileReader(new File(path)));
		this.parsedScenario = this.parseScenarioAt(path);
	}
	
	/**
	 * This method parse a Scenario from the given path
	 * @param path String the path of the scenario to parse
	 * @return Scenario the scenario parsed from the file
	 * @throws InvalidSyntaxInFileException 
	 */
	private Scenario parseScenarioAt(String path) throws InvalidSyntaxInFileException
	{
		String currentLine = "";
		
		// variable relative to the scenario to return
		String[] dialog = null;
		String[] answer = null;
		int[][] link = null;
		Stage[] listOfStage = null;
		Scenario scenarioToReturn;
		
		try
		{
			currentLine = inputTool.readLine();
			
				// recupere le nombre d'etage
				currentLine = inputTool.readLine();
				int numberOfStage = Integer.parseInt(currentLine);
				
				// cursor should be at <dialog>
				// recupere les attributs de construction d'un scenario 
				dialog = this.getDialog(numberOfStage);
				//cursor should be at <answer>
				answer = this.getAnswer(numberOfStage);
				// cursor should be at <stage>
				listOfStage = this.getListOfStage(numberOfStage, answer, dialog);
				// cursor should be at <link>
				link = this.getLink(numberOfStage);
				// cursor should be at </scenario>
				
				
			scenarioToReturn = new Scenario(listOfStage, link, dialog, answer);
			return scenarioToReturn;
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * This method build the list of the stage contained in the file
	 * @param numberOfStage The number of stage
	 * @param answer The answer array used to build each Stage
	 * @param dialog The dialog array used to build each Stage
	 * @return Stage[] The Stage array builded from the input file
	 * @throws InvalidSyntaxInFileException 
	 */
	private Stage[] getListOfStage(int numberOfStage, String[] answer, String[] dialog) throws InvalidSyntaxInFileException
	{
		try
		{
			Stage[] result = new Stage[numberOfStage];
			String currentLine = this.inputTool.readLine();
			int stageCounter = 0;
			
			while(!currentLine.equalsIgnoreCase("</stage>"))
			{
				if(currentLine.equalsIgnoreCase("<stage>"))
					currentLine = inputTool.readLine();
				else
				{
					switch (currentLine)
					{
						case "choice":
							result[stageCounter] = new Choice(answer[stageCounter],dialog[stageCounter], stageCounter);
							break;
						case "othello":
							result[stageCounter] = new OthelloGame(dialog[stageCounter], stageCounter);
							break;
						case "mastermind":
							result[stageCounter] = new MasterMind(dialog[stageCounter], stageCounter);
							break;
						case "tictactoe":
							result[stageCounter] = new TicTacToe(dialog[stageCounter], stageCounter);
							break;
						case "rushhour":
							result[stageCounter] = new RushHourGame(dialog[stageCounter], stageCounter);
							break;
						case "shifumi":
							result[stageCounter] = new Shifumi(dialog[stageCounter], stageCounter);
							break;
						case "lessormore":
							result[stageCounter] = new LessOrMore(dialog[stageCounter], stageCounter);
							break;
						default:
							throw new InvalidSyntaxInFileException("Exception during listOfStage build");							
					}
					currentLine = inputTool.readLine();
					stageCounter++;
				}
			}
			return result;
		} 
		catch (IOException e)
		{
			System.err.println("Exception during listOfStage build");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This method build the link matrix which contained the logical link of each stage
	 * @param numberOfStage The number of stage
	 * @return	int[][] The builded matrix of logical link
	 */
	private int[][] getLink(int numberOfStage)
	{
		try
		{
			int[][] result = new int[numberOfStage][4];
			String currentLine = this.inputTool.readLine();
			String[] parsedLine;
			int stageCounter = 0;
			
			while(!currentLine.equalsIgnoreCase("</link>"))
			{
				if (currentLine.equalsIgnoreCase("<link>"))
					currentLine = inputTool.readLine();
				else
				{
					parsedLine = currentLine.split("§");
					
					for(int i = 0; i < parsedLine.length;i++)
					{
						result[stageCounter][i] = Integer.parseInt(parsedLine[i]);
					}
					
					currentLine = inputTool.readLine();
					stageCounter++;
				}				
			}
			return result;
		} 
		catch (IOException e)
		{
			System.err.println("Exception during answer build");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This method build the answer array from the file
	 * @param numberOfStage int The number of stage
	 * @return String[] The string array of answer
	 */
	private String[] getAnswer(int numberOfStage)
	{
		try
		{
			String[] result = new String[numberOfStage];
			String currentLine = this.inputTool.readLine();
			int stageCounter = 0;
			
			while(!currentLine.equalsIgnoreCase("</answer>"))
			{
				if (currentLine.equalsIgnoreCase("<answer>"))
					currentLine = inputTool.readLine();
				else
				{
					result[stageCounter] = currentLine.replace('§', '\n');
					
					currentLine = inputTool.readLine();
					stageCounter++;
				}
			}
			return result;
		} 
		catch (IOException e)
		{
			System.err.println("Exception during answer build");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This method build the dialog array from the file
	 * @param numberOfStage int The number of stage
	 * @return String[] The string array of dialog
	 */
	private String[] getDialog(int numberOfStage)
	{
		try
		{
			String[] result = new String[numberOfStage];
			String currentLine = this.inputTool.readLine();
			int stageCounter = 0;
			
			while(!currentLine.equalsIgnoreCase("</dialog>"))
			{
				if (currentLine.equalsIgnoreCase("<dialog>") || stageCounter >= numberOfStage)
					currentLine = inputTool.readLine();
				else
				{
					result[stageCounter] = currentLine.replace('§', '\n');
					
					currentLine = inputTool.readLine();
					stageCounter++;
				}				
			}
			return result;
		} 
		catch (IOException e)
		{
			System.err.println("Exception during dialog build");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Getter for attribute scenario
	 * @return Scenario The scenario
	 */
	public Scenario getScenario()
	{
		return this.parsedScenario;
	}	
}
