package greentower.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 
 * @author Guillaume
 *
 */
public class InputConsole implements Input
{
	/**
	 * Tool used to input
	 */
	private BufferedReader br;
	
	/**
	 * Default constructor, create an BufferedReader from the standards input
	 */
	public InputConsole()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public int inputInt()
	{
		try
		{	
			return Integer.parseInt(""+br.readLine().charAt(0));
		} catch (IOException e)
		{
			return 2;
		}
	}
	
	@Override
	public char inputChar()
	{
		try
		{
			return br.readLine().charAt(0);
		} catch (IOException e)
		{
			return '\0';
		}
	}
	
	public String inputString()
	{
		try
		{
			return this.br.readLine();
		} catch (IOException e)
		{
			return "";
		}
	}

}
