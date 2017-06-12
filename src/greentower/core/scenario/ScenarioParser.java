package greentower.core.scenario;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * This class is a tool to parse Scenario from file and compose Scenario to file
 *
 */
public final class ScenarioParser
{

	/**
	 * Default constructor
	 */
	public ScenarioParser()
	{}
	
	/**
	 * This method parse a Scenario from the given path
	 * @param path String the path of the scenario to parse
	 * @return Scenario the scenario parsed from the file
	 */
	public static Scenario parseScenarioAt(String path)
	{
		Scenario scenarioToReturn;
		ObjectInputStream objectReader;
		
		try
		{
			objectReader = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(path))));

			try
			{
				scenarioToReturn = (Scenario)objectReader.readObject();
				
				objectReader.close();
				return scenarioToReturn;
			} 
			catch (ClassNotFoundException e)
			{
				System.err.println("Expcetion while reading classfile");
				e.printStackTrace();
			} 
			catch (IOException e)
			{
				System.err.println("IOException");
				e.printStackTrace();
			}
		
		} 
		catch (IOException e1)
		{
			System.err.println("Invalid path");
			e1.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * This method write into a file a Scenario
	 * @param scnenarioToCompose Scenario the scenario to write in a file
	 * @return the path of the file
	 */
	public static String composeScenarioFrom(Scenario scnenarioToCompose)
	{
		
		ObjectOutputStream objectWriter;
		String path = "/bin/scenario.txt";
		
		try
		{
			objectWriter = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(path))));
			
			try
			{
				objectWriter.writeObject(scnenarioToCompose);
				objectWriter.close();
				return path;
			} catch (IOException e)
			{
				System.err.println("Exception while writing object");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e)
		{
			System.err.println("Invalid path");
			e.printStackTrace();
		} catch (IOException e)
		{
			System.err.println("Invalid path");
			e.printStackTrace();
		}
		return path;
	}
	
	
	
}
